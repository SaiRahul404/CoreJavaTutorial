package org.example;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World! Welcome to my class");
    }
    // main is method or function
    // Why public?
    // public means this method can be accessed from outside the class.
    // The JVM needs to access this method from outside, so it must be public.

    // println is a method defined in Java


    byte smallNumber = 50;
    short medium = 2000;
    int normalNumber = 4444;
    long bigNumber = 39598059082098023L;

    float price = 9.99F; // 6 decimal places
    double precisePrice = 9.99999999; // // 15 decimal places

    // If you want to store a single letter, number, or symbol, use char.
    //Must be inside single quotes (' ').

    char letter = 'A';
    char symbol = '#';
    char numberAsChar = '5';

    boolean isJavaFun = true;
    boolean isTired = false;

    // Variable Names Are Case-Sensitive
    int salary = 5000;
    int Salary = 6000;

    // Here, salary and Salary are two different variables because one starts with 's' (small letter) and the other with 'S' (capital letter).
    //  Always use the correct spelling and case when referring to variables.

    // You can use:
    //✅ Letters (a-z, A-Z)
    //✅ Numbers (0-9)
    //✅ Underscore (_)
    //✅ Dollar sign ($)

    // The variable name cannot start with a number
    //❌ Spaces are not allowed
    //❌ You cannot use special symbols like @, #, %, &

    int myAge = 25;
    int salary_2024 = 50000;
    int $balance = 1000;

    // ❌ 2days = 7; (Starts with a number ❌)
    //❌ my salary = 5000; (Has a space ❌)
    //❌ @price = 300; (Uses a special character ❌)

    // int class = 5;  // ❌ ERROR! "class" is a reserved keyword.

    int aNumber = 5;
    int fullname = 6;

    int fullName = 6;

    // What is camelCase?
    //The first word starts with a small letter.
    //Each new word starts with a capital letter.

     int employeeSalary = 5000;
    float productPrice = 99.99F;

    //  Case-sensitive (e.g., amount and Amount are different).
    //✔ Can contain letters, numbers, _, and $.
    //✔ Cannot start with a number (e.g., 2price ❌).
    //✔ Cannot use spaces or special symbols (e.g., my price ❌).
    //✔ Cannot be a Java keyword (e.g., class ❌).
    //✔ Use camelCase (e.g., studentAge ✅).
    //✔ Use meaningful names (e.g., totalMarks instead of x).
}
