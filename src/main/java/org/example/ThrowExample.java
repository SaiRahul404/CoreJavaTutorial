package org.example;

public class ThrowExample {
    public static void main(String[] args) {
        // Example 1: Valid input
        try {
            double result1 = calculateSquareRoot(25);
            System.out.println("Square root of 25 is: " + result1); // Output: Square root of 25 is: 5.0
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("---");

        // Example 2: Invalid input, will throw an exception
        try {
            double result2 = calculateSquareRoot(-9); // This will cause an IllegalArgumentException
            System.out.println("Square root of -9 is: " + result2); // This line will not be executed
        } catch (IllegalArgumentException e) {
            // The exception thrown by calculateSquareRoot(-9) is caught here
            System.err.println("Caught an error: " + e.getMessage()); // Output: Caught an error: Cannot calculate square root of a negative number: -9.0
        }

        System.out.println("Program continues after handling the exception.");
    }

    public static double calculateSquareRoot(double number) {
        if (number < 0) {
            // If the number is negative, we throw an IllegalArgumentException
            // This indicates that the method received an invalid argument.
            throw new IllegalArgumentException("Cannot calculate square root of a negative number: " + number);
        }
        return Math.sqrt(number);
    }
}
