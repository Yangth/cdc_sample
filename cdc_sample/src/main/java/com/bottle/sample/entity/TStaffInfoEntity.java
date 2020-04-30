package com.bottle.sample.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 工作人员信息
 *
 * @author nyd
 * @email 1627815280@qq.com
 * @date 2020-04-27 10:00:33
 */
@Data
@Table(name = "t_staff_info")
public class TStaffInfoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @Id
    @Column(name = "")
    private Long id;
    /**
     * 姓名
     */
    @Column(name = "")
    private String name;
    /**
     * 手机号
     */
    @Column(name = "")
    private String phoneNo;
    /**
     * 所属机构类型
     */
    @Column(name = "")
    private String institutionType;
    /**
     * 所属机构的id
     */
    @Column(name = "")
    private Long institutionId;
    /**
     * 创建时间
     */
    @Column(name = "")
    private Date createTime;
    /**
     * 修改时间
     */
    @Column(name = "")
    private Date updateTime;

}
