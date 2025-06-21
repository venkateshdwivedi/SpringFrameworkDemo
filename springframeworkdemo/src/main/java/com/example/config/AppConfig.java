package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.Alien;
import com.example.Desktop;
import com.example.Computer;


@Configuration
public class AppConfig {

    @Bean
    public Alien alien(Computer com){ //automatically links to desktop() as only one instance is there
        Alien obj=new Alien();
        obj.setAge(25);
       // obj.setComputer(desktop());//tightly coupled
        obj.setComputer(com);//loosely coupled
        return obj;
    }

    @Bean //(name="com") //by deafult method name is bean name i.e. desktop
    // @Scope("prototype")
    
    public Desktop desktop(){
        return new Desktop();
    }

}
