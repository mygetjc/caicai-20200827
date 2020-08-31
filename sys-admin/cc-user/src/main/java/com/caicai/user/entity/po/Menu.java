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
 * @date 2020-08-28 17:43:35.063
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("menu")
public class Menu implements Serializable {
	private static final long serialVersionUID = -1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;
    
        
    /**
     * 父菜单id
     */
    @TableField("parent_id")
    private String parentId;
        
    /**
     * 菜单类型
     */
    @TableField("type")
    private String type;
        
    /**
     * 菜单路径
     */
    @TableField("href")
    private String href;
        
    /**
     * 菜单图标
     */
    @TableField("icon")
    private String icon;
        
    /**
     * 菜单名称
     */
    @TableField("name")
    private String name;
        
    /**
     * 描述
     */
    @TableField("description")
    private String description;
        
    /**
     * 创建时间
     */
    @TableField("order_num")
    private Integer orderNum;
        
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

