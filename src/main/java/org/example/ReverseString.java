package org.example;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        // "Abcd"
        // "dcbA"
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str1 = sc.next();
        String rev = ""; // Empty String

        for ( int i = str1.length()-1; i>=0; i--) {
            rev = rev + str1.charAt(i);
        }
        System.out.println("Reversed String: " + rev);

    }
}
