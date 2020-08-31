package com.cc.gateway.admin.entity.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author jc
 * @date 2020-08-31 10:02:52.726
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class GatewayRouteQuery implements Serializable {
	private static final long serialVersionUID = -1L;

    @ApiModelProperty("id")
	private String id;

    @ApiModelProperty("路由id")
	private String routeId;

    @ApiModelProperty("uri路径")
	private String uri;

    @ApiModelProperty("判定器")
	private String predicates;

    @ApiModelProperty("过滤器")
	private String filters;

    @ApiModelProperty("排序")
	private String orders;

    @ApiModelProperty("描述")
	private String description;

    @ApiModelProperty("状态：Y-有效，N-无效")
	private String status;

    @ApiModelProperty("创建时间")
	private String createdTime;

    @ApiModelProperty("更新时间")
	private String updatedTime;

    @ApiModelProperty("创建人")
	private String createdBy;

    @ApiModelProperty("更新人")
	private String updatedBy;
}

