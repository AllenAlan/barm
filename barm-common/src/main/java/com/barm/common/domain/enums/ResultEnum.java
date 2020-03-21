package com.barm.common.domain.enums;
/**
 * @description 返回结果枚举
 *              1000000000
 *              10---------> 1~ 2 位: 消息提示类型 e.g. 10 正常, 20 系统异常, 30 业务异常
 *                0000-----> 3~ 6 位: 服务类型 e.g. 0001 用户服务
 *                    0000-> 7~10 位: 错误类型 e.g. 5000 参数校验错误
 * @author Allen
 * @version 1.0.0
 * @create 2020/2/24 0:21
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 allennote
 */
public enum ResultEnum {
    // 200 操作成功 500 操作失败
    SUCCESS(1000000000, "操作成功"),
    FAIL(2000000000, "操作失败"),
    RPC_ERROR(2000001000, "远程调用失败"),
    INVALID_REQUEST_PARAM_ERROR(2000005000, "参数校验错误"),
    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
