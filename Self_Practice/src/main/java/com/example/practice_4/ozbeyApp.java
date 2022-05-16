package com.example.practice_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ozbeyApp {

    public static void main(String[] args) {

        ApplicationContext container=new AnnotationConfigApplicationContext(configCar.class);

        Person person=container.getBean(Person.class);
        System.out.println(person.getName());
        System.out.println(person.getCar().getMake());


    }
}
