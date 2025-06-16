package org.example;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int n = sc.nextInt();
        // 121
        // 121
        int original = n;
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        if (rev == original) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not an palindrome");
        }
    }
}
