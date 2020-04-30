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
public class TSampleInfoVo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;
    /**
     * person key
     */
    private String personKey;
    /**
     * 采样码
     */
    private String sampleCode;
    /**
     * 采样类型
     */
    private String sampleType;
    /**
     * 采样人
     */
    private String sampleStaffId;
    /**
     * 采样机构名称
     */
    private Long sampleInstitutionId;
    /**
     * 采样时间
     */
    private Date sampleTime;
    /**
     * 采样状态
     */
    private String testStatus;
    /**
     * 测试机构
     */
    private Long testInstitutionId;
    /**
     * 接收样本时间
     */
    private Date adoptTime;
    /**
     * 测试时间
     */
    private Date testTime;
    /**
     * ct值
     */
    private String ct;
    /**
     * 试剂盒
     */
    private String testBox;
    /**
     * 化验员工id
     */
    private String testStaffId;
    /**
     * 化验结果
     */
    private String testResult;
    /**
     * 提交化验结果时间
     */
    private Date submitTestTime;
    /**
     * 是否被删除
     */
    private Integer isDeleted;
    /**
     * 姓名
     */
    private String name;
    /**
     * 创建时间
     */
    private Date createTime;
    private Integer pageNo;
    private Integer pageSize;
}
