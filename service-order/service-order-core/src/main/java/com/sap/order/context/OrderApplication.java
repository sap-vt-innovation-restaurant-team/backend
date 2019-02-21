package com.sap.order.context;

import com.sap.common.config.BaseApplicationConfiguration;
import com.sap.common.config.BaseServiceClientConfiguration;
import com.sap.common.context.BaseApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({BaseApplicationConfiguration.class, BaseServiceClientConfiguration.class})
@Configuration
public class OrderApplication extends BaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
