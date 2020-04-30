package com.bottle.sample.service.impl;

import com.bottle.sample.common.util.AESECBUtil;
import com.bottle.sample.common.util.SecurityCore;
import com.bottle.sample.fpidemicPrevention.dao.TInstitutionInfoDao;
import com.bottle.sample.fpidemicPrevention.dao.TSampleInfoDao;
import com.bottle.sample.fpidemicPrevention.dao.TStaffInfoDao;
import com.bottle.sample.entity.TInstitutionInfoEntity;
import com.bottle.sample.entity.TSampleInfoEntity;
import com.bottle.sample.entity.TStaffInfoEntity;
import com.bottle.sample.service.GetUserInfoService;
import com.bottle.sample.service.TSampleInfoService;
import com.bottle.sample.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Primary
public class TSampleInfoServiceImpl implements TSampleInfoService {

    @Autowired
    private TSampleInfoDao tSampleInfoDao;

    @Autowired
    private GetUserInfoService getUserInfoService;

    @Autowired
    private TStaffInfoDao tStaffInfoDao;

    @Autowired
    private TInstitutionInfoDao tInstitutionInfoDao;

    @Value("${AESECBkey.k1}")
    private String key;
    @Value("${AESECBkey.k2}")
    private String key2;

    SecurityCore securityCore = SecurityCore.getInstance();

