package com.example.helloworld;
import javax.swing.JOptionPane;
public class guiApplication {

    public static void main(String[] args) {
// This code is a gui test
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age = Integer.parseInt( JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are "+age+" years old.");


        double height = Double.parseDouble( JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are "+height+" feet");


    }

}
