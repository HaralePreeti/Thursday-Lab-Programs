//Write a program that asks the user to input ten integers and stores them in an array.
//The program should then find and print the smallest and largest values in the array.

import java.util.Scanner;

public class MinMaxFinder_In_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input ten integers
        System.out.println("Enter ten integers:");

        // Create an array to store the input integers
        int[] numbers = new int[10];

        // Read integers from the user and store them in the array
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Find the smallest and largest values in the array
        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 1; i < 10; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // Print the smallest and largest values
        System.out.println("Smallest value: " + smallest);
        System.out.println("Largest value: " + largest);

        // Close the scanner
        scanner.close();
    }
}
