package com.ozbey.bootstrap;

import com.github.javafaker.Faker;
import com.ozbey.model.Student;

import java.util.Arrays;
import java.util.List;

public class dataGenerator {

    public static List<Student> createStudent(){
        Faker faker=new Faker();
        List<Student> students= Arrays.asList(
                new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(10,40),faker.address().state()),
                new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(10,40),faker.address().state()),
                new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(10,40),faker.address().state()),
                new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(10,40),faker.address().state()),
                new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(10,40),faker.address().state())


        );
        return students;


    }
}
