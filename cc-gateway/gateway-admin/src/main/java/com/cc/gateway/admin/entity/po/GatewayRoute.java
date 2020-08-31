package com.cc.gateway.admin.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author jc
 * @date 2020-08-31 10:02:52.733
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("gateway_route")
public class GatewayRoute implements Serializable {
	private static final long serialVersionUID = -1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;
    
        
    /**
     * 路由id
     */
    @TableField("route_id")
    private String routeId;
        
    /**
     * uri路径
     */
    @TableField("uri")
    private String uri;
        
    /**
     * 判定器
     */
    @TableField("predicates")
    private String predicates;
        
    /**
     * 过滤器
     */
    @TableField("filters")
    private String filters;
        
    /**
     * 排序
     */
    @TableField("orders")
    private String orders;
        
    /**
     * 描述
     */
    @TableField("description")
    private String description;
        
    /**
     * 状态：Y-有效，N-无效
     */
    @TableField("status")
    private String status;
        
    /**
     * 创建时间
     */
    @TableField("created_time")
    private String createdTime;
        
    /**
     * 更新时间
     */
    @TableField("updated_time")
    private String updatedTime;
        
    /**
     * 创建人
     */
    @TableField("created_by")
    private String createdBy;
        
    /**
     * 更新人
     */
    @TableField("updated_by")
    private String updatedBy;
    }

