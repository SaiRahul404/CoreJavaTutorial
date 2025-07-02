package org.example;

public class MessageDispatchTest {
    public static void main(String[] args) {
        MessageSender m1 = new MessageSender(); // object to MessageSender
        EmailSender e1 = new EmailSender(); // object for EmailSender class
        SmsSender s1 = new SmsSender(); // object for SmsSender class

        MessageSender r1; // reference to MessageSender(Parent class)
        r1 = m1;
        r1.sendMessage();
        r1 = e1; // Parent class reference is equal to child class object
        r1.sendMessage();
        r1 = s1;
        r1.sendMessage();
    }
}

class MessageSender {
    void sendMessage() {
        System.out.println("Sending message using basic method - MessageSender");
    }
}

class EmailSender extends MessageSender {
    @Override
    void sendMessage() {
        System.out.println("Sending message via Email - EmailSender");
    }
}

class SmsSender extends MessageSender {
    @Override
    void sendMessage() {
        System.out.println("Sending message via SMS - SmsSender");
    }
}


// MessageSender -> EmailSender
// MessageSender -> SmsSender

// Dynamic Dispatch Concept
// -> A parent class reference  can point to any subclass object
// The actual method that gets executed is determined at runtime based on the object type the reference is pointing to, not the reference type
// This approach allows you to write code that works with multiple object types in a uniform way.

// An object is created using the new keyword and is a real entity in memory.
// A reference is the variable name  that points to the object in memory.

//              House ->  reference
// Object = A house.
//
//Reference = An address to that house.
// You can have multiple references (addresses) pointing to the same house (object).
