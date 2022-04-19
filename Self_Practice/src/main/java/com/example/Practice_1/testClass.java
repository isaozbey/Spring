package com.example.Practice_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testClass {

    public static void main(String[] args) {
        ApplicationContext container=new AnnotationConfigApplicationContext(ClassConfig.class);
        Java class_1=container.getBean(Java.class);
        class_1.print();



    }
}
