package com.example.helloworld;

public class MathClassTutorial {

    public static void main(String[] args) {

        double x = 3.14;
        double y = 10;

        double w = Math.min(x,y);
       double z =  Math.max(x,y);
       double absoluteValue = Math.abs(y);
       double squareRoot = Math.sqrt(y);
       double round = Math.round(x);
      double ceil = Math.ceil(x); // This will round up the value of x.
        double floor = Math.floor(x); // This will round down the value of x.

        System.out.println(z);
        System.out.println(w);
        System.out.println(absoluteValue);
        System.out.println(squareRoot);
        System.out.println(round);
        System.out.println(ceil);
        System.out.println(floor);
    }

}
