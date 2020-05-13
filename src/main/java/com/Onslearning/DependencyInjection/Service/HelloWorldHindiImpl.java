package com.Onslearning.DependencyInjection.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Profile("Hindi")
public class HelloWorldHindiImpl implements HelloWorldService {


    @Override
    public void SayGreetings(String S) {
        System.out.println("===== Apka swagat hey ======");
        System.out.println(S);
    }
}
