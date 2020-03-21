#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.domain.bo;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Allen
 * @version 1.0.0
 * @description 用户主表DO
 * @create 2020/3/6 21:27
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 allennote
 */
@Data
public class UserMainBO implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 修改人
     */
    private String modifyBy;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 修改时间
     */
    private LocalDateTime gmtModify;

    /**
     * 版本号
     */
    private Long version;

    /**
     * 逻辑删 0 未删除 1 已删除
     */
    private Boolean deleted;

    /**
     * 冗余
     */
    private String extend;
}