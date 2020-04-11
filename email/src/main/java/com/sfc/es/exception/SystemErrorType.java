package com.sfc.es.exception;


import com.sfc.es.enums.Lang;
import com.sfc.es.utils.ContextUtil;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Getter
public enum SystemErrorType implements ErrorType {
    SYSTEM_SUCCESS("000000", "处理成功", "action success"),

    SYSTEM_ERROR("-1", "系统异常", "system error"),

    SYSTEM_BUSY("000001", "系统ErrorType繁忙,请稍候再试", ""),
    SYSTEM_NO_PERMISSION("000002", "无权限", ""),

    GATEWAY_NOT_FOUND_SERVICE("010404", "服务未找到", ""),
    GATEWAY_ERROR("010500", "网关异常", ""),
    GATEWAY_CONNECT_TIME_OUT("010002", "网关超时", ""),

    ARGUMENT_NOT_VALID("020000", "请求参数校验不通过", ""),
    UPLOAD_FILE_SIZE_LIMIT("020001", "上传文件大小超过限制", ""),

    FIND_ERROR("020002", "查找错误", "find error"),
    EDIT_ERROR("020003", "更新错误", "edit error"),
    ADD_ERROR("020004", "添加错误", "add error"),
    DELETE_ERROR("020005", "删除错误", "delete error"),


    /*命名规则举例：031100 -> 03业务异常-1公共模块-100职位管理*/
    /*职位管理*/
    POSITION_NAME_ALREADY_EXISTS("031100", "职位名称已存在！", "position name already exists"),
    POSITION_ID_NOT_EXISTS("031101", "职位id不存在！", "position id not exists"),
    RIGHT_ID_NOT_EXISTS("031102", "权限id不存在！", "right id not exists"),
    /*部门管理*/
    DEPARTMENT_NAME_ALREADY_EXISTS("031200", "部门名称已存在！", "department name already exists"),
    COMPANY_NAME_ALREADY_EXISTS("031300", "公司名称已存在！", "company name already exists"),
    /*菜单管理*/
    USERMENU_NAME_ALREADY_EXISTS("031400", "菜单名称已存在！", "menu name already exists"),
    USERMENU_NAME_NOT_EMPTY("031401", "菜单名称不能为空！", "Menu name cannot be empty"),
    /*系统管理*/
    SYSTEM_NAME_ALREADY_EXISTS("031500", "系统名称已存在！", "system name already exists"),
    SEND_MAIL_EXCEPTION("031501", "发送邮件异常！", "Send mail exception"),
    VERIFICATION_CODE_FAILURE("031502", "验证码失效！", "Verification Code Failure"),
    UUID_CHECKOUT_FAILED("031503", "UUID校验不通过！", "UUID Checkout Failed"),
    USER_NOT_EXISTS("031504", "该用户不存在！", "The user does not exist"),
    USER_NOT_FIRST_LOGIN("031505", "用户非第一次登陆状态！", "User's non-first login status"),
    OLD_PASSWORD_CHECKOUT_FAILED("031506", "用户密码校验失败！", "Old Password Checkout Failed"),
    UPDATE_PASSWORD_ERROR("031507", "更新密码失败！", "Failed to update password"),
    REQUEST_FREQUENT("031508", "请求频繁，请稍后再试！", "Requests are frequent. Please try again later."),

    /*公司*/
    COMPANY_EXIT_USER("031601", "公司下存在用户", "company exist user"),
    COMPANY_EXIT_COMPANY("031602", "公司下存在子公司", "company exist children company"),


    ;


    /**
     * 错误类型码
     */
    private String code;
    /**
     * 错误类型描述信息( 返回)
     */
    private String message;

    /**
     * 错误类型描述信息(中文)
     */
    private String cnEessage;
    /**
     * 错误类型描述信息(英文)
     */
    private String enEessage;

    SystemErrorType(String code, String cnEessage, String enEessage) {
        this.code = code;
        this.cnEessage = cnEessage;
        this.enEessage = enEessage;
    }

    /**
     * 返回提示语  cn为中文，en为英文
     *
     * @return
     */
    public String getMessage() {
        try {
            String language = ContextUtil.getLanguage(ContextUtil.getRequest());
            if (Lang.zh.name().equals(language)) {
                return cnEessage;
            } else if (Lang.en.name().equals(language)) {
                return enEessage;
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return cnEessage;
    }
}
