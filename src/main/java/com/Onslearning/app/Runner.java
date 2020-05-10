package com.Onslearning.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Runner {

    public static void main(String[] args) {
        /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        HelloWorld object = context.getBean(HelloWorld.class);

        System.out.println(object.sayHello());*/
        
        ApplicationContext cont = SpringApplication.run(Runner.class,args);
        HelloWorld object = cont.getBean(HelloWorld.class);

        System.out.println(object.sayHello());
    }
}
