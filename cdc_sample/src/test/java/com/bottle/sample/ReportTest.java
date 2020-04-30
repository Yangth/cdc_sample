package com.bottle.sample;


import com.bottle.sample.entity.TPassengerReportEntity;
import com.bottle.sample.service.TPassengerReportService;
import com.bottle.sample.vo.TPassengerReportVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

//@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class ReportTest {

    @Autowired
    private TPassengerReportService tPassengerReportService;

    @Test
    public void queryPageTest(){
        TPassengerReportVo params=new TPassengerReportVo();
        List<TPassengerReportEntity> tPassengerReportEntities = tPassengerReportService.queryPage(params);
        System.out.println(tPassengerReportEntities);
    }
}