    @Override
    public Map<String, Object> queryPage(TSampleInfoListReq params) throws Exception {
        TSampleInfoVo tSampleInfoVo = new TSampleInfoVo();
        BeanUtils.copyProperties(params, tSampleInfoVo);

        String phone = params.getPhone();
        String samplingLocaCode = params.getSamplingLocaCode();

        tSampleInfoVo.setName(securityCore.encrypt(params.getName()));
        String itp = "";
        Integer identityType = params.getIdentityType();
        if (identityType!=null) {
            switch (identityType) {
                case 1:
                    itp = "居民身份证";
                    break;
                case 2:
                    itp = "港澳居民往来内地通行证";
                    break;
                case 3:
                    itp = "台湾居民来往大陆通行证";
                    break;
                case 4:
                    itp = "护照";
                    break;
                case 5:
                    itp = "临时身份证";
                    break;
                case 6:
                    itp = "军官证";
                    break;
                case 7:
                    itp = "其他";
                    break;
            }
        }
        String idType = "";
        if (!StringUtils.isEmpty(itp)) {
            switch (itp) {//这个映射是数政局的，
                case "居民身份证":
                    idType = "1";
                    break;
                case "港澳居民往来内地通行证":
                    idType = "4";
                    break;
                case "台湾居民来往大陆通行证":
                    idType = "5";
                    break;
                case "护照":
                    idType = "6";
                    break;
                case "临时身份证":
                    idType = "2";
                    break;
                case "军官证":
                    idType = "3";
                    break;
                case "其他":
                    idType = "7";
                    break;
            }
        }
        String identity = params.getIdentity();
        if (!StringUtils.isEmpty(identity)&& !StringUtils.isEmpty(idType)) {
            //政府秘传
            String personkey = AESECBUtil.encryptData(idType + "++" +identity, key);
            personkey = AESECBUtil.encryptData(personkey, key2);
            tSampleInfoVo.setPersonKey(personkey);
        }
        String sType = "";
        Integer sampleType = params.getSampleType();
        if (sampleType!=null) {
            switch (sampleType) {
                case 1:
                    sType = "THROAT";
                    break;//"咽拭子";break;
                case 2:
                    sType = "NOSE";
                    break;//鼻拭子";break;
                case 3:
                    sType = "NASOPHARY";
                    break;//"鼻咽拭子";break;
                case 4:
                    sType = "ANAL";
                    break;//"肛拭子";break;
                case 5:
                    sType = "SPUTUM";
                    break;//"痰液";break;
                case 6:
                    sType = "BALF";
                    break;//"肺泡灌洗液";break;
                case 7:
                    sType = "BLOOD";
                    break;//"血液";break;
            }
        }
        tSampleInfoVo.setSampleType(sType);
        String cres = "";
        Integer testResult = params.getTestResult();
        if (testResult!=null) {
            switch (testResult) {
                case 1:
                    cres = "POSITIVE";
                    break;
                case 2:
                    cres = "NEGATIVE";
                    break;
                case 3:
                    cres = "SUSPECTED";
                    break;
                case 4:
                    cres = "RESEND";
                    break;
            }
        }
        tSampleInfoVo.setTestResult(cres);

        List<TSampleInfoEntity> tSampleInfoByCondi = tSampleInfoDao.getTSampleInfoByCondi(tSampleInfoVo);
        List<TSampleInfoListResp> tSampleInfoListResps = new ArrayList<>();
        for (TSampleInfoEntity t : tSampleInfoByCondi) {
            TSampleInfoListResp tSampleInfoListResp = new TSampleInfoListResp();
            tSampleInfoListResp.setId(t.getId());
            tSampleInfoListResp.setName(securityCore.decrypt(t.getName()));
            Map<String, Object> userInfo = getUserInfoService.getUserInfo(t.getPersonKey());
            tSampleInfoListResp.setIdentityType((String) userInfo.get("identityType"));
            tSampleInfoListResp.setIdentity((String) userInfo.get("identity"));
            tSampleInfoListResp.setUserId((String) userInfo.get("id"));
            tSampleInfoListResp.setGender((String) userInfo.get("gender"));
            tSampleInfoListResp.setBirthday((String) userInfo.get("birthday"));
            tSampleInfoListResp.setPhone((String) userInfo.get("phone"));

            tSampleInfoListResp.setSamplingLoca("");
            tSampleInfoListResp.setRoleType("");

            TInstitutionInfoEntity tInstitutionInfoById = tInstitutionInfoDao.getTInstitutionInfoById(t.getSampleInstitutionId());
            tSampleInfoListResp.setSampleInstitution(tInstitutionInfoById!=null?tInstitutionInfoById.getName():"");
            String sampleStaffId = t.getSampleStaffId();
            if (!StringUtils.isEmpty(sampleStaffId)) {
                TStaffInfoEntity tStaffInfoById = tStaffInfoDao.getTStaffInfoById(Long.getLong(sampleStaffId));
                tSampleInfoListResp.setSampleStaff(tStaffInfoById!=null?tStaffInfoById.getName():"");
            }

            TInstitutionInfoEntity tInstitutionInfoById1 = tInstitutionInfoDao.getTInstitutionInfoById(t.getTestInstitutionId());
            tSampleInfoListResp.setTestInstitution(tInstitutionInfoById1!=null?tInstitutionInfoById1.getName():"");
            tSampleInfoListResp.setTestTime(t.getTestTime());
            String sType1 = "";
            String sampleType1 = t.getSampleType();
            if (sampleType1!=null) {
                switch (sampleType1) {
                    case "THROAT":
                        sType1 = "咽拭子";
                        break;//"咽拭子";break;
                    case "NOSE":
                        sType1 = "鼻拭子";
                        break;//鼻拭子";break;
                    case "NASOPHARY":
                        sType1 = "鼻咽拭子";
                        break;//"鼻咽拭子";break;
                    case "ANAL":
                        sType1 = "肛拭子";
                        break;//"肛拭子";break;
                    case "SPUTUM":
                        sType1 = "痰液";
                        break;//"痰液";break;
                    case "BALF":
                        sType1 = "肺泡灌洗液";
                        break;//"肺泡灌洗液";break;
                    case "BLOOD":
                        sType1 = "血液";
                        break;//"血液";break;
                }
            }
            tSampleInfoListResp.setSampleType(sType1);
            String cres1 = "";
            String testResult1 = t.getTestResult();
            if (testResult1!=null) {
                switch (testResult1) {
                    case "POSITIVE":
                        cres1 = "阳性";
                        break;
                    case "NEGATIVE":
                        cres1 = "阴性";
                        break;
                    case "SUSPECTED":
                        cres1 = "疑似";
                        break;
                    case "RESEND":
                        cres1 = "初筛阳性";
                        break;
                }
            }
            tSampleInfoListResp.setTestResult(cres1);
            tSampleInfoListResp.setSampleCode(t.getSampleCode());
            tSampleInfoListResp.setSampleTime(t.getSampleTime());
            tSampleInfoListResps.add(tSampleInfoListResp);
        }
        Map<String, Object> res = new HashMap<>();
        res.put("code" , 200);
        res.put("message" , "ok");
        res.put("data" , tSampleInfoListResps);
        return res;
    }

