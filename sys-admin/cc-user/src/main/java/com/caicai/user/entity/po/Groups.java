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
 * @date 2020-08-28 17:43:35.14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("groups")
public class Groups implements Serializable {
	private static final long serialVersionUID = -1L;

    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;
    
        
    /**
     * 
     */
    @TableField("parent_id")
    private String parentId;
        
    /**
     * 
     */
    @TableField("name")
    private String name;
        
    /**
     * 
     */
    @TableField("description")
    private String description;
        
    /**
     * 
     */
    @TableField("deleted")
    private String deleted;
        
    /**
     * 
     */
    @TableField("created_time")
    private Date createdTime;
        
    /**
     * 
     */
    @TableField("updated_time")
    private Date updatedTime;
        
    /**
     * 
     */
    @TableField("created_by")
    private String createdBy;
        
    /**
     * 
     */
    @TableField("updated_by")
    private String updatedBy;
    }

