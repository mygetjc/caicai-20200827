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
 * @date 2020-08-28 17:43:34.764
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("role_resource_relation")
public class RoleResourceRelation implements Serializable {
	private static final long serialVersionUID = -1L;

    /**
     * 关系id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;
    
        
    /**
     * 角色id
     */
    @TableField("resource_id")
    private String resourceId;
        
    /**
     * 资源id
     */
    @TableField("role_id")
    private String roleId;
        
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

