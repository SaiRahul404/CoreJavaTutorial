package org.example;

public class Multithreading {
    // Single-threading: You do one task at a time, completing it before starting the next.
    // (Like a chef cooking one dish completely before starting the next).

    // Multithreading: You break down your work into smaller,
    // independent tasks and then handle multiple tasks concurrently. (parallely)
    // (Like a busy restaurant kitchen where one chef chops vegetables, another fries, and a
    // third preps dessert, all at the same time, giving the impression of many things
    // happening simultaneously).

    // In computers,
    // Multithreading is the ability of a program to execute multiple parts of its code, called threads,
    // seemingly at the same time
    // A thread is the smallest unit of execution within a process. Think of it as a lightweight subprocess.
    //A process (your entire Java program) can have multiple threads.
    //Each thread runs independently but shares the same memory space and resources of the parent process.

    // Why Use Multithreading? (Benefits)
    // 1. Responsiveness : // Your application doesn't "freeze."
    // If one part is doing a heavy computation, other parts (like the User Interface) can remain responsive.
    // Example: Downloading a large file in the background while you continue Browse a web page.
    // 2. Faster Execution : By dividing a big task into smaller sub-tasks that can run in parallel,
    // the overall task might finish faster
    // Example: Processing a large dataset by assigning chunks to different threads.
    // 3 Better Resource Utilization:
    //  When one thread is waiting for something (like data from the internet or a file),
    //  another thread can use the CPU, preventing idle time.

    // Java provides two primary ways to create and manage threads:
    //  java.lang.Thread
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");

        thread1.start();
        thread2.start();


    }
}

class MyThread extends Thread {

    private String threadName;

    MyThread(String threadName) {
        this.threadName = threadName;
    }

    // 2. Override the run() method with the thread's task
    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(threadName + " counting: " + i);
                // Pause thread for a moment to simulate work
                Thread.sleep(500); // Sleep for 500 milliseconds (0.5 seconds)
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " interrupted.");
        }
        System.out.println(threadName + " finished.");
    }

}
// Way 1: Extending the Thread Class
//Create a new class that extends  java.lang.Thread class
//Override the run() method. This run() method contains the code that the new thread will execute.
//Create an object of your new class.
//Call the start() method on that object.
// Never call run() directly! Calling run() directly just executes the method in the current thread, it doesn't create a new thread

//Way 2: Implementing the Runnable Interface
// Create a new class that implements the java.lang.Runnable interface.
// Implement the run() method.(Override the run method, because it is the condition when you implement a interface)
// Create an object of your Runnable implementation.
// Call the start() method on the Thread object

class MyRunnable implements Runnable {
    private String taskName;

    public MyRunnable(String name) {
        this.taskName = name;
        System.out.println("Runnable: Creating " + taskName);
    }

    // / 2. Implement the run() method
    @Override
    public void run() {
        System.out.println("Runnable: Running " + taskName);
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(taskName + " doing task: " + i);
                Thread.sleep(600); // Simulate work
            }
        } catch (InterruptedException e) {
            System.out.println(taskName + " interrupted.");
        }
        System.out.println("Runnable: " + taskName + " finished.");
    }

}
// Why Runnable is generally preferred:
//Flexibility: Your class can still extend another class while also being a Runnable.
//Separation of Concerns: It separates the "task" (what needs to be done in run()) from the "thread management" (how it's executed).
// The Runnable defines the job, and the Thread class provides the machinery to run that job concurrently.

// start():
// Creates a new thread and then calls the run() method in that new thread. This is the correct way to begin concurrent execution.

// run():
// Just executes the run() method's code in the current thread, like any other regular method call. It does not create a new thread.

// Thread.sleep(milliseconds):
// Pauses the current thread for a specified number of milliseconds.
// Used to simulate work or slow down execution for observation.

// Daemon Threads:
// Background threads that don't prevent the JVM from exiting
// Example: Garbage Collector.

// Thread Life Cycle:
// Threads go through different states: New, Runnable, Running, Blocked/Waiting, Timed Waiting, Terminated.
// Understanding these states helps in debugging and designing concurrent applications.
