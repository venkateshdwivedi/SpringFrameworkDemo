package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("24")// to set value
    private int age;

    @Autowired //autowiring computer variable
    @Qualifier("laptop") //using class name in small letters
    private Computer computer; //only reference created not object

    public Computer getComputer() {
        return computer;
    }



    public void setComputer(Computer computer) {
        this.computer = computer;
    }



    public Alien(){ //constructor
        System.out.println("alien object created");
    }

 

    // public Alien(int age, Computer laptop) {
    //     System.out.println("para constructor called");
    //     this.age = age;
    //     this.laptop = laptop;
    // }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        // System.out.println("setter called");
        this.age = age;
    }


     public void code(){
        System.out.println("coding");
        computer.compile();;
    }

}
