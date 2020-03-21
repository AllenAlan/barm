package com.barm.common.exceptions;

import com.barm.common.domain.enums.ResultEnum;
import com.google.common.base.Joiner;
import lombok.Getter;

/**
 * @author Allen
 * @version 1.0.0
 * @description ApplicationException
 * @create 2020/2/23 23:44
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 allennote
 */
@Getter
public class ApplicationException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    /** 结果枚举*/
    private final ResultEnum resultEnum;
    /** 自定义异常信息*/
    private final String errMsg;
    /** 异常码 */
    private final Integer errCode;

    public ApplicationException() {
        super();
        this.resultEnum = ResultEnum.FAIL;
        this.errCode = resultEnum.getCode();
        this.errMsg = resultEnum.getMsg();
    }

    public ApplicationException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.errCode = resultEnum.getCode();
        this.errMsg = resultEnum.getMsg();
        this.resultEnum = resultEnum;
    }

    public ApplicationException(String... errMsgs) {
        super(Joiner.on(",").skipNulls().join(errMsgs));
        this.resultEnum = ResultEnum.FAIL;
        this.errMsg = super.getMessage();
        this.errCode = this.resultEnum.getCode();
    }

    public ApplicationException(ResultEnum resultEnum, String... errMsgs) {
        super(Joiner.on(",").skipNulls().join(errMsgs));
        this.resultEnum = resultEnum;
        this.errMsg = super.getMessage();
        this.errCode = this.resultEnum.getCode();
    }

/*    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }*/
}
