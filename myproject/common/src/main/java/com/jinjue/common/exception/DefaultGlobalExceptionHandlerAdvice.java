package com.jinjue.demo.exception;

import com.sfc.es.entity.vo.Result;
import com.sfc.es.enums.Lang;
import com.sfc.es.utils.ContextUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MultipartException;

import java.util.List;

@Slf4j
public class DefaultGlobalExceptionHandlerAdvice {
    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public Result serviceException(MethodArgumentNotValidException ex) {
        log.error("service exception:{}", ex.getMessage());
        return validResult(ex.getBindingResult());
    }
    @ExceptionHandler(BindException.class)
    public Result bindExceptionHandler(BindException ex){
        log.error("service exception:{}", ex.getMessage());
        return validResult(ex.getBindingResult());
    }
    @ExceptionHandler(value = {MissingServletRequestParameterException.class})
    public Result missingServletRequestParameterException(MissingServletRequestParameterException ex) {
        log.error("missing servlet request parameter exception:{}", ex.getMessage());
        return Result.fail(SystemErrorType.ARGUMENT_NOT_VALID);
    }

    @ExceptionHandler(value = {MultipartException.class})
    public Result uploadFileLimitException(MultipartException ex) {
        log.error("upload file size limit:{}", ex.getMessage());
        return Result.fail(SystemErrorType.UPLOAD_FILE_SIZE_LIMIT);
    }

    @ExceptionHandler(value = {BaseException.class})
    public Result baseException(BaseException ex) {
        log.error("base exception:{}", ex.getMessage());
        return Result.fail(ex.getErrorType());
    }

    @ExceptionHandler(value = {Exception.class})
    public Result exception(Exception ex) {
        log.error(ex.getMessage(), ex);
        return Result.fail();
    }

    @ExceptionHandler(value = {Throwable.class})
    public Result throwable() {
        return Result.fail();
    }

    /**
     * 校验参数自定义异常信息
     */
    private Result validResult(BindingResult bindingResult) {
        String message = "";
        try {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            FieldError fieldError = fieldErrors.get(0);
            String field = fieldError.getField();
            String defaultMessage = fieldError.getDefaultMessage();
            String[] split = defaultMessage.split("\\|");
            //自定义的错误提示
            if (split.length > 1) {
                String language = ContextUtil.getLanguage(ContextUtil.getRequest());
                if (Lang.zh.name().equals(language)) {
                    message = split[0];
                } else if (Lang.en.name().equals(language)) {
                    message = split[1];
                } else {
                    message = split[0];
                }
            } else {//默认的valid框架错误提示
                message = field + defaultMessage;
            }

        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        Result result = null;
        SystemErrorType systemErrorType = SystemErrorType.ARGUMENT_NOT_VALID;
        if ("".equals(message)) {//全局校验信息
            result = Result.fail(systemErrorType);
        } else {
            result = new Result(systemErrorType.getCode(), message);
        }
        return result;
    }
}