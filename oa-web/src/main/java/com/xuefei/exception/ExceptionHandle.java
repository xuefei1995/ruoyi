package com.xuefei.exception;

import com.xuefei.dto.common.BaseResp;
import com.xuefei.dto.common.BaseRespEumn;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(Exception.class)
    public BaseResp<Void> exceptionHandler(Exception e) {

        BaseResp<Void> baseResp = new BaseResp<>();
        baseResp.setSuccess(false);
        String errorMsg;

        if (e instanceof MethodArgumentNotValidException) {
            baseResp.setCode(BaseRespEumn.PARAM_ERROR.getCode());
            BindingResult bindingResult = ((MethodArgumentNotValidException) e).getBindingResult();
            errorMsg = BaseRespEumn.PARAM_ERROR.getName() + bindingResult.getFieldError().getDefaultMessage();
        } else {
            baseResp.setCode(BaseRespEumn.PARAM_ERROR.getCode());
            errorMsg = BaseRespEumn.PARAM_ERROR.getName() + e.getMessage();
        }
        baseResp.setMessage(errorMsg);
        return baseResp;
    }
}
