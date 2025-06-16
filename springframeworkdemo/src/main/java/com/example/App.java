package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
        ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1= (Alien) context.getBean("alien");
        // Alien obj=new Alien();
        obj1.code();

        Alien obj2= (Alien)context.getBean("alien");
        obj2.code();

        //calling .getBeans two times does not affect object creation, its still created only one time

        
    }
}
