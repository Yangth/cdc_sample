package com.bottle.sample.fpidemicPrevention.dao.impl;

import java.util.List;

import com.bottle.sample.fpidemicPrevention.dao.TSampleInfoDao;
import com.bottle.sample.fpidemicPrevention.dao.mapper.TSampleInfoMapper;
import com.bottle.sample.entity.TSampleInfoEntity;
import com.bottle.sample.vo.TSampleInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;
import com.github.pagehelper.PageHelper;

/**
 * 采样信息
 * dao 的mybatis tk实现
 *
 * @author nyd
 * @email 1627815280@qq.com
 * @date 2020-04-27 10:00:33
 */
@Service
@Primary
public class TSampleInfoDaoImpl implements TSampleInfoDao {
    @Autowired
    TSampleInfoMapper tSampleInfoMapper;

    @Override
    public List<TSampleInfoEntity> getTSampleInfoByCondi(TSampleInfoVo vo) {
        Example example = new Example(TSampleInfoEntity.class);
        Example.Criteria criteria = example.createCriteria();
        if (vo.getId() != null && vo.getId().intValue() != 0) {
            criteria.andEqualTo("id" , vo.getId());
        }
        if (vo.getPersonKey() != null) {
            criteria.andEqualTo("personKey" , vo.getPersonKey());
        }
        if (vo.getSampleCode() != null) {
            criteria.andEqualTo("sampleCode" , vo.getSampleCode());
        }
        if (!StringUtils.isEmpty(vo.getSampleType())) {
            criteria.andEqualTo("sampleType" , vo.getSampleType());
        }
        if (vo.getSampleStaffId() != null) {
            criteria.andEqualTo("sampleStaffId" , vo.getSampleStaffId());
        }
        if (vo.getSampleInstitutionId() != null && vo.getSampleInstitutionId().intValue() != 0) {
            criteria.andEqualTo("sampleInstitutionId" , vo.getSampleInstitutionId());
        }
        if (vo.getSampleTime() != null) {
            criteria.andEqualTo("sampleTime" , vo.getSampleTime());
        }
        if (vo.getTestStatus() != null) {
            criteria.andEqualTo("testStatus" , vo.getTestStatus());
        }
        if (vo.getTestInstitutionId() != null && vo.getTestInstitutionId().intValue() != 0) {
            criteria.andEqualTo("testInstitutionId" , vo.getTestInstitutionId());
        }
        if (vo.getAdoptTime() != null) {
            criteria.andEqualTo("adoptTime" , vo.getAdoptTime());
        }
        if (vo.getTestTime() != null) {
            criteria.andEqualTo("testTime" , vo.getTestTime());
        }
        if (vo.getCt() != null) {
            criteria.andEqualTo("ct" , vo.getCt());
        }
        if (vo.getTestBox() != null) {
            criteria.andEqualTo("testBox" , vo.getTestBox());
        }
        if (vo.getTestStaffId() != null) {
            criteria.andEqualTo("testStaffId" , vo.getTestStaffId());
        }
        if (!StringUtils.isEmpty(vo.getTestResult())) {
            criteria.andEqualTo("testResult" , vo.getTestResult());
        }
        if (vo.getSubmitTestTime() != null) {
            criteria.andEqualTo("submitTestTime" , vo.getSubmitTestTime());
        }
        if (vo.getIsDeleted() != null && vo.getIsDeleted() != 0) {
            criteria.andEqualTo("isDeleted" , vo.getIsDeleted());
        }
        if (vo.getName() != null) {
            criteria.andEqualTo("name" , vo.getName());
        }
        if (vo.getCreateTime() != null) {
            criteria.andEqualTo("createTime" , vo.getCreateTime());
        }
        PageHelper.offsetPage(vo.getPageNo() == null ? 1 : vo.getPageNo(), vo.getPageSize() == null ? 10 : vo.getPageSize());
        return tSampleInfoMapper.selectByExample(example);
    }

