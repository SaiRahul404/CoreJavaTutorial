package org.example;

public class ForExample {
    public static void main(String[] args) {

//        for (int i = 1 ; i < 100 ; i++) {
//            System.out.println(i);
//        }
        // Initialization → executed once before the loop starts.
        //Condition → checked before each iteration. If true, the loop runs; otherwise, it stops.
        //Update → executed after each iteration (usually increments or decrements a variable).
        for (int i = 1; i <= 5; i++) { // i = i +1;
            System.out.println("Iteration: " + i);
        }

        for (int i = 1; i <= 100; i = i + 2 ) {
            if( i == 49) {
                break;
            }
            System.out.println(i);
        }
    }
}
