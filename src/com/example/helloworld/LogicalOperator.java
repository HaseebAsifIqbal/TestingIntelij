package com.example.helloworld;
import java.util.Scanner;
public class LogicalOperator {

    public static void main(String[] args) {


// This is the and operator
        int temp = 30;

        if (temp > 30){

            System.out.println("It is hot outside");

        }else if(temp >= 20 && temp<=30){

            System.out.println("It is warm outside!");

        }else{
            System.out.println("It is cold outside");
        }

        // This is the or operator with not operator and the and operator
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if(!response.equals("q") && !response.equals("Q")){

          System.out.println("You are still playing the game.");

        }else{
            System.out.println("You quit the game");
        }




    }




}
