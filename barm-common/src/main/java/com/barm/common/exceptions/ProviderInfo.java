package com.barm.common.exceptions;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Allen
 * @version 1.0.0
 * @description 服务端信息
 * @create 2020/3/19 12:19
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 allennote
 */
@Data
public class ProviderInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 本地地址*/
    private String localAddress;
    /** 远端地址*/
    private String remoteAddress;
    /** 应用名*/
    private String applicationName;
    /** 方法名*/
    private String methodName;
    /** 服务端附件*/
    Map<String, String> attachments;

}
