package com.example.helloworld;

public class stringMethods {
    // String = a reference data type that can store one or more characters, reference data types have access to useful methods.

    public static void main(String[] args) {

        String name = "Test";

      // boolean result =  name.equalsIgnoreCase("teSt");
        //int result = name.length();
        //char result = name.charAt(0);
        int result = name.indexOf("T");
       System.out.println(result);
    }

}
