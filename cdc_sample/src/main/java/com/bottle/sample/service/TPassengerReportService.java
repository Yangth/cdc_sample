package com.bottle.sample.service;

import com.bottle.sample.entity.TPassengerReportEntity;
import com.bottle.sample.vo.TPassengerReportVo;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author lcd
 * @email 738354121@qq.com
 * @date 2020-04-29 15:53:29
 */
public interface TPassengerReportService {

    List<TPassengerReportEntity> queryPage(TPassengerReportVo params);

    int getCountByCondi(TPassengerReportVo params);

    TPassengerReportEntity getTPassengerReportById(Integer id);

    Map<String, Object> addtPassengerReport(TPassengerReportVo params);

    Map<String, Object> updatetPassengerReport(TPassengerReportVo params);
}

