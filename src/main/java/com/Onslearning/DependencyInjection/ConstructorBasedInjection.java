package com.Onslearning.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorBasedInjection {
    private HelloWorldService helloWorldService;

    @Autowired
    public ConstructorBasedInjection(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }

    public void getGreetings(String S){
        helloWorldService.SayGreetings(S);
    }
}