    @Override
    public int getCountByCondi(TSampleInfoListReq params) throws Exception {
        TSampleInfoVo tSampleInfoVo = new TSampleInfoVo();
        BeanUtils.copyProperties(params, tSampleInfoVo);
        tSampleInfoVo.setName(securityCore.encrypt(params.getName()));
        String itp = "";
        Integer identityType = params.getIdentityType();
        if (identityType!=null) {
            switch (identityType) {
                case 1:
                    itp = "居民身份证";
                    break;
                case 2:
                    itp = "港澳居民往来内地通行证";
                    break;
                case 3:
                    itp = "台湾居民来往大陆通行证";
                    break;
                case 4:
                    itp = "护照";
                    break;
                case 5:
                    itp = "临时身份证";
                    break;
                case 6:
                    itp = "军官证";
                    break;
                case 7:
                    itp = "其他";
                    break;
            }
        }
        String idType = "";
        if (!StringUtils.isEmpty(itp)) {
            switch (itp) {//这个映射是数政局的，
                case "居民身份证":
                    idType = "1";
                    break;
                case "港澳居民往来内地通行证":
                    idType = "4";
                    break;
                case "台湾居民来往大陆通行证":
                    idType = "5";
                    break;
                case "护照":
                    idType = "6";
                    break;
                case "临时身份证":
                    idType = "2";
                    break;
                case "军官证":
                    idType = "3";
                    break;
                case "其他":
                    idType = "7";
                    break;
            }
        }
        String identity = params.getIdentity();
        if (!StringUtils.isEmpty(identity)&& !StringUtils.isEmpty(idType)) {
            //政府秘传
            String personkey = AESECBUtil.encryptData(idType + "++" +identity, key);
            personkey = AESECBUtil.encryptData(personkey, key2);
            tSampleInfoVo.setPersonKey(personkey);
        }
        String sType = "";
        Integer sampleType = params.getSampleType();
        if (sampleType!=null) {
            switch (sampleType) {
                case 1:
                    sType = "THROAT";
                    break;//"咽拭子";break;
                case 2:
                    sType = "NOSE";
                    break;//鼻拭子";break;
                case 3:
                    sType = "NASOPHARY";
                    break;//"鼻咽拭子";break;
                case 4:
                    sType = "ANAL";
                    break;//"肛拭子";break;
                case 5:
                    sType = "SPUTUM";
                    break;//"痰液";break;
                case 6:
                    sType = "BALF";
                    break;//"肺泡灌洗液";break;
                case 7:
                    sType = "BLOOD";
                    break;//"血液";break;
            }
        }
        tSampleInfoVo.setSampleType(sType);
        String cres = "";
        Integer testResult = params.getTestResult();
        if (testResult!=null) {
            switch (testResult) {
                case 1:
                    cres = "POSITIVE";
                    break;
                case 2:
                    cres = "NEGATIVE";
                    break;
                case 3:
                    cres = "SUSPECTED";
                    break;
                case 4:
                    cres = "RESEND";
                    break;
            }
        }
        tSampleInfoVo.setTestResult(cres);

        return tSampleInfoDao.getCountByCondi(tSampleInfoVo);
    }

