package com.bottle.sample.vo;

import lombok.Data;

import javax.persistence.Column;
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
public class TSampleInfoDetailsResp implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 证件类型
     */
    private String identityType;
    /**
     * 证件号码
     */
    private String identity;
    /**
     * 性别
     */
    private String gender;
    /**
     * 电话
     */
    private String phone;
    /**
     * 生日
     */
    private String birthday;
    /**
     * 居住地址
     */
    private String address;
    /**
     * 角色类型
     */
    private String roleType;
    /**
     * 采样口岸
     */
    private String samplingLoca;
    /**
     * 采样码
     */
    private String sampleCode;
    /**
     * 采样时间
     */
    private Date sampleTime;
    /**
     * 采样人
     */
    private String sampleStaff;
    /**
     * 采样单位
     */
    private String sampleInstitution;
    /**
     * 接收样本时间
     */
    private Date adoptTime;
    /**
     * 测试时间
     */
    private Date testTime;
    /**
     * 测试机构
     */
    private String testInstitution;
    /**
     * 采样类型
     */
    private Integer sampleType;
    /**
     * 化验员工id
     */
    private String testStaff;
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
