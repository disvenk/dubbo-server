package com.consumer.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.service.DubboService;
import org.springframework.stereotype.Service;

@Service
public class UserDubboServiceImpl {

    @Reference(version = "1.0.0")
    DubboService dubboService;

    public void UseDubboService(){
        dubboService.doSomething();
    }
}
