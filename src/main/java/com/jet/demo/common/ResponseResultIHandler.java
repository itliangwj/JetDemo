package com.jet.demo.common;

import com.alibaba.fastjson.JSON;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.lang.reflect.Method;

/**
 * @Description: 返回接口拦截，如果加了ResponResult注解
 * @Auther: Jet
 * @Date: 2020/11/10 13:43
 **/
@ControllerAdvice
public class ResponseResultIHandler implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        System.out.println("In supports() method of " + getClass().getSimpleName());
        Method method = returnType.getMethod();
        return method.isAnnotationPresent(ResResult.class);
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        System.out.println("In beforeBodyWrite() method of " + getClass().getSimpleName());
        if (body instanceof Result) {
            return JSON.toJSONString(body);
        }
        Result success = Result.success(body);
        return  JSON.toJSONString(success);
    }
}
