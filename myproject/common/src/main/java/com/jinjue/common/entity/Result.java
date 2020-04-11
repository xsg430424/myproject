package com.jinjue.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.sfc.es.exception.BaseException;
import com.sfc.es.exception.ErrorType;
import com.sfc.es.exception.SystemErrorType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

@ApiModel(description = "rest请求的返回模型，所有rest正常都返回该类的对象")
@Getter
public class Result<T> {


    @ApiModelProperty(value = "处理结果code", required = true)
    private String code;
    @ApiModelProperty(value = "处理结果描述信息")
    private String message;
    @ApiModelProperty(value = "请求结果生成时间戳")
    private Instant timestamp;
    @ApiModelProperty(value = "处理结果数据信息")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public Result() {
        this.timestamp = Instant.now().plusMillis(TimeUnit.HOURS.toMillis(8)); // ZonedDateTime.now().toInstant();
    }

    /**
     * @param errorType
     */
    public Result(ErrorType errorType) {
        this.code = errorType.getCode();
        this.message = errorType.getMessage();
        this.timestamp = Instant.now().plusMillis(TimeUnit.HOURS.toMillis(8)); // ZonedDateTime.now().toInstant();
    }

    /**
     * @param errorType
     * @param data
     */
    public Result(ErrorType errorType, T data) {
        this(errorType);
        this.data = data;
    }

    public Result(String code, String message) {
        this.code = code;
        this.message = message;
        this.timestamp = Instant.now().plusMillis(TimeUnit.HOURS.toMillis(8)); //ZonedDateTime.now().toInstant();
    }

    /**
     * 内部使用，用于构造成功的结果
     *
     * @param code
     * @param message
     * @param data
     */
    private Result(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.timestamp = Instant.now().plusMillis(TimeUnit.HOURS.toMillis(8)); //ZonedDateTime.now().toInstant();
    }

    /**
     * 快速创建成功结果并返回结果数据
     *
     * @param data
     * @return Result
     */
    public static <T> Result<T> success(T data) {
        return new Result<T>(SystemErrorType.SYSTEM_SUCCESS, data);
    }

    /**
     * 快速创建成功结果
     *
     * @return Result
     */
    public static Result success() {
        return success(null);
    }

    /**
     * 系统异常类没有返回数据
     *
     * @return Result
     */
    public static Result fail() {
        return new Result(SystemErrorType.SYSTEM_ERROR);
    }

    /**
     * 系统异常类没有返回数据
     *
     * @param baseException
     * @return Result
     */
    public static Result fail(BaseException baseException) {
        return fail(baseException, null);
    }

    /**
     * 系统异常类并返回结果数据
     *
     * @param data
     * @return Result
     */
    public static Result fail(BaseException baseException, Object data) {
        return new Result<>(baseException.getErrorType(), data);
    }

    /**
     * 系统异常类并返回结果数据
     *
     * @param errorType
     * @param data
     * @return Result
     */
    public static Result fail(ErrorType errorType, Object data) {
        return new Result<>(errorType, data);
    }

    /**
     * 系统异常类并返回结果数据
     *
     * @param errorType
     * @return Result
     */
    public static Result fail(ErrorType errorType) {
        return Result.fail(errorType, null);
    }

    /**
     * 系统异常类并返回结果数据
     *
     * @param data
     * @return Result
     */
    public static Result fail(Object data) {
        return new Result<>(SystemErrorType.SYSTEM_ERROR, data);
    }


    /**
     * 成功code=000000
     *
     * @return true/false
     */
    @JsonIgnore
    public boolean isSuccess() {
        return SystemErrorType.SYSTEM_SUCCESS.getCode().equals(this.code);
    }

    /**
     * 失败
     *
     * @return true/false
     */
    @JsonIgnore
    public boolean isFail() {
        return !isSuccess();
    }
}
