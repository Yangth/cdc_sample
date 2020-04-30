package com.bottle.sample.common.Exp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局异常处理
 * */
@RestControllerAdvice
public class GlobalHandle {
    private Logger logger = LoggerFactory.getLogger(getClass());

//
//    /**
//     * 自定义异常
//     */
//    @ExceptionHandler(BDException.class)
//    public R handleBDException(BDException e) {
//        logger.error(e.getMessage(), e);
//        R r = new R();
//        r.put("code", e.getCode());
//        r.put("msg", e.getMessage());
//        return r;
//    }
//  get post 乱调用
    @ExceptionHandler(org.springframework.web.HttpRequestMethodNotSupportedException.class)
    public Object handlegetpostException(HttpRequestMethodNotSupportedException e) {
        logger.error(e.getMessage(), e);
        Map<String,Object> res=new HashMap();
        res.put("code",500);
        res.put("message",e.getMessage());
        return res;
    }

    @ExceptionHandler(org.springframework.web.servlet.NoHandlerFoundException.class)
    public Object noHandlerFoundException(org.springframework.web.servlet.NoHandlerFoundException e) {
        logger.error(e.getMessage(), e);
        Map<String,Object> res=new HashMap();
        res.put("code",500);
        res.put("message","没有发现此api");
        return res;
    }


////////////////////////////////////////////////////////////////////
    @ExceptionHandler({Exception.class})
    public Object handleException(Exception e) {
        logger.error(e.getMessage(), e);
        Map<String,Object> res=new HashMap();
        res.put("code",500);
        res.put("message","system error");
        return res;
    }
}
