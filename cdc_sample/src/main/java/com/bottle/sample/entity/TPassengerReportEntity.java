package com.bottle.sample.entity;

import lombok.Data;
import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * @author lcd
 * @email 738354121@qq.com
 * @date 2020-04-29 15:53:29
 */
@Data
@Table(name = "t_passenger_report")
public class TPassengerReportEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @Id
    @Column(name = "")
    private Long id;
    /**
     * 数据库id
     */
    @Column(name = "")
    private String oid;
    /**
     * 应用标志
     */
    @Column(name = "")
    private String appId;
    /**
     * 微信openid或登录会话里给的用户标志
     */
    @Column(name = "")
    private Long uid;
    /**
     * 姓名
     */
    @Column(name = "")
    private String username;
    /**
     * 电话
     */
    @Column(name = "")
    private String phone;
    /**
     * 性别（男，女，缺省男）
     */
    @Column(name = "")
    private String gender;
    /**
     * 出生日期
     */
    @Column(name = "")
    private Date birthday;
    /**
     * 证件类型 1 居民身份证 2 临时居民身份证 3 军官证 4 港澳居民往来内地通行证 5 台湾居民来往大陆通行证 6 护照 7 其他
     */
    @Column(name = "")
    private Integer identityType;
    /**
     * 证件证号（以证件号码对应一个人）
     */
    @Column(name = "")
    private String identity;
    /**
     * 城市
     */
    @Column(name = "")
    private String city;
    /**
     * 城市行政区划代码
     */
    @Column(name = "")
    private String cityCode;
    /**
     * 区--中文地址
     */
    @Column(name = "")
    private String area;
    /**
     * 县区行政区划代码
     */
    @Column(name = "")
    private String areacode;
    /**
     * 街道/村居名称
     */
    @Column(name = "")
    private String street;
    /**
     * 街道/村居行政区划代码
     */
    @Column(name = "")
    private String streetCode;
    /**
     * 社区名称
     */
    @Column(name = "")
    private String community;
    /**
     * 社区区划代码
     */
    @Column(name = "")
    private String communityCode;
    /**
     * 详细地址
     */
    @Column(name = "")
    private String address;
    /**
     * 详细地址
     */
    @Column(name = "")
    private String symptom;
    /**
     * 居住地址方式：1.居家住宅2.租住3.投靠借住4.酒店旅店5.其他6.办公
     */
    @Column(name = "")
    private Integer livingType;
    /**
     * 提交时间
     */
    @Column(name = "")
    private Date createTime;
    /**
     * 1否2找不到合适居住地点3身体严重不适需要求医4其他
     */
    @Column(name = "")
    private Integer ifHelp;
    /**
     * 采集类型：0自主上报1第三方采集
     */
    @Column(name = "")
    private Integer collectorType;
    /**
     * 腋下体温是否超过37.3度 0 -否 1 -是（选发热才填）
     */
    @Column(name = "")
    private Integer temperature;
    /**
     * 是否医院检查 0 -否 1 -是
     */
    @Column(name = "")
    private Integer hospitalCheck;
    /**
     * 详细地址
     */
    @Column(name = "")
    private String symptomDscr;
    /**
     * 人员类型：1 外地来深  2 外地返深 3 留深人员 4过境人员
     */
    @Column(name = "")
    private Integer personType;
    /**
     * 是否居家隔离 0 -否 1 -是
     */
    @Column(name = "")
    private Integer quarantineCheck;
    /**
     * 社会信用代码
     */
    @Column(name = "")
    private String socialCreditId;
    /**
     * 单位名称
     */
    @Column(name = "")
    private String company;
    /**
     * 目前所在城市
     */
    @Column(name = "")
    private String currentLocation;
    /**
     * 目前所在城市行政区划代码
     */
    @Column(name = "")
    private String currentLocationCode;
    /**
     * 当前版本号：默认为 V2.0
     */
    @Column(name = "")
    private String version;
    /**
     * 数据来源（1，自主申申报，2，车辆申报）
     */
    @Column(name = "")
    private Integer dataFrom;
    /**
     * 楼栋房屋编码
     */
    @Column(name = "")
    private String code;
    /**
     * 小区名称
     */
    @Column(name = "")
    private String village;
    /**
     * 是否深圳居住 0 -否 1 -是
     */
    @Column(name = "")
    private Integer ifLivingSz;
    /**
     * 是否深圳工作 0 -否 1 -是
     */
    @Column(name = "")
    private Integer ifWorkingSz;
    /**
     * 是否医院检查=1时，检查结果 1确诊患者 2等待检查结果 3检查结果无新冠状肺炎
     */
    @Column(name = "")
    private Integer hospitalCheckResult;
    /**
     * 是否入境人员，0否，1是
     */
    @Column(name = "")
    private Integer ifEnter;
    /**
     * person key
     */
    @Column(name = "")
    private String personKey;

}
