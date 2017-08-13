package com.hhx.enums;

/**
 * result返回值
 *
 * @author huhuixin
 * @create 2017/7/14 下午1:06
 */

public enum ResultEnum {

    //成功
    SUCCESS(200, "成功"),
    NO_DATA(204, "无内容"),

    //客户方错误
    REFUSE(403,"服务器拒绝请求"),
    HTTP_REQUEST_METHOD_ERR(405,"请求方式错误"),

    //服务器错误
    UNKONW_ERROR(500, "服务器内部错误"),

    //自定义返回值
    VCI_NOT_EXIST(4041,"设备号不存在"),


    MISSING_PARAMETER(4121,"参数不足"),
    METHOD_ARGUMENT_TYPE_MISMATCH(4122,"参数类型错误"),

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
