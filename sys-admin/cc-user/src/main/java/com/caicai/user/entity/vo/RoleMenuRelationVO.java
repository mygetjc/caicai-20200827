package com.caicai.user.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-28 17:43:34.811
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class RoleMenuRelationVO implements Serializable{
	private static final long serialVersionUID = -1L;


    /**
     * id
     */
	private String id;

    /**
     * 菜单id
     */
	private String menuId;

    /**
     * 角色id
     */
	private String roleId;

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

