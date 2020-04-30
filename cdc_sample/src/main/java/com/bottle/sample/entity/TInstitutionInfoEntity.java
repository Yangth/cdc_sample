package com.bottle.sample.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 组织信息
 *
 * @author nyd
 * @email 1627815280@qq.com
 * @date 2020-04-27 10:00:33
 */
@Data
@Table(name = "t_institution_info")
public class TInstitutionInfoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @Id
    @Column(name = "")
    private Long id;
    /**
     * 机构名称
     */
    @Column(name = "")
    private String name;
    /**
     * 机构类型
     */
    @Column(name = "")
    private Integer type;
    /**
     * 创建时间
     */
    @Column(name = "")
    private Date createTime;
    /**
     * 创建人
     */
    @Column(name = "")
    private String createUser;
    /**
     * 修改时间
     */
    @Column(name = "")
    private Date updateTime;
    /**
     * 是否被删除
     */
    @Column(name = "")
    private Integer isDeleted;

}
