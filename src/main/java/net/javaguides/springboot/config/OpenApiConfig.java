package net.javaguides.springboot.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@OpenAPIDefinition
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI baseOpenApi(){
        return new OpenAPI().info(new Info().title("Spring Doc").version("1.0,0").description("Spring doc"));
    }
}
