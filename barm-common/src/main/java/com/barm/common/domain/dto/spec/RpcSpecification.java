package com.barm.common.domain.dto.spec;

import com.barm.common.domain.enums.OperationTypeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @description Rpc请求对象抽象类
 * @author Allen
 * @version 1.0.0
 * @create 2020/3/16 13:45
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 allennote
 */
@Data
public abstract class RpcSpecification<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /** 追溯ID */
    private String traceId;
    /** 操作类型*/
    private OperationTypeEnum operationType;
    /** client IP */
    private String clientIP;
    /** client name */
    private String clientName;


    public static void main(String[] args) {
        System.out.println(1L<<12);
    }
}
