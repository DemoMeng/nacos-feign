package com.mqz.nacos.feign.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 *  版权所有 © Copyright 2012<br>
 *
 * @Author： 蒙大拿
 * @Date：2021/9/2 2:05 下午
 * @Description 公共实体，消费方和提供方共用
 * @About： https://github.com/DemoMeng
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class Bean implements Serializable {

    private String info;
    private String type;
    private String about;

}
