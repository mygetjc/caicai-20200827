package com.caicai.user.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-28 17:43:34.97
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PositionVO implements Serializable{
	private static final long serialVersionUID = -1L;


    /**
     * id
     */
	private String id;

    /**
     * 岗位名称
     */
	private String name;

    /**
     * 描述
     */
	private String description;

    /**
     * 是否已删除Y：已删除，N：未删除
     */
	private String deleted;

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

