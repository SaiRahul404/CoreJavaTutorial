package org.example;

import java.util.Scanner;

public class ArmstrongProgram {
    public static void main(String[] args) {
        // 153  1³ + 5³ + 3³ = 1 + 125 + 27 = 153
        // 143  1+64+27 = 92
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int n = sc.nextInt();
        int original = n;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }
        if (sum == original) {
            System.out.println("Yes it is a Armstrong Number");
        } else {
            System.out.println("No it is not a Armstrong Number");
        }
    }
}
