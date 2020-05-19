package com.Onslearning.DependencyInjection.Driver;

import com.Onslearning.DependencyInjection.Service.HelloWorldEnglishImpl;
import com.Onslearning.DependencyInjection.Service.HelloWorldHindiImpl;
import com.Onslearning.DependencyInjection.Service.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan
public class AppConfiguration {
    @Bean
    @Profile("default")
    public HelloWorldService HelloWordlEnglishImpl(){
        return new HelloWorldEnglishImpl();
    }

    @Bean
    @Profile("Hindi")
    public HelloWorldService HelloWorldHindiImpl(){
        return new HelloWorldHindiImpl();
    }
}
