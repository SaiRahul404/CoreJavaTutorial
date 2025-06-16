package org.example;
import java.util.Scanner;

// Scanner is a part of the java.util package.

public class ScannerExample {
    public static void main(String[] args) {
// Imagine you're writing a program and you want it to ask the user for input — like their name, age, or a number. You need a tool to "listen" to the keyboard or other input sources.
        Scanner sc = new Scanner(System.in); // creating an a object for the Scanner class
//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
//        System.out.println(age);
//        System.out.print("Enter a decimal number: ");
//        float number = sc.nextFloat();
//        System.out.println(number);
//        System.out.print("Enter a character: ");
//        char ch = sc.next().charAt(0);
//        System.out.println(ch);
//        System.out.print("Enter your full name: ");
//        String fullName = sc.nextLine(); // Reads entire line
//        System.out.println("Hello, " + fullName);

        System.out.print("Enter the day : ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
        System.out.print("Enter the grade : ");
        char grade = sc.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job.");
                break;
            case 'C':
                System.out.println("You passed.");
                break;
            default:
                System.out.println("Invalid grade.");
        }
        sc.close();
    }
}
