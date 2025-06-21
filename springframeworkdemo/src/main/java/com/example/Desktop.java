package com.example;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Primary //it can also be used if qualifier not used
// @Scope("prototype") //scope can be used here
public class Desktop implements Computer {

   public Desktop(){
      System.out.println("desktop object created");
   }
    @Override
    public void compile(){
      System.out.println("compiling using desktop");
   }
}
