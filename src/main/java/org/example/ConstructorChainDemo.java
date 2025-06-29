package org.example;

public class ConstructorChainDemo {
    public static void main(String[] args) {
        //Bravo b1 = new Bravo();
        //Alpha a1 = new Alpha();
        Charlie c1 = new Charlie();
    }
}

class Alpha {
    Alpha() {
        System.out.println("Inside Alpha's constructor.");
    }
}

class Bravo extends Alpha {
    Bravo() {
        System.out.println("Inside Bravo's constructor.");
    }
}

class Charlie extends Bravo {
    Charlie() {
        System.out.println("Inside Charlie's constructor.");
    }
}

// Aplha -> Bravo -> Charlie - Hi


