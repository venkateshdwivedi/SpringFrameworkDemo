package com.example;

public class Alien {

    private int age;
    public Alien(){
        System.out.println("alien object created");
    }

    
    public void code(){
        System.out.println("coding");
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }
}
