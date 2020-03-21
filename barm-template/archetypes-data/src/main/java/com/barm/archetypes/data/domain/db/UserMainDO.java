package com.barm.archetypes.data.domain.db;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * @description 用户主表DO
 * @author Allen
 * @version 1.0.0
 * @create 2020/3/6 21:27
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 allennote
 */
@Data
@TableName(value = "user_main")
public class UserMainDO implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 昵称
     */
    @TableField(value = "nickname")
    private String nickname;

    /**
     * 创建人
     */
    @TableField(value = "create_by")
    private String createBy;

    /**
     * 修改人
     */
    @TableField(value = "modify_by")
    private String modifyBy;

    /**
     * 创建时间
     */
    @TableField(value = "gmt_create")
    private LocalDateTime gmtCreate;

    /**
     * 修改时间
     */
    @TableField(value = "gmt_modify")
    private LocalDateTime gmtModify;

    /**
     * 版本号
     */
    @TableField(value = "version")
    private Long version;

    /**
     * 逻辑删 0 未删除 1 已删除
     */
    @TableLogic
    @TableField(value = "deleted")
    private Boolean deleted;

    /**
     * 冗余
     */
    @TableField(value = "extend")
    private String extend;
}