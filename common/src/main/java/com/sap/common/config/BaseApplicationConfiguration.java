package com.sap.common.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EntityScan(basePackages = {
        "com.sap.**.domain"
})
@ComponentScan({
        "com.sap.**.service",
        "com.sap.**.controller",
        "com.sap.**.client"
})
@EnableHystrix
@EnableMongoRepositories(basePackages = {
        "com.sap.**.dao"
})
public class BaseApplicationConfiguration {
  @Bean
  public ApplicationConstant applicationContext() {
    return new ApplicationConstant();
  }
}
