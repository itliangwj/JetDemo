package com.jet.demo.common;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.METHOD;
/**
 * @Description: 返回自定义注解
 * @Auther: Jet
 * @Date: 2020/11/10 11:43
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE,METHOD})
@Documented
public @interface ResResult {
}
