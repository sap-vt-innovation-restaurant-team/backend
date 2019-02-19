package com.sap.common.context;

import com.sap.common.config.BaseApplicationConfiguration;
import com.sap.common.config.BaseServiceClientConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
        BaseApplicationConfiguration.class,
        BaseServiceClientConfiguration.class
})
@Configuration
public class BaseApplication {
}
