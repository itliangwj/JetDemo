package com.jet.demo.controller;

import com.jet.demo.common.BaseException;
import com.jet.demo.common.ResResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author Jet
 * @version 1.0
 * @description: 测试接口
 * @date 2020/12/8 15:35
 */
@RestController
public class Test2 {

    @PostMapping(value = "/getCommonList")
    @ResResult
    public Object getCommonList(@RequestBody String body) {
        int a=1/0;
        return "aaa";
    }
    @PostMapping(value = "/getCommon")
    @ResResult
    public Object getCommon(@RequestBody String body) {
        throw new BaseException(1000,"测试自定义异常");
    }
}
