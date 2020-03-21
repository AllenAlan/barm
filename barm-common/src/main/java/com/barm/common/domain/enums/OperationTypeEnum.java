package com.barm.common.domain.enums;

import lombok.Getter;

/**
 * @author Allen
 * @version 1.0.0
 * @description 操作类型枚举
 * @create 2020/3/16 13:36
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 allennote
 */
@Getter
public enum OperationTypeEnum {
    // 1: 新增, 2: 修改, 3: 删除, 4: 查询;

    CREATE(1, "create", "新增"),
    MODIFY(2, "modify", "修改"),
    REMOVE(3, "remove", "删除"),
    QUERY( 4, "query", "查询"),
    ;
    private Integer code;

    private String name;

    private String value;

    OperationTypeEnum(Integer code, String name, String value) {
        this.code = code;
        this.name = name;
        this.value = value;
    }
}
