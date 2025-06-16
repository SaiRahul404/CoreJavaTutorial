package org.example;

public class StringExample {
    public static void main(String[] args) {
//        String name = "Java";
//        System.out.println(name);
//        String word = "Hello";  // String // non primitive
//        char letter = 'H'; // primitive data types
//        int a = 0; // primitive data types
//        // here the word is an Object
//        // letter is a variable
//        //  // A String in Java is a sequence of characters. It is used to store and manipulate text
//        // // Java provides primitive types like int, char, and double, but String is a Class.( non primitive)
//        String str1 = new String("Hello");
//        System.out.println(word);
//        System.out.println(str1);
//        String textNew = new String("Java");
//        System.out.println(textNew);
//        //  Normally, objects in Java are created using the new keyword. Strings can also be created this way.
//        String s1 = "Java";
//        String s2 = "Java";
        // // Since "Java" is already in the pool, s2 does not create a new object.
        // //This saves memory and improves performance.
        // // String pool
        //        // Java -> s1 s2
//        String s1 = "Hello"; // string pool
//        String s2 = "Hello"; // string pool
//        String s5 = "Hello World";
//        // "Hello"  <---- s1, s2 (Both refer to the same object)
//        // "Hello World" <------ s5
//        String s3 = new String("Hello"); // heap memory (Outside String pool)
//        //   // The new keyword forces Java to create a new object in Heap Memory (outside String Pool).
//        // // So, even though "Hello" is already in the String Pool, s3 gets a new object.
//        String s4 = new String("Hello");
        // String Pool in Heap Memory:
        //--------------------------------
        //"Hello"  <---- s1, s2 (Reused)
        //
        //Heap Memory (Outside String Pool):
        //----------------------------------
        //"Hello"  <---- s3 (New Object)
        //"Hello"  <---- s4 (New Object)
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "hello";
        String s4 = new String("Hello");
        String s5 = new String("Hello");

        // Hello -> s1,s2
        // hello -> s3

        //"Hello"  <---- s4 (New Object)
        //"Hello"  <---- s5 (New Object)
        System.out.println(s4.equals("Hello")); //true
        System.out.println(s4.equals("hello")); // false
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s4); // false
        System.out.println(s4 == s5); // false

        // == Operator (Reference Comparison)
        // Compares whether two string references point to the same object in memory.
        //
        //It does not compare the contents of the strings.

        // .equals() Method (Content Comparison)
        // Compares the contents (characters) of the two strings.
        //
        //Returns true if both strings contain the same sequence of characters.

        // Always use .equals() when you care about the actual content of the strings.

        String username = new String("admin");
        if (username == "admin") {
            System.out.println("Access granted");
        }
        else {
            System.out.println("Access Revoked");
        }
        // Even if the user types "admin", this might print Access Revoked because username may not refer to the same interned object.

        if ("admin".equals(username)) {
            System.out.println("Access granted");
        }

        // Use .equals() for string value comparison.
        //
        //Use == only if you specifically need to check if two references point to the same object.

        String a = "hello";
        String b = "hello";
        String c = new String("hello");

        System.out.println(a == b); // true - both refer to same interned object
        System.out.println(a == c); // false - c is a new object

        String a1 = "hello";
        String b1 = new String("hello");

        System.out.println(a1.equals(b1)); // true - content is the same

        String expected = "admin";
        String input = new String("admin");

        if (input == expected) {
            System.out.println("Using == : Login success");
        } else {
            System.out.println("Using == : Login failed");
        }

        if (input.equals(expected)) {
            System.out.println("Using equals(): Login success");
        } else {
            System.out.println("Using equals(): Login failed");
        }
    // immutable in Java, meaning once created, it cannot be changed.
        //  String is immutable

        String str1 = "Hello";
        str1 = str1 + "World";
        String str2 = "Hello";
            // pool
         // Hello ---> str2
         // Hello World ----> str1
        // // "Hello" is stored in memory.
        //        //When " World" is added, a new string object "Hello World" is created.


    }
}
