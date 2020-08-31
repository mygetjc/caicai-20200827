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
 * @date 2020-08-28 17:43:34.984
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("position")
public class Position implements Serializable {
	private static final long serialVersionUID = -1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;
    
        
    /**
     * 岗位名称
     */
    @TableField("name")
    private String name;
        
    /**
     * 描述
     */
    @TableField("description")
    private String description;
        
    /**
     * 是否已删除Y：已删除，N：未删除
     */
    @TableField("deleted")
    private String deleted;
        
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

