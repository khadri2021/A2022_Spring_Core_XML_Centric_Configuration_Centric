package com.khadri.spring.core.configuration.centric.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:flower.xml")
public class Flower {

    @Value("${color}")
    private String color;

    @Value("${name}")
    private String name;

    @Value("${smell}")
    private String smell;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return "FLower{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", smell='" + smell + '\'' +
                '}';
    }
}
