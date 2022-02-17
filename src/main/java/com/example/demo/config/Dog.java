package com.example.demo.config;


import org.springframework.stereotype.Component;

@Component  //注册bean到容器中
public class Dog {
    private String name;
    private Integer age;

    //有参无参构造、get、set方法、toString()方法
}