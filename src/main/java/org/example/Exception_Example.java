package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception_Example {

    public static void main(String[] args) {
        int age = 16;
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Error: Nullpointer.");
        } finally {

            System.out.println("Cleaning up...");
        }


    }
}

