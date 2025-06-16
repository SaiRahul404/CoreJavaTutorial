package org.example;

import java.util.Scanner;

public class SwapProgram {
    public static void main(String[] args) {
        // a = 5 b = 10 -> a =10, and b =5
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int a = sc.nextInt();
        System.out.print("Enter the second value: ");
        int b = sc.nextInt();
        System.out.println("Before swapping: a = " + a + ", b = " + b);
//        int c = a; // new variable
//        a = b;
//        b = c;
        a = a + b; // 10 + 5
        b = a - b; // 15 -5
        a = a - b;// 15 - 10

        System.out.println("After swapping: a = " + a + ", b = " + b);

    }
}
