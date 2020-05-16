package com.Onslearning.DependencyInjection.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/*@Component
@Profile("English")*/
public class HelloWorldEnglishImpl implements HelloWorldService{

    public void sayHello(){
        System.out.println("Hello, Welcome to Spring Framework");
    }

    @Override
    public void SayGreetings(String S) {
        System.out.println("Greetings from Spring ---------- ");
        System.out.println(S);
    }
}
