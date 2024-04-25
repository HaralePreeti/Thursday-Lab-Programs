//WAP to swap two numbers without using third variable using class and object concept.

import java.util.Scanner;

// Create a class to represent number swapper
class NumberSwapper {
    // Method to swap two numbers without using a third variable
    void swapNumbers(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap the numbers without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}

public class Swap_two_numbers {
    public static void main(String[] args) {
        // Create Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers to swap: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Create an object of NumberSwapper class
        NumberSwapper swapper = new NumberSwapper();

        // Call the swapNumbers method to swap the numbers
        swapper.swapNumbers(num1, num2);

        // Close the scanner
        scanner.close();
    }
}
