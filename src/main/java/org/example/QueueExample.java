package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    // Collections for Processing Elements

    // It typically orders elements in a First-In, First-Out (FIFO) manner,
    // Ordered for processing: Elements are retrieved in a specific order.
    //Allows Duplicates: Yes.
    //No index-based access: You don't usually access elements by index.
    //Methods often have two forms: one that throws an exception if the operation fails
    // (add, remove, element) and one that returns a special value (offer, poll, peek)
    //
    // LinkedList:
    // Implements both List and Deque (which extends Queue).
    //Can act as a FIFO queue..

    // PriorityQueue:
    //Elements are ordered according to their natural ordering, or by a Comparator provided at queue construction time.
    //The element with the highest priority (lowest value, or custom order) is always at the head.

    // ArrayDeque:
    // More efficient than LinkedList for queue operations when used as a pure FIFO queue or LIFO stack.
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(3); // add will throw exception when queue is full
        boolean m = q1.offer(4); // offer will not throw exception it will just return false
        System.out.println(m);
        System.out.println(q1);

        //int first = q1.remove(); // Throws exception if empty
        int firstSafe = q1.poll(); // Returns null if empty
        System.out.println(firstSafe);
        System.out.println(q1);

        q1.add(5);
        System.out.println(q1);
        int head = q1.peek();// // Returns null if empty
        int headNew = q1.element(); // // Throws exception if empty
        System.out.println(head);
        System.out.println(headNew);
        System.out.println(q1);

    }
}
