package com.example.demo.controll;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


public class CreateBean {
    public Integer a = 1;

    public static CreateBean create() {
        return new CreateBean();
    }
}
