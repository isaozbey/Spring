package com.example.practice_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ozbeyApp {

    public static void main(String[] args) {

        ApplicationContext container=new AnnotationConfigApplicationContext(ozbeyConfig.class);

        Java class1=container.getBean(Java.class);
        class1.getTeachHours();



    }
}
