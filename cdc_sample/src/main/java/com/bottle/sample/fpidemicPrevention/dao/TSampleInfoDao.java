package com.bottle.sample.fpidemicPrevention.dao;

import com.bottle.sample.entity.TSampleInfoEntity;
import com.bottle.sample.vo.TSampleInfoVo;

import java.util.List;

/**
 * 采样信息
 * dao设计接口
 * @author nyd
 * @email 1627815280@qq.com
 * @date 2020-04-27 10:00:33
 */
public interface TSampleInfoDao {
	List<TSampleInfoEntity> getTSampleInfoByCondi(TSampleInfoVo vo);

	int getCountByCondi(TSampleInfoVo params);

	TSampleInfoEntity getTSampleInfoById(Long id);

	int addtSampleInfo(TSampleInfoEntity params);

	int UpdatetSampleInfo(TSampleInfoEntity params);

	int batchUpdNegative(List<Long> ids);
}
