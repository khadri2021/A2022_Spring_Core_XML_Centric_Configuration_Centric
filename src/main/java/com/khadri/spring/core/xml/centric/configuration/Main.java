package com.khadri.spring.core.xml.centric.configuration;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = context.getBean(Student.class);
        System.out.println(student);

        FLower fLower = context.getBean(FLower.class);
        System.out.println(fLower);

    }
}