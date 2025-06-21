package com.example.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.example.Alien;
import com.example.Desktop;
import com.example.Laptop;
import com.example.Computer;


@Configuration
@ComponentScan("com.example")
public class AppConfig {

    // @Bean
    // public Alien alien(@Qualifier("desktop")Computer com){ 
    
    //if no qualifier and only one instance exixts then automatically links to desktop() as only one instance is there

    
    //     Alien obj=new Alien();
    //     obj.setAge(25);
    //    // obj.setComputer(desktop());//tightly coupled
    //     obj.setComputer(com);//loosely coupled
    //     return obj;
    // }

    // @Bean //(name="com") //by deafult method name is bean name i.e. desktop
    // // @Scope("prototype")
    
    // //@Primary// used if @Qualifier not used
    // public Desktop desktop(){
    //     return new Desktop();
    // }

    // @Bean
    // public Laptop laptop(){
    //     return new Laptop();
    // }

}
