package com.bottle.sample.fpidemicPrevention.dao.impl;

import com.bottle.sample.fpidemicPrevention.dao.TStaffInfoDao;
import com.bottle.sample.fpidemicPrevention.dao.mapper.TStaffInfoMapper;
import com.bottle.sample.entity.TStaffInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * 工作人员信息
 * dao 的mybatis tk实现
 *
 * @author nyd
 * @email 1627815280@qq.com
 * @date 2020-04-27 10:00:33
 */
@Service
@Primary
public class TStaffInfoDaoImpl implements TStaffInfoDao {
    @Autowired
    TStaffInfoMapper tStaffInfoMapper;

    @Override
    public TStaffInfoEntity getTStaffInfoById(Long id) {
        return tStaffInfoMapper.selectByPrimaryKey(id);
    }
}


