package com.bottle.sample.passengerReport.dao.mapper;

import com.bottle.sample.entity.TPassengerReportEntity;
import com.bottle.sample.passengerReport.dao.TPassengerReportDao;
import com.bottle.sample.vo.TPassengerReportVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.context.annotation.Primary;

import java.util.List;

/**
 *
 *mybatis tk 操作类
 * @author lcd
 * @email 738354121@qq.com
 * @date 2020-04-29 15:53:29
 */
@Mapper
@Primary
public interface TPassengerReportMapper extends TPassengerReportDao {

    @Override
    @SelectProvider(type=TPassengerReportSqlProvider.class, method="getTPassengerReportSelective")
    List<TPassengerReportEntity> queryPage(TPassengerReportVo tPassengerReportVo);

}
