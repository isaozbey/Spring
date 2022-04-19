package com.example.Practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        ApplicationContext container=new AnnotationConfigApplicationContext(myConfig.class);

        FullTimeMentor ft =container.getBean(FullTimeMentor.class);
        ft.create();

        PartTimeMentor pt=container.getBean(PartTimeMentor.class);
        pt.create();
    }
}
