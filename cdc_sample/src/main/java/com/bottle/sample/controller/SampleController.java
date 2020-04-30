package com.bottle.sample.controller;

import com.bottle.sample.service.TSampleInfoService;
import com.bottle.sample.vo.TSampleInfoListReq;
import com.bottle.sample.vo.TSampleInfoUpdReq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class SampleController {

    @Autowired
    private TSampleInfoService tSampleInfoService;

    //核酸检测分页列表
    @PostMapping("/samplePageList")
    @ResponseBody
    public Map<String, Object> samplePageList(@RequestBody TSampleInfoListReq tSampleInfoListReq) {
        try {
            return tSampleInfoService.queryPage(tSampleInfoListReq);
        } catch (Exception e) {
            log.error(e.getMessage());
            return new HashMap<String, Object>(){{
                put("code" , 500);
                put("message" , "false");
            }};
        }
    }

    //批量置阴
    @PostMapping("/batchUpdNegative")
    @ResponseBody
    public Map<String, Object> batchUpdNegative(@RequestBody List<Long> ids) {
        try {
            return tSampleInfoService.batchUpdNegative(ids);
        } catch (Exception e) {
            log.error(e.getMessage());
            return new HashMap<String, Object>(){{
                put("code" , 500);
                put("message" , "false");
            }};
        }
    }

    //单条修改
    @PostMapping("/updateSample")
    @ResponseBody
    public Map<String, Object> updateSample(@RequestBody TSampleInfoUpdReq tSampleInfoUpdReq) {
        try {
            return tSampleInfoService.updatetSampleInfo(tSampleInfoUpdReq);
        } catch (Exception e) {
            log.error(e.getMessage());
            return new HashMap<String, Object>(){{
                put("code" , 500);
                put("message" , "false");
            }};
        }
    }

    //核酸检测详情
    @GetMapping("/sampleDetails")
    @ResponseBody
    public Map<String, Object> sampleDetails(@RequestParam("id") Long id) {
        try {
            return tSampleInfoService.getTSampleInfoById(id);
        } catch (Exception e) {
            log.error(e.getMessage());
            return new HashMap<String, Object>(){{
                put("code" , 500);
                put("message" , "false");
            }};
        }
    }


}
