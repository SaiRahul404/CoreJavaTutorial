package org.example;

import java.util.Scanner;

public class LargestOfNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max;

//        if (a > b && a > c) {
//            System.out.println("a is largest " + a);
//        } else if (b > c && b > a) {
//            System.out.println("b is largest " + b);
//        } else {
//            System.out.println("c is largest " + c);
//        }
        if (a > b && a > c) {
            max = a;
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("The largest element is " + max);
    }

}
