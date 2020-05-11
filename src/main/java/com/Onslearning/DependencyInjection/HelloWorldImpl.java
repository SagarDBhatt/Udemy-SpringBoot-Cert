package com.Onslearning.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorldService{

    public void sayHello(){
        System.out.println("Hello, Welcome to Spring Framework");
    }

    @Override
    public void SayGreetings(String S) {
        System.out.println("Greetings from Spring ---------- ");
        System.out.println(S);
    }
}
