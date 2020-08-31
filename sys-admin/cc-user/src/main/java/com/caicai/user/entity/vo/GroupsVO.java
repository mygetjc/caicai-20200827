package com.caicai.user.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-28 17:43:35.121
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GroupsVO implements Serializable{
	private static final long serialVersionUID = -1L;


    /**
     * 
     */
	private String id;

    /**
     * 
     */
	private String parentId;

    /**
     * 
     */
	private String name;

    /**
     * 
     */
	private String description;

    /**
     * 
     */
	private String deleted;

    /**
     * 
     */
	private Date createdTime;

    /**
     * 
     */
	private Date updatedTime;

    /**
     * 
     */
	private String createdBy;

    /**
     * 
     */
	private String updatedBy;

}

