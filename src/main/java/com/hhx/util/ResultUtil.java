package com.hhx.util;



import com.hhx.bean.Result;
import com.hhx.enums.ResultEnum;

import java.util.Collection;

/**
 * 返回值工具类
 *
 * @author huhuixin
 * @create 2017/7/14 下午12:54
 */

public class ResultUtil {

    public static Result build(Object object) {
        if (object == null) {
            return error(ResultEnum.NO_DATA);
        }
        if (object instanceof Collection){
            if(((Collection)(object)).isEmpty()){
                return error(ResultEnum.NO_DATA);
            }
        }
        return success(object);
    }

    public static Result success(Object object) {
        Result result = new Result(ResultEnum.SUCCESS);
        result.setData(object);
        return result;
    }

    public static Result success() {
        return new Result(ResultEnum.SUCCESS);
    }

    public static Result error(ResultEnum resultEnum) {
        return new Result(resultEnum);
    }

    @Override
    public String toString() {
        return GsonUtil.toJson(this);
    }
}
