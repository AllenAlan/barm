#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.server;

import com.barm.common.domain.enums.ResultEnum;
import com.barm.common.domain.vo.ResultVO;
import com.barm.common.exceptions.ApplicationException;
import com.barm.common.exceptions.ProviderException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

/**
 * @author Allen
 * @version 1.0.0
 * @description 异常处理类
 * @create 2020/2/23 23:43
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 barm
 */
@Slf4j
@RestControllerAdvice
public class ExceptionHandlers {
    @ExceptionHandler(value = ApplicationException.class)
    public ResultVO applicationException(ApplicationException ex) {
        log.error("ApplicationException: ", ex);
        String errMsg = ex.getErrMsg();
        log.info("exception for application with errMsg: " + errMsg);
        return new ResultVO(ex.getResultEnum(), errMsg);
    }


    @ExceptionHandler(value = ProviderException.class)
    public ResultVO applicationException(ProviderException ex) {
        log.error("ProviderException: ", ex);
        log.info("exception for Provider info: " + ex.getProviderInfo().toString());
        String errMsg = ex.getErrMsg();
        log.info("exception for Provider with errMsg: " + errMsg);
        return new ResultVO(ex.getResultEnum(), errMsg);
    }

    @ExceptionHandler(value = RuntimeException.class)
    public ResultVO runtimeException(RuntimeException ex) {
        log.error("exception for runtime", ex);
        ResultVO resultVO = new ResultVO(ResultEnum.FAIL, ex.getMessage());
        return resultVO;
    }


    @ExceptionHandler(value = ConstraintViolationException.class)
    public ResultVO constraintViolationExceptionHandler(ConstraintViolationException ex) {
        // 拼接错误
        StringBuilder detailMessage = new StringBuilder();
        for (ConstraintViolation<?> constraintViolation : ex.getConstraintViolations()) {
            // 使用 , 分隔多个错误
            if (detailMessage.length() > 0) {
                detailMessage.append(",");
            }
            // 拼接内容到其中
            detailMessage.append(constraintViolation.getMessage());
        }
        return new ResultVO(ResultEnum.INVALID_REQUEST_PARAM_ERROR, ResultEnum.INVALID_REQUEST_PARAM_ERROR.getMsg() + ":" + detailMessage.toString());
    }
}
