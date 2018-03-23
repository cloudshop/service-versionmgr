package com.eyun.versionmgr.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.eyun.versionmgr")
public class FeignConfiguration {

}
