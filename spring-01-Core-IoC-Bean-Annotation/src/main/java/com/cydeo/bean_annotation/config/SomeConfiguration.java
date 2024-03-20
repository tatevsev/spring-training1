package com.cydeo.bean_annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SomeConfiguration {


    @Bean
    public String manageString(){
       return "Cydeo";
    }

    @Bean
    public Integer mYInt(){
        return 5;
    }

}
