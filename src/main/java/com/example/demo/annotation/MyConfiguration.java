package com.example.demo.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    public MyConfiguration(){
        System.out.println("配置内无参构造");
    }

    @Bean
    public T t(){
        return new T();
    }
}
