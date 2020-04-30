package com.bottle.sample.fpidemicPrevention.dao.impl;

import com.bottle.sample.fpidemicPrevention.dao.TInstitutionInfoDao;
import com.bottle.sample.entity.TInstitutionInfoEntity;
import com.bottle.sample.fpidemicPrevention.dao.mapper.TInstitutionInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * 组织信息
 * dao 的mybatis tk实现
 *
 * @author nyd
 * @email 1627815280@qq.com
 * @date 2020-04-27 10:00:33
 */
@Service
@Primary
public class TInstitutionInfoDaoImpl implements TInstitutionInfoDao {
    @Autowired
    TInstitutionInfoMapper tInstitutionInfoMapper;

    @Override
    public TInstitutionInfoEntity getTInstitutionInfoById(Long id) {
        return tInstitutionInfoMapper.selectByPrimaryKey(id);
    }
}


