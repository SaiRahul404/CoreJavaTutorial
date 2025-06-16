package org.example;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
//        while(condition) {
//            // code to execute
//        }
        int i = 7;
        while (i <= 5) {
            System.out.println("Iteration: " + i);
            //i++; // i = i+1;
            i = i + 2;
        }
        System.out.println("Outside while loop");
        // The condition is checked before executing the loop.
        // If the condition is false initially, the loop never executes.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = scanner.nextInt();
        int j = 1;
//        while (j <= n) {
//            if (j == 5) {
//                break;
//            } else {
//                System.out.println(j);
//            }
//            j++;
//        }
        while (j <= n) {
            j++;
            if (j == 5) {
                continue;
            }
            System.out.println(j);


        }
    }
}
