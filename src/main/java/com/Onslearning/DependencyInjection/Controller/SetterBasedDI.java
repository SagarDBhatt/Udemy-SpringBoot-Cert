package com.Onslearning.DependencyInjection.Controller;

import com.Onslearning.DependencyInjection.Service.HelloWorldEnglishImpl;
import com.Onslearning.DependencyInjection.Service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@ComponentScan
public class SetterBasedDI {

    private HelloWorldService helloWorldService;

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void getMessage(String s){
        helloWorldService.SayGreetings(s);
    }
}
