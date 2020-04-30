package com.bottle.sample.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 采样信息
 *
 * @author nyd
 * @email 1627815280@qq.com
 * @date 2020-04-27 10:00:33
 */
@Data
@Table(name = "t_sample_info")
public class TSampleInfoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @Id
    @Column(name = "")
    private Long id;
    /**
     * person key
     */
    @Column(name = "")
    private String personKey;
    /**
     * 采样码
     */
    @Column(name = "")
    private String sampleCode;
    /**
     * 采样类型
     */
    @Column(name = "")
    private String sampleType;
    /**
     * 采样人
     */
    @Column(name = "")
    private String sampleStaffId;
    /**
     * 采样机构
     */
    @Column(name = "")
    private Long sampleInstitutionId;
    /**
     * 采样时间
     */
    @Column(name = "")
    private Date sampleTime;
    /**
     * 采样状态
     */
    @Column(name = "")
    private String testStatus;
    /**
     * 测试机构
     */
    @Column(name = "")
    private Long testInstitutionId;
    /**
     * 接收样本时间
     */
    @Column(name = "")
    private Date adoptTime;
    /**
     * 测试时间
     */
    @Column(name = "")
    private Date testTime;
    /**
     * ct值
     */
    @Column(name = "")
    private String ct;
    /**
     * 试剂盒
     */
    @Column(name = "")
    private String testBox;
    /**
     * 化验员工id
     */
    @Column(name = "")
    private String testStaffId;
    /**
     * 化验结果
     */
    @Column(name = "")
    private String testResult;
    /**
     * 提交化验结果时间
     */
    @Column(name = "")
    private Date submitTestTime;
    /**
     * 是否被删除
     */
    @Column(name = "")
    private Integer isDeleted;
    /**
     * 姓名
     */
    @Column(name = "")
    private String name;
    /**
     * 创建时间
     */
    @Column(name = "")
    private Date createTime;

}
