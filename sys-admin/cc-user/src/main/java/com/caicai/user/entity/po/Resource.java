package com.caicai.user.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jc
 * @date 2020-08-28 17:43:34.919
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("resource")
public class Resource implements Serializable {
	private static final long serialVersionUID = -1L;

    /**
     * 资源id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;
    
        
    /**
     * 资源code
     */
    @TableField("code")
    private String code;
        
    /**
     * 资源类型
     */
    @TableField("type")
    private String type;
        
    /**
     * 资源名称
     */
    @TableField("name")
    private String name;
        
    /**
     * 资源url
     */
    @TableField("url")
    private String url;
        
    /**
     * 资源方法
     */
    @TableField("method")
    private String method;
        
    /**
     * 简介
     */
    @TableField("description")
    private String description;
        
    /**
     * 创建时间
     */
    @TableField("created_time")
    private Date createdTime;
        
    /**
     * 更新时间
     */
    @TableField("updated_time")
    private Date updatedTime;
        
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

