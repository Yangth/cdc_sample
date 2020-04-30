//package com.bottle.sample.passengerReport.dao.impl;
//
//import com.bottle.sample.passengerReport.dao.TPassengerReportDao;
//import com.bottle.sample.entity.TPassengerReportEntity;
//import com.bottle.sample.passengerReport.dao.mapper.TPassengerReportMapperDao;
//import com.bottle.sample.vo.TPassengerReportVo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Service;
//import tk.mybatis.mapper.entity.Example;
//import com.github.pagehelper.PageHelper;
//import org.springframework.beans.BeanUtils;
//
//import java.util.List;
//
///**
// * dao 的mybatis tk实现
// *
// * @author lcd
// * @email 738354121@qq.com
// * @date 2020-04-29 15:53:29
// */
//@Service
//@Primary
//public class TPassengerReportDaoImpl implements TPassengerReportDao {
//    @Autowired
//    TPassengerReportMapperDao tPassengerReportMapper;
//
//    @Override
//    public List<TPassengerReportEntity> queryPage(TPassengerReportVo vo) {
//
//        Example example = new Example(TPassengerReportEntity.class);
//        Example.Criteria criteria = example.createCriteria();
//        if (vo.getId() != null && vo.getId().intValue() != 0) {
//            criteria.andEqualTo("id" , vo.getId());
//        }
//        if (vo.getOid() != null) {
//            criteria.andEqualTo("oid" , vo.getOid());
//        }
//        if (vo.getAppId() != null) {
//            criteria.andEqualTo("appId" , vo.getAppId());
//        }
//        if (vo.getUid() != null && vo.getUid().intValue() != 0) {
//            criteria.andEqualTo("uid" , vo.getUid());
//        }
//        if (vo.getUsername() != null) {
//            criteria.andEqualTo("username" , vo.getUsername());
//        }
//        if (vo.getPhone() != null) {
//            criteria.andEqualTo("phone" , vo.getPhone());
//        }
//        if (vo.getGender() != null) {
//            criteria.andEqualTo("gender" , vo.getGender());
//        }
//        if (vo.getBirthday() != null) {
//            criteria.andEqualTo("birthday" , vo.getBirthday());
//        }
//        if (vo.getIdentityType() != null && vo.getIdentityType() != 0) {
//            criteria.andEqualTo("identityType" , vo.getIdentityType());
//        }
//        if (vo.getIdentity() != null) {
//            criteria.andEqualTo("identity" , vo.getIdentity());
//        }
//        if (vo.getCity() != null) {
//            criteria.andEqualTo("city" , vo.getCity());
//        }
//        if (vo.getCityCode() != null) {
//            criteria.andEqualTo("cityCode" , vo.getCityCode());
//        }
//        if (vo.getArea() != null) {
//            criteria.andEqualTo("area" , vo.getArea());
//        }
//        if (vo.getAreacode() != null) {
//            criteria.andEqualTo("areacode" , vo.getAreacode());
//        }
//        if (vo.getStreet() != null) {
//            criteria.andEqualTo("street" , vo.getStreet());
//        }
//        if (vo.getStreetCode() != null) {
//            criteria.andEqualTo("streetCode" , vo.getStreetCode());
//        }
//        if (vo.getCommunity() != null) {
//            criteria.andEqualTo("community" , vo.getCommunity());
//        }
//        if (vo.getCommunityCode() != null) {
//            criteria.andEqualTo("communityCode" , vo.getCommunityCode());
//        }
//        if (vo.getAddress() != null) {
//            criteria.andEqualTo("address" , vo.getAddress());
//        }
//        if (vo.getSymptom() != null) {
//            criteria.andEqualTo("symptom" , vo.getSymptom());
//        }
//        if (vo.getLivingType() != null && vo.getLivingType() != 0) {
//            criteria.andEqualTo("livingType" , vo.getLivingType());
//        }
//        if (vo.getCreateTime() != null) {
//            criteria.andEqualTo("createTime" , vo.getCreateTime());
//        }
//        if (vo.getIfHelp() != null && vo.getIfHelp() != 0) {
//            criteria.andEqualTo("ifHelp" , vo.getIfHelp());
//        }
//        if (vo.getCollectorType() != null && vo.getCollectorType() != 0) {
//            criteria.andEqualTo("collectorType" , vo.getCollectorType());
//        }
//        if (vo.getTemperature() != null && vo.getTemperature() != 0) {
//            criteria.andEqualTo("temperature" , vo.getTemperature());
//        }
//        if (vo.getHospitalCheck() != null && vo.getHospitalCheck() != 0) {
//            criteria.andEqualTo("hospitalCheck" , vo.getHospitalCheck());
//        }
//        if (vo.getSymptomDscr() != null) {
//            criteria.andEqualTo("symptomDscr" , vo.getSymptomDscr());
//        }
//        if (vo.getPersonType() != null && vo.getPersonType() != 0) {
//            criteria.andEqualTo("personType" , vo.getPersonType());
//        }
//        if (vo.getQuarantineCheck() != null && vo.getQuarantineCheck() != 0) {
//            criteria.andEqualTo("quarantineCheck" , vo.getQuarantineCheck());
//        }
//        if (vo.getSocialCreditId() != null) {
//            criteria.andEqualTo("socialCreditId" , vo.getSocialCreditId());
//        }
//        if (vo.getCompany() != null) {
//            criteria.andEqualTo("company" , vo.getCompany());
//        }
//        if (vo.getCurrentLocation() != null) {
//            criteria.andEqualTo("currentLocation" , vo.getCurrentLocation());
//        }
//        if (vo.getCurrentLocationCode() != null) {
//            criteria.andEqualTo("currentLocationCode" , vo.getCurrentLocationCode());
//        }
//        if (vo.getVersion() != null) {
//            criteria.andEqualTo("version" , vo.getVersion());
//        }
//        if (vo.getDataFrom() != null && vo.getDataFrom() != 0) {
//            criteria.andEqualTo("dataFrom" , vo.getDataFrom());
//        }
//        if (vo.getCode() != null) {
//            criteria.andEqualTo("code" , vo.getCode());
//        }
//        if (vo.getVillage() != null) {
//            criteria.andEqualTo("village" , vo.getVillage());
//        }
//        if (vo.getIfLivingSz() != null && vo.getIfLivingSz() != 0) {
//            criteria.andEqualTo("ifLivingSz" , vo.getIfLivingSz());
//        }
//        if (vo.getIfWorkingSz() != null && vo.getIfWorkingSz() != 0) {
//            criteria.andEqualTo("ifWorkingSz" , vo.getIfWorkingSz());
//        }
//        if (vo.getHospitalCheckResult() != null && vo.getHospitalCheckResult() != 0) {
//            criteria.andEqualTo("hospitalCheckResult" , vo.getHospitalCheckResult());
//        }
//        if (vo.getIfEnter() != null && vo.getIfEnter() != 0) {
//            criteria.andEqualTo("ifEnter" , vo.getIfEnter());
//        }
//        if (vo.getPersonKey() != null) {
//            criteria.andEqualTo("personKey" , vo.getPersonKey());
//        }
//        PageHelper.offsetPage(vo.getPageNo() == null ? 1 : vo.getPageNo(), vo.getPageSize() == null ? 10 : vo.getPageSize());
//        return tPassengerReportMapper.selectByExample(example);
//    }
//
//    @Override
//    public int getCountByCondi(TPassengerReportVo vo) {
//
//        Example example = new Example(TPassengerReportEntity.class);
//        Example.Criteria criteria = example.createCriteria();
//        if (vo.getId() != null && vo.getId().intValue() != 0) {
//            criteria.andEqualTo("id" , vo.getId());
//        }
//        if (vo.getOid() != null) {
//            criteria.andEqualTo("oid" , vo.getOid());
//        }
//        if (vo.getAppId() != null) {
//            criteria.andEqualTo("appId" , vo.getAppId());
//        }
//        if (vo.getUid() != null && vo.getUid().intValue() != 0) {
//            criteria.andEqualTo("uid" , vo.getUid());
//        }
//        if (vo.getUsername() != null) {
//            criteria.andEqualTo("username" , vo.getUsername());
//        }
//        if (vo.getPhone() != null) {
//            criteria.andEqualTo("phone" , vo.getPhone());
//        }
//        if (vo.getGender() != null) {
//            criteria.andEqualTo("gender" , vo.getGender());
//        }
//        if (vo.getBirthday() != null) {
//            criteria.andEqualTo("birthday" , vo.getBirthday());
//        }
//        if (vo.getIdentityType() != null && vo.getIdentityType() != 0) {
//            criteria.andEqualTo("identityType" , vo.getIdentityType());
//        }
//        if (vo.getIdentity() != null) {
//            criteria.andEqualTo("identity" , vo.getIdentity());
//        }
//        if (vo.getCity() != null) {
//            criteria.andEqualTo("city" , vo.getCity());
//        }
//        if (vo.getCityCode() != null) {
//            criteria.andEqualTo("cityCode" , vo.getCityCode());
//        }
//        if (vo.getArea() != null) {
//            criteria.andEqualTo("area" , vo.getArea());
//        }
//        if (vo.getAreacode() != null) {
//            criteria.andEqualTo("areacode" , vo.getAreacode());
//        }
//        if (vo.getStreet() != null) {
//            criteria.andEqualTo("street" , vo.getStreet());
//        }
//        if (vo.getStreetCode() != null) {
//            criteria.andEqualTo("streetCode" , vo.getStreetCode());
//        }
//        if (vo.getCommunity() != null) {
//            criteria.andEqualTo("community" , vo.getCommunity());
//        }
//        if (vo.getCommunityCode() != null) {
//            criteria.andEqualTo("communityCode" , vo.getCommunityCode());
//        }
//        if (vo.getAddress() != null) {
//            criteria.andEqualTo("address" , vo.getAddress());
//        }
//        if (vo.getSymptom() != null) {
//            criteria.andEqualTo("symptom" , vo.getSymptom());
//        }
//        if (vo.getLivingType() != null && vo.getLivingType() != 0) {
//            criteria.andEqualTo("livingType" , vo.getLivingType());
//        }
//        if (vo.getCreateTime() != null) {
//            criteria.andEqualTo("createTime" , vo.getCreateTime());
//        }
//        if (vo.getIfHelp() != null && vo.getIfHelp() != 0) {
//            criteria.andEqualTo("ifHelp" , vo.getIfHelp());
//        }
//        if (vo.getCollectorType() != null && vo.getCollectorType() != 0) {
//            criteria.andEqualTo("collectorType" , vo.getCollectorType());
//        }
//        if (vo.getTemperature() != null && vo.getTemperature() != 0) {
//            criteria.andEqualTo("temperature" , vo.getTemperature());
//        }
//        if (vo.getHospitalCheck() != null && vo.getHospitalCheck() != 0) {
//            criteria.andEqualTo("hospitalCheck" , vo.getHospitalCheck());
//        }
//        if (vo.getSymptomDscr() != null) {
//            criteria.andEqualTo("symptomDscr" , vo.getSymptomDscr());
//        }
//        if (vo.getPersonType() != null && vo.getPersonType() != 0) {
//            criteria.andEqualTo("personType" , vo.getPersonType());
//        }
//        if (vo.getQuarantineCheck() != null && vo.getQuarantineCheck() != 0) {
//            criteria.andEqualTo("quarantineCheck" , vo.getQuarantineCheck());
//        }
//        if (vo.getSocialCreditId() != null) {
//            criteria.andEqualTo("socialCreditId" , vo.getSocialCreditId());
//        }
//        if (vo.getCompany() != null) {
//            criteria.andEqualTo("company" , vo.getCompany());
//        }
//        if (vo.getCurrentLocation() != null) {
//            criteria.andEqualTo("currentLocation" , vo.getCurrentLocation());
//        }
//        if (vo.getCurrentLocationCode() != null) {
//            criteria.andEqualTo("currentLocationCode" , vo.getCurrentLocationCode());
//        }
//        if (vo.getVersion() != null) {
//            criteria.andEqualTo("version" , vo.getVersion());
//        }
//        if (vo.getDataFrom() != null && vo.getDataFrom() != 0) {
//            criteria.andEqualTo("dataFrom" , vo.getDataFrom());
//        }
//        if (vo.getCode() != null) {
//            criteria.andEqualTo("code" , vo.getCode());
//        }
//        if (vo.getVillage() != null) {
//            criteria.andEqualTo("village" , vo.getVillage());
//        }
//        if (vo.getIfLivingSz() != null && vo.getIfLivingSz() != 0) {
//            criteria.andEqualTo("ifLivingSz" , vo.getIfLivingSz());
//        }
//        if (vo.getIfWorkingSz() != null && vo.getIfWorkingSz() != 0) {
//            criteria.andEqualTo("ifWorkingSz" , vo.getIfWorkingSz());
//        }
//        if (vo.getHospitalCheckResult() != null && vo.getHospitalCheckResult() != 0) {
//            criteria.andEqualTo("hospitalCheckResult" , vo.getHospitalCheckResult());
//        }
//        if (vo.getIfEnter() != null && vo.getIfEnter() != 0) {
//            criteria.andEqualTo("ifEnter" , vo.getIfEnter());
//        }
//        if (vo.getPersonKey() != null) {
//            criteria.andEqualTo("personKey" , vo.getPersonKey());
//        }
//        return tPassengerReportMapper.selectCountByExample(example);
//    }
//
//    @Override
//    public TPassengerReportEntity getTPassengerReportById(Integer id) {
//        return tPassengerReportMapper.selectByPrimaryKey(id);
//    }
//
//    @Override
//    public int addtPassengerReport(TPassengerReportVo params) {
//        TPassengerReportEntity entity = new TPassengerReportEntity();
//        BeanUtils.copyProperties(params, entity);
//        return tPassengerReportMapper.insert(entity);
//    }
//
//    @Override
//    public int UpdatetPassengerReport(TPassengerReportVo params) {
//        TPassengerReportEntity entity = new TPassengerReportEntity();
//        BeanUtils.copyProperties(params, entity);
//        return tPassengerReportMapper.updateByPrimaryKeySelective(entity);
//    }
//}
//
//
