//WAP to check Whether the number is Armstrong number or not using class and object concept

import java.util.Scanner;

// Create a class to represent the Armstrong number checker
class ArmstrongNumberChecker {
    // Method to check if a number is Armstrong or not
    boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        // Count the number of digits in the number
        for (; originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        // Calculate the result for Armstrong number check
        for (; originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n); // Add the nth power of each digit
        }

        // Check if the number is Armstrong or not
        if (result == number)
            return true; // If result equals the original number, it's Armstrong
        else
            return false; // Otherwise, it's not Armstrong
    }
}

public class Armstrong_Number {
    public static void main(String[] args) {
        // Create Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Create an object of ArmstrongNumberChecker class
        ArmstrongNumberChecker armstrongChecker = new ArmstrongNumberChecker();

        System.out.println("Enter a number to check if it's an Armstrong number: ");
        int number = scanner.nextInt();

        // Call the isArmstrong method to check if the number is Armstrong
        if (armstrongChecker.isArmstrong(number))
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

        // Close the scanner
        scanner.close();
    }
}
