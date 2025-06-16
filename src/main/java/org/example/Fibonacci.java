package org.example;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        // 0 1 1 2 3 5 8 13 21 34
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the Series: ");
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
    }

    // a   b    next
    // 5   8     8


    // 0 1 1 2 3 5
}
