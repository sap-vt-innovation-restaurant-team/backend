package com.sap.user.context;

import com.sap.common.config.BaseApplicationConfiguration;
import com.sap.common.config.BaseServiceClientConfiguration;
import com.sap.common.context.BaseApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
        BaseApplicationConfiguration.class,
        BaseServiceClientConfiguration.class
})
@Configuration
public class UserApplication extends BaseApplication {
  public static void main(String[] args) {
    SpringApplication.run(UserApplication.class, args);
  }
}
