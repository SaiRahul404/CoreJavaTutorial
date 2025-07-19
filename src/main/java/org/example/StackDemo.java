package org.example;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // push
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // peek
        System.out.println("Top item: " + stack.peek()); // Cherry

        // pop
        System.out.println("Removed: " + stack.pop()); // Cherry

        // isEmpty
        System.out.println("Is empty? " + stack.isEmpty()); // false

        // search
        System.out.println("Position of Apple: " + stack.search("Apple")); // 2

        // size
        System.out.println("Size: " + stack.size()); // 2

        // clear
        stack.clear();
        System.out.println("After clear: " + stack); // []
    }
}
