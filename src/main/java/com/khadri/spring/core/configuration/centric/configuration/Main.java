package com.khadri.spring.core.configuration.centric.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Flower.class);
        Flower bean = context.getBean(Flower.class);
        System.out.println(bean);
    }
}
