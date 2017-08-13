package com.hhx.util;

import com.hhx.enums.ResultEnum;

/**
 * Rest通用异常
 *
 * @author huhuixin
 * @create 2017/7/14 下午1:17
 */

public class RestException extends RuntimeException{

    private ResultEnum resultEnum;

    public RestException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.resultEnum = resultEnum;
    }

    public ResultEnum getResultEnum() {
        return resultEnum;
    }

    public void setResultEnum(ResultEnum resultEnum) {
        this.resultEnum = resultEnum;
    }
}
