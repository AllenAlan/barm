package com.barm.archetypes.api.domain.dto.spec;

import com.barm.common.domain.dto.spec.PageSpec;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * @author Allen
 * @version 1.0.0
 * @description UserMainPageSpec
 * @create 2020/3/16 13:59
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 allennote
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class UserMainPageSpec extends PageSpec {

    private static final long serialVersionUID = 1L;

    /** 昵称*/
    private String nickname;
    /** 用户名*/
    @NotNull(message = "用户名不能为空")
    private String username;
    /** 修改时间*/
    private LocalDateTime gmtModify;

}
