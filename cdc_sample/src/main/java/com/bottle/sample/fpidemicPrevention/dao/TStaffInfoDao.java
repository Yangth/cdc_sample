package com.bottle.sample.fpidemicPrevention.dao;

import com.bottle.sample.entity.TStaffInfoEntity;

/**
 * 工作人员信息
 * dao设计接口
 * @author nyd
 * @email 1627815280@qq.com
 * @date 2020-04-27 10:00:33
 */
public interface TStaffInfoDao {

	TStaffInfoEntity getTStaffInfoById(Long id);
}
