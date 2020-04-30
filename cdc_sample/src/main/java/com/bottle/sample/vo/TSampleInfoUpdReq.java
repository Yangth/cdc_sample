package com.bottle.sample.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 采样信息
 *
 * @author nyd
 * @email 1627815280@qq.com
 * @date 2020-04-27 10:00:33
 */
@Data
public class TSampleInfoUpdReq implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;
    /**
     * 接收样本时间
     */
    private Date adoptTime;
    /**
     * 测试时间
     */
    private Date testTime;
    /**
     * 采样类型
     */
    private Integer sampleType;
    /**
     * 化验结果
     */
    private Integer testResult;
    /**
     * ct值
     */
    private String ct;
    /**
     * 试剂盒
     */
    private String testBox;
}
