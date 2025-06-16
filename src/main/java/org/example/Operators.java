package org.example;

public class Operators {
    public static void main(String[] args) {
        // Arthimetic Operators
        int a = 10, b = 5;
        System.out.println(a + b); // 15
        System.out.println(a - b); // 5
        System.out.println(a * b); // 50
        System.out.println(a / b); // 2
        System.out.println(a % b); // 0

        //  Relational (Comparison) Operators
        // ==	Equal to	a == b
        //!=	Not equal to	a != b
        //>	Greater than	a > b
        //<	Less than	a < b
        //>=	Greater than or equal to	a >= b
        //<=	Less than or equal to	a <= b
        int x = 10, y = 20;
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x == y);
        System.out.println(x != y);

        // Logical Operators
        //These operators are used with boolean values (true or false).
        boolean a1 = true, b1 = false;
        System.out.println(a1 && b1);  // Logical AND
        System.out.println(a1 || b1); // Logical OR
        System.out.println(!a1);
        System.out.println(!b1);

        int z = 5;
        System.out.println(z);
        z++; // z = z+1
        System.out.println(z);
        z--; // z= z-1;
        System.out.println(z);

        // Operator	Meaning	Example
        //=	Assign value	a = 10
        //+=	Add and assign	a += 5 (same as a = a + 5)
        //-=	Subtract and assign	a -= 5
        //*=	Multiply and assign	a *= 5
        ///=	Divide and assign	a /= 5
        //%=	Modulus and assign	a %= 5

        int m = 10;
        m += 5; // m = m+5
        System.out.println(m);
        m /= 5;
        System.out.println(m);

        // Ternary Operator (?:)
        int m1 = 10, m2 = 20;
        int min = (m1 < m2) ? m1 : m2;
        System.out.println(min);
        // Syntax:
        //condition ? expression1 : expression2;
        // If the condition is true, it executes expression1.
        //If the condition is false, it executes expression2.

        int result = 10 + 5 * 2;
        System.out.println(result);
        int result1 = (10 + 5) * 2;
        System.out.println(result1);
// ()	Parentheses (Highest)
//++ --	Post-increment, Post-decrement
//! ~	Logical NOT, Bitwise Complement
//* / %	Multiplication, Division, Modulus
//+ -	Addition, Subtraction
//<< >>	Bitwise Shift
//< <= > >=	Relational Operators
//== !=	Equality Operators

        System.out.println("Hello");
        System.out.println(2 + 3);
        System.out.println("2+3");
        System.out.println("2" + "3");
        System.out.println("Hello" + 4);
        System.out.println("Hello" + "World");
        System.out.println("Hello" + " " + "World");
        System.out.println("Total: " + 5 + 3);
        // // Outputs: Total: 53 (String + int + int = concatenation)
        System.out.println("Sum: " + (5 + 3));
        //  // Outputs: Sum: 8 (Parentheses force addition first)
        System.out.println(5 + 3 + " is the sum");
        //  8 is the sum (addition before string)
        System.out.println("Java" + "Programming");
        System.out.println("Hello " + "World " + 2025);
        System.out.println("Is Java fun? " + true);

        System.out.println("Answer: " + 10 + 20);         // Answer: 1020
        System.out.println("Answer: " + (10 + 20));       // Answer: 30
        System.out.println(10 + 20 + " is the result");   // 30 is the result
        int x1 = 7;
        double y1 = 3.5;
        System.out.println("Result: " + x1 + y1);
        System.out.println("Result: " + (x1 + y1));

        int num = 5;
        System.out.println("num: " + num++); //  Post-Increment // (prints before increment)
        System.out.println(num);

        int num1 = 5;
        System.out.println("num1: " + ++num1); //  Pre-Increment //  (increments before printing)
        System.out.println(num);


    }
}
