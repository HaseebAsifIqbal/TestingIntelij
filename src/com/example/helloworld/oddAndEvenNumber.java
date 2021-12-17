package com.example.helloworld;
import java.util.Scanner;
public class oddAndEvenNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("Enter a number to check if its even or odd: ");

        input = scanner.nextInt();
//        double test = Math.log(2);
        if (input % 2 == 0){
            System.out.println("The integer is an even number!");
//            System.out.println(test);

        }else{
            System.out.println("The integer is an odd number!");
        }


    }


}
