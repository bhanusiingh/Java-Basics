package Loops;

public class NestedForLoops {
    public static void main(String[] args) {
        // Print a 5x5 grid of asterisks using nested for loops
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after inner loop
        }
    }
}
