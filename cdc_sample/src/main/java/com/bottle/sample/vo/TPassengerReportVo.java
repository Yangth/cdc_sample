package com.bottle.sample.vo;

import lombok.Data;


import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author lcd
 * @email 738354121@qq.com
 * @date 2020-04-29 15:53:29
 */
@Data
public class TPassengerReportVo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private Long id;
    /**
     * 数据库id
     */
    private String oid;
    /**
     * 应用标志
     */
    private String appId;
    /**
     * 微信openid或登录会话里给的用户标志
     */
    private Long uid;
    /**
     * 姓名
     */
    private String username;
    /**
     * 电话
     */
    private String phone;
    /**
     * 性别（男，女，缺省男）
     */
    private String gender;
    /**
     * 出生日期
     */
    private Date birthday;
    /**
     * 证件类型 1 居民身份证 2 临时居民身份证 3 军官证 4 港澳居民往来内地通行证 5 台湾居民来往大陆通行证 6 护照 7 其他
     */
    private Integer identityType;
    /**
     * 证件证号（以证件号码对应一个人）
     */
    private String identity;
    /**
     * 城市
     */
    private String city;
    /**
     * 城市行政区划代码
     */
    private String cityCode;
    /**
     * 区--中文地址
     */
    private String area;
    /**
     * 县区行政区划代码
     */
    private String areacode;
    /**
     * 街道/村居名称
     */
    private String street;
    /**
     * 街道/村居行政区划代码
     */
    private String streetCode;
    /**
     * 社区名称
     */
    private String community;
    /**
     * 社区区划代码
     */
    private String communityCode;
    /**
     * 详细地址
     */
    private String address;
    /**
     * 详细地址
     */
    private String symptom;
    /**
     * 居住地址方式：1.居家住宅2.租住3.投靠借住4.酒店旅店5.其他6.办公
     */
    private Integer livingType;
    /**
     * 提交时间
     */
    private Date createTime;
    /**
     * 1否2找不到合适居住地点3身体严重不适需要求医4其他
     */
    private Integer ifHelp;
    /**
     * 采集类型：0自主上报1第三方采集
     */
    private Integer collectorType;
    /**
     * 腋下体温是否超过37.3度 0 -否 1 -是（选发热才填）
     */
    private Integer temperature;
    /**
     * 是否医院检查 0 -否 1 -是
     */
    private Integer hospitalCheck;
    /**
     * 详细地址
     */
    private String symptomDscr;
    /**
     * 人员类型：1 外地来深  2 外地返深 3 留深人员 4过境人员
     */
    private Integer personType;
    /**
     * 是否居家隔离 0 -否 1 -是
     */
    private Integer quarantineCheck;
    /**
     * 社会信用代码
     */
    private String socialCreditId;
    /**
     * 单位名称
     */
    private String company;
    /**
     * 目前所在城市
     */
    private String currentLocation;
    /**
     * 目前所在城市行政区划代码
     */
    private String currentLocationCode;
    /**
     * 当前版本号：默认为 V2.0
     */
    private String version;
    /**
     * 数据来源（1，自主申申报，2，车辆申报）
     */
    private Integer dataFrom;
    /**
     * 楼栋房屋编码
     */
    private String code;
    /**
     * 小区名称
     */
    private String village;
    /**
     * 是否深圳居住 0 -否 1 -是
     */
    private Integer ifLivingSz;
    /**
     * 是否深圳工作 0 -否 1 -是
     */
    private Integer ifWorkingSz;
    /**
     * 是否医院检查=1时，检查结果 1确诊患者 2等待检查结果 3检查结果无新冠状肺炎
     */
    private Integer hospitalCheckResult;
    /**
     * 是否入境人员，0否，1是
     */
    private Integer ifEnter;
    /**
     * person key
     */
    private String personKey;
    private Integer pageNo;
    private Integer pageSize;
}
