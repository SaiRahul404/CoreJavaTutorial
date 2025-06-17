package org.example;

public class StringBuilderExample {
    public static void main(String[] args) {
        // // In Java, Strings are immutable, meaning their values cannot be changed once created.
        //
        //    // But sometimes, we need to modify Strings frequently (e.g., appending, inserting, or deleting characters).
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append(" World");
        System.out.println(sb);
        sb.append(" Hey");
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("Hello ");
        // Inserts a value at a specific position.
        sb1.insert(6, "Java");
        System.out.println(sb1);

        // Deletes characters from startIndex to endIndex - 1.
        StringBuilder sb2 = new StringBuilder("Hello Java");
        System.out.println(sb2);
        sb2.delete(5, 10);
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("abcd");
        sb3.reverse();
        System.out.println(sb3);  // Output: dcba

        StringBuilder sb4 = new StringBuilder("Hello");
        char ch = sb4.charAt(0);
        System.out.println(ch);  // Output: e

        StringBuilder sb5 = new StringBuilder("Hello");
        System.out.println(sb5.length());  // Output: 5

//        StringBuilder sb = new StringBuilder("Hello Java");
//        sb.replace(6, 10, "World");
//        System.out.println(sb);  // Output: Hello World
//
//        StringBuilder sb = new StringBuilder("Hello Java");
//        sb.replace(6, 10, "World");
//        System.out.println(sb);  // Output: Hello World





    }
}
