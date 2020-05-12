package com.Onslearning.DependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sun.jvm.hotspot.HelloWorld;

@SpringBootApplication
public class Runner {

    public static void main(String[] args) {

        /**
         * Below method is used JAVA annotation to get Object of the "HelloWorldImpl.java" and call methods.
         */
        /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        HelloWorld object = context.getBean(HelloWorld.class);

        object.sayHello();*/

        /**
         * Below method is using SpringBOOT application to get object of class and call method.
         *
         *  SpringBoot application bydefault use Tomcat server to run application. Unlike, Spring Dev does not need
         *  to configure and setup Tomcat server to run Spring Application.
         */
        /*ApplicationContext cont = SpringApplication.run(Runner.class,args);
        HelloWorldImpl object = cont.getBean(HelloWorldImpl.class);

        object.sayHello();*/

        /**
         * Constructor based Dependency Injection. Using interface to call appropriate method in class.
         */
        /*
        ApplicationContext context = SpringApplication.run(Runner.class,args);
        ConstructorBasedInjection objConst = context.getBean(ConstructorBasedInjection.class);

        objConst.getGreetings("Constructor based Dependency Injection");*/

        /**
         * Setter Based Dependency Injection. 
         */
        /*ApplicationContext context = SpringApplication.run(Runner.class,args);
        SetterBasedDI obj = context.getBean(SetterBasedDI.class);

        obj.getMessage("Setter Based Dependency injection =======");*/
    }
}
