package org.example;

public class NestedLoopsExample {
    public static void main(String[] args) {
        // A nested loop means:
        //
        //One loop inside another loop.
        for (int i = 1; i <= 3; i++) {        // outer loop
            for (int j = 1; j <= 2; j++) {    // inner loop
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        // for i =1 -> j = 1, 2
        // for i =2 -> j = 1, 2
        // for i =3 -> j = 1, 2

        // i = 1, j = 1 and 2
        //
        //i = 2, j = 1 and 2
        //
        //i = 3, j = 1 and 2
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(); // Move to the next line
//        }

        // for i = 1 ; j<=1 -> j=1
        // for i = 2 ; j<=2 -> j=1 and 2
        // for i = 3 ; j<=3 -> j=1  2 and 3
        // for i = 4 ; j<=4 -> j=1  2  3 and 4
        // for i = 5 ; j<=5 -> j=1  2  3 4 and 5
//        for (int i = 5; i >= 0; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(); // Move to the next line
//        }

        for (int i = 1; i <= 3; i++) {        // Outer loop → 3 rows
            for (int j = 1; j <= 5; j++) {    // Inner loop → 5 columns
                System.out.print("* ");
            }
            System.out.println();  // Move to next line after each row
        }

        for (int i = 1; i <= 4; i++) {          // Outer loop → rows
            for (int j = 1; j <= i; j++) {      // Inner loop → print numbers from 1 to row number
                System.out.print(j);
            }
            System.out.println();
        }
        // // for i = 1 ; j<=1 -> j=1
        //        // for i = 2 ; j<=2 -> j=1 and 2
        //        // for i = 3 ; j<=3 -> j=1  2 and 3
        //        // for i = 4 ; j<=4 -> j=1  2  3 and 4

        // *****
        // *   *
        // *****

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 3 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //     *
        //    ***
        //   *****
        //  *******
        // *********

        for (int i = 1; i <= 5; i++) {
            //
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // *********
        //  *******
        //   *****
        //    ***
        //     *


    }
}



