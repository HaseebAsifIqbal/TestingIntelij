package com.example.helloworld;

import com.sun.tools.javac.Main;

public class TestingSomething {

    static car car;

    public static void main(String[] args){

        new Main();
        car = new car(4,4);

        System.out.println("The car has "+car.getWheels()+" wheels.");

    }


}
