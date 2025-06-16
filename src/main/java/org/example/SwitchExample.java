package org.example;

public class SwitchExample {
    public static void main(String[] args) {
        // switch (expression) {
        //    case value1:
        //        // code if expression == value1
        //        break;
        //    case value2:
        //        // code if expression == value2
        //        break;
        //    default:
        //        // code if no match found
        //}

        int day = 1;

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job.");
                break;
            case 'C':
                System.out.println("You passed.");
                break;
            default:
                System.out.println("Invalid grade.");
        }

        int num = 1;
        switch (num) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
        }

        String weather;
        String month = "may";

        switch (month) {
            case "january":
            case "february":
                weather = "Cold and possibly snowy.";
                break;

            case "march":
            case "april":
                weather = "Cool with a chance of rain.";
                break;

            case "may":
            case "june":
                weather = "Warming up, usually pleasant.";
                break;

            case "july":
            case "august":
                weather = "Hot and sunny.";
                break;

            case "september":
            case "october":
                weather = "Mild with falling temperatures.";
                break;

            case "november":
            case "december":
                weather = "Cold and possibly rainy or snowy.";
                break;

            default:
                weather = "Invalid month entered.";
        }
        System.out.println(weather);
    }
    // When you’re checking one variable against many fixed values
    // To clean up long if-else if chains

}
