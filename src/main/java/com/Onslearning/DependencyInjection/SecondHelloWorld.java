package com.Onslearning.DependencyInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SecondHelloWorld implements HelloWorldService {
    @Override
    public void SayGreetings(String S) {
        System.out.println("This is Second Hello World Class");
        System.out.println(S);
    }
}
