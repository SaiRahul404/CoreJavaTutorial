package org.example;

public class ThrowsExample {
    public static void main(String[] args) {

        System.out.println("--- Baking Attempt 1: Enough Flour ---");
        try {
            // We call the 'addFlour' step.
            // Because 'addFlour' has the 'throws' warning, we MUST put it in a try-catch.
            addFlour(3); // We have 3 cups, so this should be fine.
            System.out.println("Flour added successfully! Proceeding to next step.");
        } catch (NoFlourException e) {
            // This part only runs if 'addFlour' throws an exception.
            System.err.println("Recipe interrupted! Problem: " + e.getMessage());
        }

        System.out.println("\n--- Baking Attempt 2: Not Enough Flour ---");
        try {
            // We call 'addFlour' again, but with a problem (not enough flour).
            addFlour(1); // We only have 1 cup.
            System.out.println("Flour added successfully! Proceeding to next step."); // This line won't run
        } catch (NoFlourException e) {
            // 'addFlour' THREW the 'NoFlourException', so it gets CAUGHT here.
            System.err.println("Recipe interrupted! Problem: " + e.getMessage());
            System.err.println("Looks like we need to go to the store!");
        }

        System.out.println("\n--- Baking Finished (or stopped due to ingredient issue) ---");
    }

    public static void addFlour(int cupsOfFlourAvailable) throws NoFlourException {
        if (cupsOfFlourAvailable < 2) { // Let's say our recipe needs at least 2 cups
            // If we don't have enough flour, we 'throw' the problem (the exception)
            throw new NoFlourException("Not enough flour! Need at least 2 cups.");
        }
        System.out.println("Adding " + cupsOfFlourAvailable + " cups of flour to the mix.");
    }
}

class NoFlourException extends Exception {
    public NoFlourException(String message) {
        super(message);
    }
}
