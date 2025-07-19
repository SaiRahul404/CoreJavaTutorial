package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    // A **Deque** (pronounced "deck") is a **double-ended queue** in Java.

    // It allows you to add or remove elements from **both the front and the back** of the queue,
    // unlike a regular queue

    // Deque follows both FIFO and LIFO
    //  You can use it as a **queue** (FIFO) or a **stack** (LIFO).
    // It is more flexible than a `Stack` or `Queue` because you can add/remove from both ends.

    public static void main(String[] args) {
        Deque<String> d1 = new ArrayDeque<>();
        // addFirst - Adds an element to the front
        d1.addFirst("A");
        d1.addFirst("B");
        d1.addFirst("C");

        // addLast - Adds an element to the end of deque
        d1.addLast("R");
        d1.addLast("S");
        System.out.println(d1);

        // removeFirst() - Removes and returns the first element
        System.out.println(d1.removeFirst());
        System.out.println(d1);

        // removeLast() -  Removes and returns the last element
        System.out.println(d1.removeLast());
        System.out.println(d1);

        // getFirst - Returns the first element (without removing)
        System.out.println(d1.getFirst());
        System.out.println(d1);

        // getLast - Returns the last element (without removing)
        System.out.println(d1.getLast());
        System.out.println(d1);
    }
}
