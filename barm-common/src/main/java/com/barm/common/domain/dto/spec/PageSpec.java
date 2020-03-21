package com.barm.common.domain.dto.spec;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Allen
 * @version 1.0.0
 * @description 分页 specification
 * @create 2020/3/16 13:50
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 allennote
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PageSpec<T> extends RpcSpecification {
    private static final long serialVersionUID = 1L;

    private Integer page = Integer.valueOf(1);

    private Integer pageSize = Integer.valueOf(10);

}
