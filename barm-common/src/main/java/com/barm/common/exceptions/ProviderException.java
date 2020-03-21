package com.barm.common.exceptions;

import com.barm.common.domain.enums.ResultEnum;

/**
 * @author Allen
 * @version 1.0.0
 * @description ProviderException
 * @create 2020/3/19 10:00
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 allennote
 */
public class ProviderException extends ApplicationException {

    private static final long serialVersionUID = 1L;

    /** provider 信息*/
    private ProviderInfo providerInfo;

    public ProviderException(ProviderInfo providerInfo) {
        this.providerInfo = providerInfo;
    }

    public ProviderException(ResultEnum resultEnum, ProviderInfo providerInfo) {
        super(resultEnum);
        this.providerInfo = providerInfo;
    }

    public ProviderException(ProviderInfo providerInfo, String... errMsgs) {
        super(errMsgs);
        this.providerInfo = providerInfo;
    }

    public ProviderException(ResultEnum resultEnum, ProviderInfo providerInfo, String... errMsgs) {
        super(resultEnum, errMsgs);
        this.providerInfo = providerInfo;
    }

    public ProviderInfo getProviderInfo() {
        return providerInfo;
    }
}
