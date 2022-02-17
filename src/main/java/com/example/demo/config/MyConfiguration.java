package com.example.demo.config;

import org.springframework.lang.Nullable;
import org.springframework.validation.annotation.Validated;


@Validated
public class MyConfiguration {
    public void setEmall(Integer emall) {
        this.emall = emall;
    }

    public Integer emall;
}
