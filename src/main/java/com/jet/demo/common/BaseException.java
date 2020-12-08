package com.jet.demo.common;
/**
 * @author Jet
 * @version 1.0
 * @description: 基础异常类
 * @date 2020/12/8 15:35
 */
public class BaseException extends RuntimeException {
    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public BaseException() {
        super();
    }
    public BaseException( int code,String message) {
        this.code=code;
        this.message=message;
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }
}