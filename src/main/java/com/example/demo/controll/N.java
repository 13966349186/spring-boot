package com.example.demo.controll;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class N {
    @Bean
    public CreateBean a(){
        return CreateBean.create();
    }
}
