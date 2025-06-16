package org.example;

public class MultliArrayExample {
    public static void main(String[] args) {

        int[][] numbers = {
                {1, 2, 3},  // Row 1
                {4, 5, 6},  // Row 2
                {7, 8, 9}   // Row 3
        };
//        System.out.println(numbers[0][0]);
//        System.out.println(numbers[0][1]);
//        System.out.println(numbers[0][2]);
//        System.out.println(numbers[1][0]);
//        System.out.println(numbers[1][1]);
//        System.out.println(numbers[1][2]);
//        System.out.println(numbers[2][0]);
//        System.out.println(numbers[2][1]);
//        System.out.println(numbers[2][2]);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(numbers[i][j]);
            }
        }
        int[][] newArrray = new int[3][3];
        // {
        //                {1, 1, 1},  // Row 1
        //                {1, 1, 1},  // Row 2
        //                {1, 1, 1}   // Row 3
        //        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                newArrray[i][j] = 1;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(newArrray[i][j]);
            }
        }

    }
}
