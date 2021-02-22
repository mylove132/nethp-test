package com.nethp.test.user.provoder.config;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RefreshScope
@Configuration
public class InitServerConfiguration {

    @NacosValue("user.server.port")
    private Integer port;

    @Bean
    public TomcatServletWebServerFactory tomcatServletWebServerFactory(){
        System.out.println("服务端口："+port);
        return new TomcatServletWebServerFactory(port) ;
    }
}
