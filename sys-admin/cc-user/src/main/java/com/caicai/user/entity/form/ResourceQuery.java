package com.caicai.user.entity.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-28 17:43:34.913
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class ResourceQuery implements Serializable {
	private static final long serialVersionUID = -1L;

    @ApiModelProperty("资源id")
	private String id;

    @ApiModelProperty("资源code")
	private String code;

    @ApiModelProperty("资源类型")
	private String type;

    @ApiModelProperty("资源名称")
	private String name;

    @ApiModelProperty("资源url")
	private String url;

    @ApiModelProperty("资源方法")
	private String method;

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

