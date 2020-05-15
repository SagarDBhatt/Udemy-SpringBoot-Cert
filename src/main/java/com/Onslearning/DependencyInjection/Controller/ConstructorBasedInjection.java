package com.Onslearning.DependencyInjection.Controller;

import com.Onslearning.DependencyInjection.Service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class ConstructorBasedInjection {
    private HelloWorldService helloWorldService;

    @Autowired
    public ConstructorBasedInjection(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }

    public void getMessage(String S){
        helloWorldService.SayGreetings(S);
    }
}
