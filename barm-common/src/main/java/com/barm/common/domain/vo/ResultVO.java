package com.barm.common.domain.vo;

import com.barm.common.domain.enums.ResultEnum;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Allen
 * @version 1.0.0
 * @description 返回结果VO
 * @create 2020/2/23 23:30
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 allennote
 */
@Data
public class ResultVO<T> {

    /** 响应码 */
    private Integer code;
    /** 响应提示 */
    private String msg;
    /** 响应数据 */
    private T data;
    /** 返回结果枚举 */
    private ResultEnum resultEnum;
    /** 是否成 */
    private Boolean success;

    public ResultVO(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
        this.resultEnum = resultEnum;
    }

    public ResultVO(ResultEnum resultEnum, T data) {
        this.resultEnum = resultEnum;
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
        this.data = data;
    }

    public ResultVO(T data) {
        this.resultEnum = ResultEnum.SUCCESS;
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
        this.data = data;
    }

    public ResultVO(ResultEnum resultEnum, String msg) {
        this.resultEnum = resultEnum;
        this.code = resultEnum.getCode();
        this.msg = msg;
    }

    public Boolean getSuccess() {
        this.success = resultEnum.equals(ResultEnum.SUCCESS);
        return success;
    }

    public static ResultVO success(){
        return new ResultVO(ResultEnum.SUCCESS);
    }

    public static ResultVO fail(){
        return new ResultVO(ResultEnum.FAIL);
    }

}
