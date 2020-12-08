package com.jet.demo.common;

import java.io.Serializable;

/**
 * @Description: 自定义返回结果类
 * @Auther: Jet
 * @Date: 2020/11/10 11:37
 **/
public class Result implements Serializable {
    private Integer code;
    private String message;
    private Object data;

    public Result() {

    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }

    public Result(ResultCode resultCode, Object data) {
        this.code = resultCode.code();
        this.message = resultCode.message();
        this.data = data;
    }

    public void setResultCode(ResultCode resultCode) {
        this.code = resultCode.code();
        this.message = resultCode.message();
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Result success() {
        Result res = new Result();
        res.setResultCode(ResultCode.SUCCESS);
        return  res;
    }
    public static Result success(Object data) {
        Result res = new Result();
        res.setResultCode(ResultCode.SUCCESS);
        res.setData(data);
        return  res;
    }
    public static Result failure(ResultCode resultCode) {
        Result res = new Result();
        res.setResultCode(resultCode);
        return  res;
    }
    public static Result failure(ResultCode resultCode,Object data) {
        Result res = new Result();
        res.setResultCode(resultCode);
        res.setData(data);
        return  res;
    }
    public static Result error(int code,String message) {
        Result res = new Result();
        res.setCode(code);
        res.setMessage(message);
        return  res;
    }


}
