package com.example.demo.annotation;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;

@Component
public class MyValidated {
    @Email(message="邮箱格式错误") //name必须是邮箱格式
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
