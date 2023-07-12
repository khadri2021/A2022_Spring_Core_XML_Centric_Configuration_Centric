package com.khadri.spring.core.xml.centric.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    public Student student(){
        return new Student();
    }
    @Bean
    public Address address(){
        return new Address();
    }
}
