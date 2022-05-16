package com.example.Practice_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ozbeyConfig {

    @Bean
    FullTimeMentor fullTimeMentor(){
        return  new FullTimeMentor();
    }

    @Bean
    PartTimeMentor partTimeMentor(){
        return  new PartTimeMentor();
    }
}