    @Override
    public Map<String, Object> getTSampleInfoById(Long id) throws Exception {

        TSampleInfoEntity t = tSampleInfoDao.getTSampleInfoById(id);
        TSampleInfoDetailsResp tSampleInfoDetailsResp = new TSampleInfoDetailsResp();
        BeanUtils.copyProperties(t, tSampleInfoDetailsResp);
        tSampleInfoDetailsResp.setName(securityCore.decrypt(t.getName()));
        Map<String, Object> userInfo = getUserInfoService.getUserInfo(t.getPersonKey());
        tSampleInfoDetailsResp.setIdentityType((String) userInfo.get("identityType"));
        tSampleInfoDetailsResp.setIdentity((String) userInfo.get("identity"));
        tSampleInfoDetailsResp.setGender((String) userInfo.get("gender"));
        tSampleInfoDetailsResp.setBirthday((String) userInfo.get("birthday"));
        tSampleInfoDetailsResp.setPhone((String) userInfo.get("phone"));

        tSampleInfoDetailsResp.setRoleType("");
        tSampleInfoDetailsResp.setAddress((String) userInfo.get("address"));
        tSampleInfoDetailsResp.setSamplingLoca("");

        //采样信息
        TInstitutionInfoEntity tInstitutionInfoById = tInstitutionInfoDao.getTInstitutionInfoById(t.getSampleInstitutionId());
        tSampleInfoDetailsResp.setSampleInstitution(tInstitutionInfoById.getName());
        TStaffInfoEntity tStaffInfoById = tStaffInfoDao.getTStaffInfoById(Long.getLong(t.getSampleStaffId()));
        tSampleInfoDetailsResp.setSampleStaff(tStaffInfoById.getName());
        //检验信息
        TInstitutionInfoEntity tInstitutionInfoById1 = tInstitutionInfoDao.getTInstitutionInfoById(t.getTestInstitutionId());
        tSampleInfoDetailsResp.setTestInstitution(tInstitutionInfoById1.getName());
        TStaffInfoEntity tStaffInfoById1 = tStaffInfoDao.getTStaffInfoById(Long.getLong(t.getTestStaffId()));
        tSampleInfoDetailsResp.setTestStaff(tStaffInfoById1.getName());

        int sType = 0;
        String sampleType = t.getSampleType();
        if (sampleType!=null) {
            switch (sampleType) {
                case "THROAT":
                    sType = 1;
                    break;//"咽拭子";break;
                case "NOSE":
                    sType = 2;
                    break;//鼻拭子";break;
                case "NASOPHARY":
                    sType = 3;
                    break;//"鼻咽拭子";break;
                case "ANAL":
                    sType = 4;
                    break;//"肛拭子";break;
                case "SPUTUM":
                    sType = 5;
                    break;//"痰液";break;
                case "BALF":
                    sType = 6;
                    break;//"肺泡灌洗液";break;
                case "BLOOD":
                    sType = 7;
                    break;//"血液";break;
            }
        }
        tSampleInfoDetailsResp.setSampleType(sType);
        int cres = 0;
        String testResult = t.getTestResult();
        if (testResult!=null) {
            switch (testResult) {
                case "POSITIVE":
                    cres = 1;
                    break;
                case "NEGATIVE":
                    cres = 2;
                    break;
                case "SUSPECTED":
                    cres = 3;
                    break;
                case "RESEND":
                    cres = 4;
                    break;
            }
        }
        tSampleInfoDetailsResp.setTestResult(cres);
        Map<String, Object> res = new HashMap<>();
        res.put("code" , 200);
        res.put("message" , "ok");
        res.put("data" , tSampleInfoDetailsResp);
        return res;
    }

    @Override
    public Map<String, Object> updatetSampleInfo(TSampleInfoUpdReq req) {
        TSampleInfoEntity tSampleInfoById = tSampleInfoDao.getTSampleInfoById(req.getId());
        tSampleInfoById.setAdoptTime(req.getAdoptTime());
        tSampleInfoById.setTestTime(req.getTestTime());
        String sType = "";
        Integer sampleType = req.getSampleType();
        if (sampleType!=null) {
            switch (sampleType) {
                case 1:
                    sType = "THROAT";
                    break;//"咽拭子";break;
                case 2:
                    sType = "NOSE";
                    break;//鼻拭子";break;
                case 3:
                    sType = "NASOPHARY";
                    break;//"鼻咽拭子";break;
                case 4:
                    sType = "ANAL";
                    break;//"肛拭子";break;
                case 5:
                    sType = "SPUTUM";
                    break;//"痰液";break;
                case 6:
                    sType = "BALF";
                    break;//"肺泡灌洗液";break;
                case 7:
                    sType = "BLOOD";
                    break;//"血液";break;
            }
        }
        tSampleInfoById.setSampleType(sType);
        String cres = "";
        Integer testResult = req.getTestResult();
        if (testResult!=null) {
            switch (testResult) {
                case 1:
                    cres = "POSITIVE";
                    break;
                case 2:
                    cres = "NEGATIVE";
                    break;
                case 3:
                    cres = "SUSPECTED";
                    break;
                case 4:
                    cres = "RESEND";
                    break;
            }
        }
        tSampleInfoById.setTestResult(cres);
        tSampleInfoById.setCt(req.getCt());
        tSampleInfoById.setTestBox(req.getTestBox());
        int updateCode = tSampleInfoDao.UpdatetSampleInfo(tSampleInfoById);
        Map<String, Object> res = new HashMap<>();
        if (updateCode < 1) {
            res.put("code" , 500);
            res.put("message" , "更新失败");
            return res;
        }
        res.put("code" , 200);
        res.put("message" , "ok");
        return res;
    }

    @Override
    public Map<String, Object> batchUpdNegative(List<Long> ids) {
        int batchCode = tSampleInfoDao.batchUpdNegative(ids);
        Map<String, Object> res = new HashMap<>();
        if (batchCode < 1) {
            res.put("code" , 500);
            res.put("message" , "批量置阴失败");
            return res;
        }
        res.put("code" , 200);
        res.put("message" , "ok");
        return res;
    }

    ;
}