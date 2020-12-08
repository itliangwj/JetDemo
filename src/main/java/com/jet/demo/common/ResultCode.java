package com.jet.demo.common;
/**
 * @Description: 定义返回接口数据字典
 * @Auther: Jet
 * @Date: 2020/11/10 11:37
 **/
public enum ResultCode {
    UNKNOWN_ERROR(-1,"未知错误"),
    SUCCESS(200,"成功"),
    SERVER_INTERNAL_ERROR(500,"服务器内部错误"),
    RESOURCE_NOT_FOUND(404,"资源未找到"),
    PARAMETER_NOT_VALID(400,"参数不合法"),
    ;
    private Integer code;
    private String message;
    ResultCode(Integer code,String message){
        this.code=code;
        this.message=message;
    }
    public Integer code(){
        return  this.code;
    }
    public  String message(){
        return this.message;
    }
}
