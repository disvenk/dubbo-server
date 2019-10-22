package com.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.consumer.dubbo.UserDubboServiceImpl;
import com.dubbo.service.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dubbo")
public class UseDubboController {

    @Reference(version = "1.0.0")
    DubboService dubboService;

    @Autowired
    UserDubboServiceImpl userDubboService;

    @RequestMapping("dubboTest")
    public String dubboTest(){
        userDubboService.UseDubboService();
        return dubboService.doSomething();
    }
}
