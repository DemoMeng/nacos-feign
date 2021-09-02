package com.mqz.nacos.feign.api;

import com.mqz.nacos.feign.common.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *  版权所有 © Copyright 2012<br>
 *
 * @Author： 蒙大拿
 * @Date：2021/9/2 2:02 下午
 * @Description 公共feign接口供提供方和消费房继承、实现
 * @About： https://github.com/DemoMeng
 */
public interface FeignApi {

    @GetMapping("/feign/api/1")
    String api1(@RequestParam String para);


    @PostMapping("/feign/api/2")
    String api2(@RequestBody Bean bean);


}
