package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.Desktop;


@Configuration
public class AppConfig {

    @Bean //(name="com") //by deafult method name is bean name i.e. desktop
    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }

}
