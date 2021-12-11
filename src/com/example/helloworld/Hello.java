package com.example.helloworld;
import java.util.Scanner;


public class Hello {

    public static void main(String[] args) {
        // Variables
        String name;
        String favFood;
        int age;

        // Input
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
         name = scanner.nextLine();

        System.out.println("What is your age? ");

        age = scanner.nextInt();
        scanner.nextLine();
         System.out.println("What is your favorite food? ");

         favFood = scanner.nextLine();




        // Output
        System.out.println("Your name is: "+name);
        System.out.println("Your age is: "+age);
        System.out.println("Your favorite food is: "+favFood);


    }

    }


