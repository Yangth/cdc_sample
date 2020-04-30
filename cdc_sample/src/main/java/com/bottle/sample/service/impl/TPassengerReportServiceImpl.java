package com.bottle.sample.service.impl;

import com.bottle.sample.passengerReport.dao.TPassengerReportDao;
import com.bottle.sample.entity.TPassengerReportEntity;
import com.bottle.sample.service.TPassengerReportService;
import com.bottle.sample.vo.TPassengerReportVo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
@Primary
public class TPassengerReportServiceImpl implements TPassengerReportService {
    @Autowired
    TPassengerReportDao tPassengerReportDao;

    @Override
    public List<TPassengerReportEntity> queryPage(TPassengerReportVo params) {
        return tPassengerReportDao.queryPage(params);
    }

    @Override
    public int getCountByCondi(TPassengerReportVo params) {
        return tPassengerReportDao.getCountByCondi(params);
    }

    @Override
    public TPassengerReportEntity getTPassengerReportById(Integer id) {
        return tPassengerReportDao.getTPassengerReportById(id);
    }

    @Override
    public Map<String, Object> addtPassengerReport(TPassengerReportVo params) {
        int saveCode = tPassengerReportDao.addtPassengerReport(params);
        Map<String, Object> res = new HashMap<>();
        if (saveCode < 1) {
            res.put("code" , 500);
            res.put("message" , "添加失败");
            return res;
        }
        res.put("code" , 200);
        res.put("message" , "ok");
        return res;
    }

    ;

    @Override
    public Map<String, Object> updatetPassengerReport(TPassengerReportVo params) {
        int updateCode = tPassengerReportDao.UpdatetPassengerReport(params);
        Map<String, Object> res = new HashMap<>();
        if (updateCode < 1) {
            res.put("code" , 500);
            res.put("message" , "更新失败");
            return res;
        }
        res.put("code" , 200);
        res.put("message" , "ok");
        return res;
    }

    ;
}