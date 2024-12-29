package com.example.myproject_productservice.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate createRestTemplate() {
        return new RestTemplate();
    }
}
//Spring creates an object of all special classes on starting a spring app and puts
// them in it's app context