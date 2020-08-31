package com.caicai.user.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-28 17:43:34.907
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ResourceVO implements Serializable{
	private static final long serialVersionUID = -1L;


    /**
     * 资源id
     */
	private String id;

    /**
     * 资源code
     */
	private String code;

    /**
     * 资源类型
     */
	private String type;

    /**
     * 资源名称
     */
	private String name;

    /**
     * 资源url
     */
	private String url;

    /**
     * 资源方法
     */
	private String method;

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

