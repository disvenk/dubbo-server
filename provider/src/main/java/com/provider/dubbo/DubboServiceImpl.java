package com.provider.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.service.DubboService;
import org.springframework.stereotype.Component;

@Service(interfaceClass = DubboService.class,timeout = 1000,version = "1.0.0")
@Component
public class DubboServiceImpl implements DubboService {
    @Override
    public String doSomething() {
        System.out.println("我是dubbo服务");
        return "printSuccess";
    }
}
