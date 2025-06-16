package org.example;

import java.util.Scanner;

public class PrimeNumberExample {
    public static void main(String[] args) {
        // 2 - 1, 2 - Prime Number
        // 4 - 1,2,4 - composite Number
        // 3 - 1,3 -Prime Number
        // 6 - 1 2 3 6 - composite Number
        // 45 - 1 3 5 9 15 45
        // 100 - 1 2 4 5 10 20 25 50 100
        // 17 - 1 17
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= n/2 ; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Composite Number");
        }
    }
}
