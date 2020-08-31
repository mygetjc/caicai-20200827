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
 * @date 2020-08-28 17:43:34.701
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("roles")
public class Roles implements Serializable {
	private static final long serialVersionUID = -1L;

    /**
     * 角色id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;
    
        
    /**
     * 角色code
     */
    @TableField("code")
    private String code;
        
    /**
     * 角色名称
     */
    @TableField("name")
    private String name;
        
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

