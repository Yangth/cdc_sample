package com.bottle.sample.service;

import com.bottle.sample.vo.TSampleInfoListReq;
import com.bottle.sample.vo.TSampleInfoUpdReq;

import java.util.List;
import java.util.Map;

/**
 * 采样信息
 *
 * @author nyd
 * @email 1627815280@qq.com
 * @date 2020-04-27 10:00:33
 */
public interface TSampleInfoService  {

    Map<String, Object> queryPage(TSampleInfoListReq params) throws Exception;

    int getCountByCondi(TSampleInfoListReq params) throws Exception;

    Map<String, Object> getTSampleInfoById(Long id) throws Exception;

    Map<String, Object> updatetSampleInfo(TSampleInfoUpdReq params);

    Map<String, Object> batchUpdNegative(List<Long> ids);
}

