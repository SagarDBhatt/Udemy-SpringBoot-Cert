package com.Onslearning.DependencyInjection;

import org.graalvm.compiler.lir.CompositeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
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
