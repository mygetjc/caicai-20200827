package com.caicai.user.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-28 17:43:35.044
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MenuVO implements Serializable{
	private static final long serialVersionUID = -1L;


    /**
     * id
     */
	private String id;

    /**
     * 父菜单id
     */
	private String parentId;

    /**
     * 菜单类型
     */
	private String type;

    /**
     * 菜单路径
     */
	private String href;

    /**
     * 菜单图标
     */
	private String icon;

    /**
     * 菜单名称
     */
	private String name;

    /**
     * 描述
     */
	private String description;

    /**
     * 创建时间
     */
	private Integer orderNum;

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

