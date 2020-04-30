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
public class TSampleInfoListReq implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 姓名
     */
    private String name;
    /**
     * 证件类型
     */
    private Integer identityType;
    /**
     * 证件号码
     */
    private String identity;
    /**
     * 采样码
     */
    private String sampleCode;
    /**
     * 采样时间
     */
    private Date sampleTime;
    /**
     * 采样单位
     */
    private Long sampleInstitutionId;
    /**
     * 测试机构
     */
    private Long testInstitutionId;
    /**
     * 采样类型
     */
    private Integer sampleType;
    /**
     * 化验结果
     */
    private Integer testResult;
    /**
     * 采样口岸
     */
    private String samplingLocaCode;
    /**
     * 电话
     */
    private String phone;
    /**
     * 页码
     */
    private Integer pageNo;
    /**
     * 每页数量
     */
    private Integer pageSize;
}
