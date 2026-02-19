package questions;
//Take two numbers and print their sum.
import java.util.Scanner;

public class AddTwoNumber {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum = " + sum);

        sc.close();
    }
    
}
// Public - function can be accessed from outside
// void - no return type
// static - call the main function without creating an object
// main - starting point of the program
// String[] args - array of strings OR command line arguments
// Scanner - to take input from user
// nextInt() - to read an integer input
// System.out.print - to print without newline
// System.out.println - to print with newline
