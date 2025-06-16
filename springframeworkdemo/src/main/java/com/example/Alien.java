package com.example;

public class Alien {

    private int age;
    private Laptop laptop; //only reference created not object

    public Alien(){
        System.out.println("alien object created");
    }


    public Laptop getLaptop() {
        return laptop;
    }
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }


 


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }

     public void code(){
        System.out.println("coding");
        laptop.compile();;
    }

}
