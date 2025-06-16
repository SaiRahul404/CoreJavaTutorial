package org.example;

public class ArrayExample {
    public static void main(String[] args) {
        int mathsmarks = 100;
        int socailMarks = 80;
        // Java arrays are a fundamental concept that allows you to store and manage multiple values in a single variable
        // If you want to store multiple numbers (e.g., 10, 20, 30), you can use an array instead of creating separate variables for each number.
        //  Once you create an array, its size cannot change. If you need more storage, you have to create a new array.
        // Same Data Type: All items in an array must be of the same data type (e.g., all integers, all strings, etc.).
        // Zero-Based Index: Arrays start counting from 0. The first item is at index 0, the second at index 1, and so on.
        int[] numbers = new int[5]; //  Creates an array that can hold 5 integers
        numbers[0] = 10; // Assigns 10 to the first box (index 0)
        numbers[1] = 20; // Assigns 20 to the second box (index 1)
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        System.out.println();

        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8};
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println(numbers.length);

        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }
// Finding the Length of an Array Use .length to know how many items the array can hold:
        System.out.println(numbers[5]); // If you try to access an index that doesn’t exist, Java will throw an error:

        // Organized Data: Keeps related data together.
        //Efficient Access: Quickly access any item using its index.
        //Simplicity: Easy to use and understand.

        // Limitations of Arrays
        //Fixed Size: You can’t resize an array once it’s created.
        //Use ArrayList if you need a resizable array.
        //Same Data Type: All elements must be of the same type.

    }
}
