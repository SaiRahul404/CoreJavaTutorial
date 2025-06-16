package org.example;

public class IfElseExample {
    public static void main(String[] args) {
        // if (condition) {
        //    // do this if the condition is true
        //} else {
        //    // do this if the condition is false
        //}
        int age = 2;

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        int number = 5;

        if (number >= 0) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is negative.");
        }

        int number1 = 8;

        if (number1 % 2 == 0) {
            System.out.println("Even number.");
        } else {
            System.out.println("Odd number.");
        }
    }
}
