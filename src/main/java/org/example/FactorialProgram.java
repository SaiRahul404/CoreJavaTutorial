package org.example;

import java.util.*;

public class FactorialProgram {
    public static void main(String[] args) {

        // 1! = 1 =
        // 2! = 2*1 = 2
        // 3! = 3*2*1 = 6
        // 4! = 4*3*2*1 = 24
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int n = sc.nextInt();
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of a number " + n + " is equal to " + factorial);
        sc.close();

    }
}
