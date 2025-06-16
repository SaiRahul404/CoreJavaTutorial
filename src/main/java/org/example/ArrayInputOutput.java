package org.example;
import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
//        int[] testArray = new int[size];
//        System.out.println("Enter " + size + " elements:");
//        for (int i = 0; i < size; i++) {
//            testArray[i] = sc.nextInt();
//        }
//        System.out.println("The elements of the array are:");
//        for (int i = 0; i < size; i++) {
//            System.out.println(testArray[i]);
//        }
        double[] numbers = new double[size];
        System.out.println("Enter " + size + " double values:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextDouble();
        }
        System.out.println("The elements of the array are:");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
        sc.close();
        // This can be extended for other types like float, String, or long
    }
}
