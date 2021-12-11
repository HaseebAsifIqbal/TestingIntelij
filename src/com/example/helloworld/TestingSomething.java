package com.example.helloworld;

import com.sun.tools.javac.Main;

public class TestingSomething {
// Car
    static car Car;

    public static void main(String[] args){

        new Main();
        Car = new car(4,4);

        System.out.println("The car has "+Car.getWheels()+" wheels.");

    }


}
