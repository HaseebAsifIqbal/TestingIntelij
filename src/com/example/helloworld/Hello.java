package com.example.helloworld;
import java.util.Scanner;


public class Hello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Git Test 3
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("What is your age? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("You are: "+age+" years old.");
        System.out.println("What is your favorite food? ");
        String food = scanner.nextLine();
        System.out.println("Your favorite food is: "+food);


        System.out.println("Hello "+name);

    }

    }


