package com.example.demo.controll;

import com.example.demo.annotation.Property;
import com.example.demo.annotation.MyValidated;
import com.example.demo.annotation.T;
import com.example.demo.swoole.User;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @Autowired
    Property property;

    @Autowired
    MyValidated myValidated;

    @Autowired
    T t;

    @RequestMapping("/test")
    public String watch(@Validated MyValidated myValidated) {
        return property.toString();
    }

    @RequestMapping("config")
    public String config() {
        return t.toString();
    }

    @ExceptionHandler
    public String errorHandler(Exception e) {
        return e.getMessage();
    }

    @GetMapping("swoole")
    public User swoole(@ApiParam("接口睡眠面膜") String a) {
        return new User();
    }
}
