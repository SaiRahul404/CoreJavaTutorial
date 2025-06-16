package org.example;

public class IfElseIfExample {
    public static void main(String[] args) {
        // if = check a condition
        //
        //else if = check another condition if the first one is false
        //
        //else = run this if none of the above conditions are true

//        if (condition1) {
//            // code runs if condition1 is true
//        } else if (condition2) {
//            // code runs if condition2 is true
//        } else {
//            // code runs if none of the above conditions are true
//        }

        int age = 6;

        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age < 20) {
            System.out.println("You are a teenager.");
        } else if (age < 30) {
            System.out.println("You are an middle age guy.");
        } else {
            System.out.println("You are an adult");
        }

        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }

        int temperature = 30;

        if (temperature > 35) {
            System.out.println("It's too hot!");
        } else if (temperature >= 25) {
            System.out.println("It's a nice day.");
        } else if (temperature >= 15) {
            System.out.println("It's a bit chilly.");
        } else {
            System.out.println("It's cold!");
        }

        int age1 = 45;

        if (age1 >= 18 && age1 <= 30) {
            System.out.println("You are eligible to apply.");
        } else {
            System.out.println("You are not eligible.");
        }
// The condition is true only if age is between 18 and 30.
//
//Since 25 meets both, it prints:

        boolean isWeekend = true;
        boolean isHoliday = false;

        if (isWeekend || isHoliday) {
            System.out.println("You can relax today!");
        } else {
            System.out.println("Time to work or study.");
        }

        int marks1 = 87;
        boolean hasBonus = false;

        if ((marks1 >= 85 && hasBonus) || marks1 == 100) {
            System.out.println("You got an A+!");
        } else {
            System.out.println("Keep trying!");
        }

        int choice = 100;
        if (choice == 1) {
            // do something
        } else if (choice == 2) {
            // do something else
        } else if (choice == 3) {
            // more stuff
        } else if (choice == 4) {
            // even more stuff
        } else {
            // default
        }

    }
}
