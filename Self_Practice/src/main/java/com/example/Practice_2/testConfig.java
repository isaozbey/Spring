package com.example.Practice_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class testConfig {

    @Bean
    String res(){
        return  "Okkes is Mentor";
    }

    @Bean
    Integer nums(){
        return 5;
    }
}