    @Override
    public int getCountByCondi(TSampleInfoVo vo) {
        Example example = new Example(TSampleInfoEntity.class);
        Example.Criteria criteria = example.createCriteria();
        if (vo.getId() != null && vo.getId().intValue() != 0) {
            criteria.andEqualTo("id" , vo.getId());
        }
        if (vo.getPersonKey() != null) {
            criteria.andEqualTo("personKey" , vo.getPersonKey());
        }
        if (vo.getSampleCode() != null) {
            criteria.andEqualTo("sampleCode" , vo.getSampleCode());
        }
        if (!StringUtils.isEmpty(vo.getSampleType())) {
            criteria.andEqualTo("sampleType" , vo.getSampleType());
        }
        if (vo.getSampleStaffId() != null) {
            criteria.andEqualTo("sampleStaffId" , vo.getSampleStaffId());
        }
        if (vo.getSampleInstitutionId() != null && vo.getSampleInstitutionId().intValue() != 0) {
            criteria.andEqualTo("sampleInstitutionId" , vo.getSampleInstitutionId());
        }
        if (vo.getSampleTime() != null) {
            criteria.andEqualTo("sampleTime" , vo.getSampleTime());
        }
        if (vo.getTestStatus() != null) {
            criteria.andEqualTo("testStatus" , vo.getTestStatus());
        }
        if (vo.getTestInstitutionId() != null && vo.getTestInstitutionId().intValue() != 0) {
            criteria.andEqualTo("testInstitutionId" , vo.getTestInstitutionId());
        }
        if (vo.getAdoptTime() != null) {
            criteria.andEqualTo("adoptTime" , vo.getAdoptTime());
        }
        if (vo.getTestTime() != null) {
            criteria.andEqualTo("testTime" , vo.getTestTime());
        }
        if (vo.getCt() != null) {
            criteria.andEqualTo("ct" , vo.getCt());
        }
        if (vo.getTestBox() != null) {
            criteria.andEqualTo("testBox" , vo.getTestBox());
        }
        if (vo.getTestStaffId() != null) {
            criteria.andEqualTo("testStaffId" , vo.getTestStaffId());
        }
        if (!StringUtils.isEmpty(vo.getTestResult())) {
            criteria.andEqualTo("testResult" , vo.getTestResult());
        }
        if (vo.getSubmitTestTime() != null) {
            criteria.andEqualTo("submitTestTime" , vo.getSubmitTestTime());
        }
        if (vo.getIsDeleted() != null && vo.getIsDeleted() != 0) {
            criteria.andEqualTo("isDeleted" , vo.getIsDeleted());
        }
        if (vo.getName() != null) {
            criteria.andEqualTo("name" , vo.getName());
        }
        if (vo.getCreateTime() != null) {
            criteria.andEqualTo("createTime" , vo.getCreateTime());
        }
        return tSampleInfoMapper.selectCountByExample(example);
    }

    @Override
    public TSampleInfoEntity getTSampleInfoById(Long id) {
        return tSampleInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addtSampleInfo(TSampleInfoEntity params) {
        return tSampleInfoMapper.insert(params);
    }

    @Override
    public int UpdatetSampleInfo(TSampleInfoEntity params) {
        return tSampleInfoMapper.updateByPrimaryKeySelective(params);
    }

    @Override
    @Transactional
    public int batchUpdNegative(List<Long> ids) {
        int batchCode = 0;
        if (ids != null) {
            for (Long id : ids) {
                TSampleInfoEntity entity = new TSampleInfoEntity();
                entity.setId(id);
                entity.setTestResult("NEGATIVE");
                int updateCode = tSampleInfoMapper.updateByPrimaryKeySelective(entity);
                if (updateCode < 1) {
                    TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                    ;
                    return 0;
                }
                batchCode += updateCode;
            }
        }

        return batchCode;
    }
}


