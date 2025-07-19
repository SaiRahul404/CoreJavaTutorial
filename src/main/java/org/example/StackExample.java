package org.example;

import java.util.Stack;

public class StackExample {
    // This behavior is called LIFO – Last In, First Out.

    // You place plates one over the other.
    // To take a plate, you must remove the topmost first.

    public static void main(String[] args) {
        Stack<String> s1 = new Stack<>();
//          push(item)
//      Put a plate on top of the stack
        s1.push("Plate1");
        s1.push("Plate2");
        s1.push("Plate3");
        System.out.println(s1);
        // pop()
        //Take the top plate off

        System.out.println(s1.pop());
        System.out.println("After pop 1 " + s1);
        System.out.println(s1.pop());
        System.out.println("After pop 2 " + s1);
        System.out.println(s1.pop());
        System.out.println("After pop 3 " + s1);

        // peek()
        //Just look at the top plate
        Stack<Integer> s2 = new Stack<>();
        s2.push(3);
        s2.push(4);
        s2.push(10);
        System.out.println("Stack" + s2);
        System.out.println(s2.peek());
        System.out.println(s2);
        // Even after using the peek operation the stack doesn't change

        // isEmpty()
        //Check if there are no plates
        System.out.println("Whether s1 is Empty " + s1.isEmpty());
        System.out.println("Whether s2 is Empty "+ s2.isEmpty());

        // search(item)
        //Find out how far a plate is from the top
        System.out.println(s2);
        System.out.println(s2.search(4));
        System.out.println(s2.search(3));
        System.out.println(s2.search(10));

        System.out.println(s2.size());
        s2.clear();
        System.out.println(s2);
    }
}
