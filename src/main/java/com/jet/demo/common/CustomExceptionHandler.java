package com.jet.demo.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.PrintWriter;
import java.io.StringWriter;
/**
 * @author Jet
 * @version 1.0
 * @description: 捕捉全局异常并封装返回json格式接口
 * @date 2020/12/8 15:35
 */
@ControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result handleException(Exception e) {
        StringWriter sw =new StringWriter();
        PrintWriter pw =new PrintWriter(sw);
        e.printStackTrace(pw);
        String msg=sw.toString();
//        e.printStackTrace();
        return Result.failure(ResultCode.SERVER_INTERNAL_ERROR,msg);
    }


    @ExceptionHandler(BaseException.class)
    @ResponseBody
    public Result handleAPPException(BaseException e) {
        return Result.error(e.getCode(),e.getMessage());
    }


}
