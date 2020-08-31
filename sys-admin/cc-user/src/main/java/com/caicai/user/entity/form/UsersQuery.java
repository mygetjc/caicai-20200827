package com.caicai.user.entity.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-28 17:43:34.339
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class UsersQuery implements Serializable {
	private static final long serialVersionUID = -1L;

    @ApiModelProperty("用户id")
	private String id;

    @ApiModelProperty("用户名")
	private String username;

    @ApiModelProperty("用户密码密文")
	private String password;

    @ApiModelProperty("用户姓名")
	private String name;

    @ApiModelProperty("用户手机")
	private String mobile;

    @ApiModelProperty("简介")
	private String description;

    @ApiModelProperty("是否已删除Y：已删除，N：未删除")
	private String deleted;

    @ApiModelProperty("是否有效用户")
	private String enabled;

    @ApiModelProperty("账号是否未过期")
	private String accountNonExpired;

    @ApiModelProperty("密码是否未过期")
	private String credentialsNonExpired;

    @ApiModelProperty("是否未锁定")
	private String accountNonLocked;

    @ApiModelProperty("创建时间")
	private Date createdTime;

    @ApiModelProperty("更新时间")
	private Date updatedTime;

    @ApiModelProperty("创建人")
	private String createdBy;

    @ApiModelProperty("更新人")
	private String updatedBy;
}

