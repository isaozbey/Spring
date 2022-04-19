package com.example.Practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class myConfig {

    @Bean
    FullTimeMentor fullTimeMentor(){
        return  new FullTimeMentor();
    }

    @Bean
    PartTimeMentor partTimeMentor(){
        return  new PartTimeMentor();
    }
}
