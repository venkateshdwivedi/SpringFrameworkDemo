package com.example;

public class Laptop implements Computer {

    @Override
    public void compile(){
        System.out.println("compiling using laptop");
    }
}
