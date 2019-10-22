//package com.consumer.dubbo;
//
//import com.alibaba.dubbo.config.ApplicationConfig;
//import com.alibaba.dubbo.config.ConsumerConfig;
//import com.alibaba.dubbo.config.ProtocolConfig;
//import com.alibaba.dubbo.config.RegistryConfig;
//import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@DubboComponentScan("com.consumer.controller")
//public class ConsumerDubboConfig {
//
//    @Value("zookeeper://${rpc.registry_address}")
//    private String zkAddress;
//
//    @Value("${dubbos.brand.port}")
//    private int protocolPort;
//
//    @Value("${dubbos.provider.timeOut}")
//    private int providerTimeOut;
//
//    @Value("${dubbos.provider.retries}")
//    private int providerRetries;
//
//    /**
//     * 当前应用配置
//     */
//    @Bean
//    public ApplicationConfig applicationConfig() {
//        ApplicationConfig applicationConfig = new ApplicationConfig();
//        applicationConfig.setName("service-consumer");
//        return applicationConfig;
//    }
//
//    /**
//     * 当前连接注册中心配置
//     */
//    @Bean
//    public RegistryConfig registryConfig() {
//        RegistryConfig registryConfig = new RegistryConfig();
//        registryConfig.setAddress(zkAddress);
//        return registryConfig;
//    }
//
//    /**
//     * 当前连接注册中心配置
//     */
//    @Bean
//    public ConsumerConfig providerConfig() {
//        ConsumerConfig consumerConfig = new ConsumerConfig();
//        consumerConfig.setTimeout(providerTimeOut);
//        consumerConfig.setRetries(providerRetries);
//        return consumerConfig;
//    }
//
//
//}
