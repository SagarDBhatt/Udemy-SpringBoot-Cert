package com.Onslearning.DependencyInjection;

import com.Onslearning.DependencyInjection.Service.HelloWorldEnglishImpl;
import com.Onslearning.DependencyInjection.Service.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public HelloWorldService HelloWorldEnglishImpl(){
        return new HelloWorldEnglishImpl();
    }

}
