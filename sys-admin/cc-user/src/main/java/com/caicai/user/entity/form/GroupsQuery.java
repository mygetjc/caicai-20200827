package com.caicai.user.entity.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-28 17:43:35.131
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class GroupsQuery implements Serializable {
	private static final long serialVersionUID = -1L;

    @ApiModelProperty("")
	private String id;

    @ApiModelProperty("")
	private String parentId;

    @ApiModelProperty("")
	private String name;

    @ApiModelProperty("")
	private String description;

    @ApiModelProperty("")
	private String deleted;

    @ApiModelProperty("")
	private Date createdTime;

    @ApiModelProperty("")
	private Date updatedTime;

    @ApiModelProperty("")
	private String createdBy;

    @ApiModelProperty("")
	private String updatedBy;
}

