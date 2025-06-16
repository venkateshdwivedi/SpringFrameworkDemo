package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
        ApplicationContext context1 =new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1= (Alien) context1.getBean("alien");
        // Alien obj=new Alien();
        obj1.code();
        // ApplicationContext context2 =new ClassPathXmlApplicationContext("spring.xml"); //creates new object when scope is singleton


        Alien obj2= (Alien)context1.getBean("alien");//.getbean creates new object when scope gets changed to prototype
        obj2.code(); 
        //calling .getBean two times does not affect object creation, its still created only one time


        
    }
}
