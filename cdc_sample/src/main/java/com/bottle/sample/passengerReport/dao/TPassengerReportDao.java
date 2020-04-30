package com.bottle.sample.passengerReport.dao;

import com.bottle.sample.entity.TPassengerReportEntity;
import com.bottle.sample.vo.TPassengerReportVo;
import java.util.List;

/**
 * 
 * dao设计接口
 * @author lcd
 * @email 738354121@qq.com
 * @date 2020-04-29 15:53:29
 */
public interface TPassengerReportDao {

	List<TPassengerReportEntity> queryPage(TPassengerReportVo vo);

	int getCountByCondi(TPassengerReportVo params);

	TPassengerReportEntity getTPassengerReportById(Integer id);

	int addtPassengerReport(TPassengerReportVo params);

	int UpdatetPassengerReport(TPassengerReportVo params);
}
