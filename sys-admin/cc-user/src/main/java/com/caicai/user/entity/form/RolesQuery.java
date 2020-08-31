package com.caicai.user.entity.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-28 17:43:34.694
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class RolesQuery implements Serializable {
	private static final long serialVersionUID = -1L;

    @ApiModelProperty("角色id")
	private String id;

    @ApiModelProperty("角色code")
	private String code;

    @ApiModelProperty("角色名称")
	private String name;

    @ApiModelProperty("简介")
	private String description;

    @ApiModelProperty("创建时间")
	private Date createdTime;

    @ApiModelProperty("更新时间")
	private Date updatedTime;

    @ApiModelProperty("创建人")
	private String createdBy;

    @ApiModelProperty("更新人")
	private String updatedBy;
}

