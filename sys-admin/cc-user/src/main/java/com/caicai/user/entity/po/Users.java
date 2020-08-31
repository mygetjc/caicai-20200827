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
 * @date 2020-08-28 17:43:34.348
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("users")
public class Users implements Serializable {
	private static final long serialVersionUID = -1L;

    /**
     * 用户id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;
    
        
    /**
     * 用户名
     */
    @TableField("username")
    private String username;
        
    /**
     * 用户密码密文
     */
    @TableField("password")
    private String password;
        
    /**
     * 用户姓名
     */
    @TableField("name")
    private String name;
        
    /**
     * 用户手机
     */
    @TableField("mobile")
    private String mobile;
        
    /**
     * 简介
     */
    @TableField("description")
    private String description;
        
    /**
     * 是否已删除Y：已删除，N：未删除
     */
    @TableField("deleted")
    private String deleted;
        
    /**
     * 是否有效用户
     */
    @TableField("enabled")
    private String enabled;
        
    /**
     * 账号是否未过期
     */
    @TableField("account_non_expired")
    private String accountNonExpired;
        
    /**
     * 密码是否未过期
     */
    @TableField("credentials_non_expired")
    private String credentialsNonExpired;
        
    /**
     * 是否未锁定
     */
    @TableField("account_non_locked")
    private String accountNonLocked;
        
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

