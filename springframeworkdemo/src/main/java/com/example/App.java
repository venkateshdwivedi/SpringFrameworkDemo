package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.config.AppConfig;


public class App {
    public static void main(String[] args) {
        


        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        // Desktop dt=context.getBean(Desktop.class); // name can be used

        // Desktop dt= (Desktop)context.getBean("com");// if we use only name then type conversion required

        // dt.compile();

        Alien obj1= (Alien) context.getBean("alien");
        // obj1.setAge(21);
        System.out.println(obj1.getAge());   
        obj1.code();













        // ApplicationContext context1 =new ClassPathXmlApplicationContext("spring.xml");
        // Alien obj1= (Alien) context1.getBean("alien");
        // // Alien obj=new Alien();
        // System.out.println(obj1.getAge());   
        // obj1.code();

        // ApplicationContext context2 =new ClassPathXmlApplicationContext("spring.xml"); //creates new object when scope is singleton


        // Alien obj2= (Alien)context1.getBean("alien");//.getbean creates new object when scope gets changed to prototype
        // obj2.code(); 
        //calling .getBean two times does not affect object creation, its still created only one time


        
    }
}
