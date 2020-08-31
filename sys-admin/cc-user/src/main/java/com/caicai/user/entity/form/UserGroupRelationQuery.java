package com.caicai.user.entity.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-28 17:43:34.625
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class UserGroupRelationQuery implements Serializable {
	private static final long serialVersionUID = -1L;

    @ApiModelProperty("id")
	private String id;

    @ApiModelProperty("用户id")
	private String userId;

    @ApiModelProperty("用户组id")
	private String groupId;

    @ApiModelProperty("创建时间")
	private Date createdTime;

    @ApiModelProperty("更新时间")
	private Date updatedTime;

    @ApiModelProperty("创建人")
	private String createdBy;

    @ApiModelProperty("更新人")
	private String updatedBy;
}

