//package com.provider.dubbo;
//
//import com.alibaba.dubbo.config.ApplicationConfig;
//import com.alibaba.dubbo.config.ProtocolConfig;
//import com.alibaba.dubbo.config.ProviderConfig;
//import com.alibaba.dubbo.config.RegistryConfig;
//import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@DubboComponentScan("com.provider")
//public class ProviderDubboConfig {
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
//     * 提供方应用信息，用于计算依赖关系
//     * <dubbo:application name="service-provider" />
//     */
//    @Bean
//    public ApplicationConfig applicationConfig() {
//        ApplicationConfig applicationConfig = new ApplicationConfig();
//        applicationConfig.setName("service-provider");
//        return applicationConfig;
//    }
//
//    /**
//     * 当前连接注册中心配置,这里使用的注册中心是zookeeper
//     * <dubbo:registry address="zookeeper://${rpc.registry_address}" />
//     */
//    @Bean
//    public RegistryConfig registryConfig() {
//        RegistryConfig registryConfig = new RegistryConfig();
//        registryConfig.setAddress(zkAddress);
//        return registryConfig;
//    }
//
//    /**
//     *用dubbo协议在20880端口暴露服务
//     * <dubbo:protocol name="dubbo" port="20880" />
//     */
//    @Bean
//    public ProtocolConfig protocolConfig() {
//        ProtocolConfig protocolConfig = new ProtocolConfig();
//        protocolConfig.setName("dubbo");
//        protocolConfig.setPort(protocolPort);
//        return protocolConfig;
//    }
//
//    /**
//     * 当前连接注册中心配置
//     */
//    @Bean
//    public ProviderConfig providerConfig() {
//        ProviderConfig providerConfig = new ProviderConfig();
//        providerConfig.setTimeout(providerTimeOut);
//        providerConfig.setRetries(providerRetries);
//        return providerConfig;
//    }
//
//}
