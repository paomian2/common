package com.hhx.bean;

import com.hhx.enums.ResultEnum;
import com.hhx.util.GsonUtil;

/**
 * 返回值domain
 * @author huhuixin
 * @create 2017/7/14 下午12:56
 */

public class Result<T> {

    /** 错误码. */
    private Integer status;

    /** 提示信息. */
    private String msg;

    /** 具体的内容. */
    private T data;

    public Result() {
    }

    public Result(ResultEnum resultEnum) {
        this.status = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer code) {
        this.status = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return GsonUtil.toJson(this);
    }
}
