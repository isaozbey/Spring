package com.example.Practice_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ozbeyAPP {

    public static void main(String[] args) {

        ApplicationContext container=new AnnotationConfigApplicationContext(ozbeyConfig.class,testConfig.class);

        FullTimeMentor ft=container.getBean(FullTimeMentor.class);
        ft.createAccount();

        String result=container.getBean(String.class);

        System.out.println(result);

    }
}
