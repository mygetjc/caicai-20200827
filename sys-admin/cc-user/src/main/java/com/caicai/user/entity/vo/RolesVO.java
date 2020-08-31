package com.caicai.user.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-28 17:43:34.687
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class RolesVO implements Serializable{
	private static final long serialVersionUID = -1L;


    /**
     * 角色id
     */
	private String id;

    /**
     * 角色code
     */
	private String code;

    /**
     * 角色名称
     */
	private String name;

    /**
     * 简介
     */
	private String description;

    /**
     * 创建时间
     */
	private Date createdTime;

    /**
     * 更新时间
     */
	private Date updatedTime;

    /**
     * 创建人
     */
	private String createdBy;

    /**
     * 更新人
     */
	private String updatedBy;

}

