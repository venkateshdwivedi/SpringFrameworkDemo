package com.example;

public class Alien {

    private int age;
    private Laptop laptop; //only reference created not object

    public Alien(){ //constructor
        System.out.println("alien object created");
    }

 

    public Alien(int age, Laptop laptop) {
        System.out.println("para constructor called");
        this.age = age;
        this.laptop = laptop;
    }



    public Laptop getLaptop() {
        return laptop;
    }
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("setter of laptop called");
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
