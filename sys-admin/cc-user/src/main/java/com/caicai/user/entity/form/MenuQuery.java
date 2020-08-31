package com.caicai.user.entity.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-28 17:43:35.054
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class MenuQuery implements Serializable {
	private static final long serialVersionUID = -1L;

    @ApiModelProperty("id")
	private String id;

    @ApiModelProperty("父菜单id")
	private String parentId;

    @ApiModelProperty("菜单类型")
	private String type;

    @ApiModelProperty("菜单路径")
	private String href;

    @ApiModelProperty("菜单图标")
	private String icon;

    @ApiModelProperty("菜单名称")
	private String name;

    @ApiModelProperty("描述")
	private String description;

    @ApiModelProperty("创建时间")
	private Integer orderNum;

    @ApiModelProperty("创建时间")
	private Date createdTime;

    @ApiModelProperty("更新时间")
	private Date updatedTime;

    @ApiModelProperty("创建人")
	private String createdBy;

    @ApiModelProperty("更新人")
	private String updatedBy;
}

