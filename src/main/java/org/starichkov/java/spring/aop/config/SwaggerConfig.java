package org.starichkov.java.spring.aop.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Vadim Starichkov
 * @since 20.11.2018 18:59
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI scimServiceOpenAPI(final BuildProperties buildProperties) {
        return new OpenAPI()
                .info(new Info().title("Spring Boot APO examples HTTP API")
                        .description("Spring Boot APO examples HTTP API reference for the developers")
                        .version(buildProperties.getVersion())
                );
    }
}
