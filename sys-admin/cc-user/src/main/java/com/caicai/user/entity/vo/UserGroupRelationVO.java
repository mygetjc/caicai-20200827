package com.caicai.user.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-28 17:43:34.615
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserGroupRelationVO implements Serializable{
	private static final long serialVersionUID = -1L;


    /**
     * id
     */
	private String id;

    /**
     * 用户id
     */
	private String userId;

    /**
     * 用户组id
     */
	private String groupId;

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

