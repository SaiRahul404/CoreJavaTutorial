package org.example;

import javafx.beans.binding.When;

public class DoWhile {
    public static void main(String[] args) {
        // A do-while loop is like a set of instructions that will always run at least once, and then keep repeating as long as a certain condition is true.
        // do {
        //    // Code to repeat goes here
        //} while (condition);

        // do {
        //    // Code to repeat goes here
        //} while (condition);
        // After running, Java checks the condition.
        // If the condition is true, it repeats.
        // If the condition is false, it stops.
        int number = 1;
//        do {
//            System.out.println(number); // Print the number
//            number = number + 1;        // Go to the next number
//        } while (number < 0);

//        for (int i = 1; i <= 10; i++) {
//            if (i == 5) {
//                break; // Stop the loop completely when i is 5
//            }
//            if (i % 2 == 0) {
//                continue; // Skip even numbers
//            }
//            System.out.println(i);
//        }
//        int i = 1;
//        do {
//            if (i == 5) {
//                break; // Stop the loop completely when i is 5
//            }
//            System.out.println(i);
//            i++;
//        } while (i <= 10);
//        int i = 2;
//        do {
//            if (i % 2 == 0) {
//                i++;         // Important: increment before continue to avoid infinite loop
//                continue;    // Skip the rest and go to next iteration
//            }
//            System.out.println(i);
//            i++;
//        } while (i <= 10);

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Stop the loop completely when i is 5
            }
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println(i);
        }
    }
    // while loop: Checks the condition before running the code.
    //do-while loop: Runs the code first, then checks the condition.
    // So, use do-while when you want your code to run at least once, no matter what!

   //  break	Exits the loop early	When you want to stop once a condition is met
    // continue	Skips to next cycle	When you want to skip certain cases but continue looping


}
