package com.example.helloworld;

public class anotherwayofwritingArrays {
    //Another way of writing arrays

    public static void main(String[] args) {

        String[] cars = new String[3];

        cars[0] = "Camero";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        for (int i = 0; i < cars.length; i++){

            System.out.println(cars[i]);

        }
    }
}
