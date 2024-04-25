/*Write a class with the name Perimeter using Menu driven(Switch case) that computes the perimeter of a square, a rectangle and a circle.
Formula:
Perimeter of a square = 4 * s
Perimeter of a rectangle = 2 * (l + b)
Perimeter of a circle = 2 * (22/7) * r  */

import java.util.Scanner;

public class Perimeter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Display menu and take user's choice until they choose to exit
        do {
            System.out.println("Menu:");
            System.out.println("1. Calculate perimeter of a square");
            System.out.println("2. Calculate perimeter of a rectangle");
            System.out.println("3. Calculate perimeter of a circle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // For square, take input of side length and calculate perimeter
                    System.out.print("Enter the side length of the square: ");
                    double side = scanner.nextDouble();
                    double squarePerimeter = 4 * side;
                    System.out.println("Perimeter of the square: " + squarePerimeter);
                    break;
                case 2:
                    // For rectangle, take input of length and breadth, then calculate perimeter
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the breadth of the rectangle: ");
                    double breadth = scanner.nextDouble();
                    double rectanglePerimeter = 2 * (length + breadth);
                    System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);
                    break;
                case 3:
                    // For circle, take input of radius and calculate perimeter
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    double circlePerimeter = 2 * (22.0 / 7.0) * radius;
                    System.out.println("Perimeter of the circle: " + circlePerimeter);
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Exiting program.");
                    break;
                default:
                    // Handle invalid choice
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4); // Repeat until user chooses to exit

        scanner.close(); // Close scanner to prevent resource leak
    }
}


    
    

