package org.example;

import java.util.LinkedList;
import java.util.Objects;
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
        System.out.println(q1.peek());
        int headNew = q1.element(); // // Throws exception if empty
        System.out.println(head);
        System.out.println(headNew);
        System.out.println(q1);

        // add(element) - Adds an element to the queue
        Queue<String> queue = new LinkedList<>();
        Queue<Object> newQ = new LinkedList<>();
        newQ.add(2);
        newQ.add("String");
        queue.add("Apple");
        queue.add("Banana");
        System.out.println(queue);

        // offer(element) - Adds an element but returns false if the queue is full

        Queue<Integer> queue1 = new LinkedList<>();
        queue1.offer(10);
        queue1.offer(20);
        System.out.println(queue1);

        // poll() - Retrieves and removes the front element
        queue1.poll();
        System.out.println(queue1);

        //  peek() - Retrieves but does not remove the front element
        System.out.println(queue1.peek());
        System.out.println(queue1);

        //  remove() - Removes and returns the front element (throws exception if empty)
        Queue<String> q5 = new LinkedList<>();
        q5.add("Mango");
        q5.add("Mango");
        q5.add("Mango");
        q5.add("Apple");
        System.out.println(q5);
        System.out.println(q5.remove());
        System.out.println(q5);

        // element() - Retrieves but does not remove the front element (throws exception if empty)
        Queue<Float> q6 = new LinkedList<>();
        q6.add(3.5f);
        q6.add(4.6f);
        System.out.println(q6);
        System.out.println(q6.element());
        System.out.println(q6);



    }
}
