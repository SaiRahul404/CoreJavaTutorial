package org.example;

import java.util.*;

public class SumOfDigitsProgram {
    public static void main(String[] args) {
        // 123 → 1 + 2 + 3 = 6
        // 12345 -> 1+2+3+4+5 = 15
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        long n = sc.nextLong();
        long sum = 0;
        while (n != 0) {
            long digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
