package com.example.demo.annotation;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:person.properties")
@ConfigurationProperties(prefix = "server")
public class Property {
    public Integer port;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Value("#{9*2}")
    public int age;

    @Value("${server.tt}")
    public String tt;

    @Override
    public String toString() {
        return "Property{" +
                "port=" + port +
                ", age=" + age +
                ", tt='" + tt + '\'' +
                '}';
    }
}
