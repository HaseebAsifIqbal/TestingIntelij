package com.example.helloworld;
import java.util.Scanner;
public class findingHypotenuse {

    public static void main(String[] args) {

        double x; // Side a of right triangle
        double y; // Side b of right triangle
        double z; // Side c of right triangle

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();

        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        // Calculating Hypotenuse

        z = Math.sqrt((x*x)+(y*y));
        double round = Math.round(z);
        System.out.println("The hypotenuse of your triangle is: "+z);
        System.out.println("The hypotenuse rounded is: "+round);
        scanner.close();



    }

}
