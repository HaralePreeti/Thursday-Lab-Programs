//Create a class Student having roll_ number,Name as fields .Create another class Marksdetails to accept 5 subject marks.
//Apply Single Inheritance to display the result
import java.util.Scanner;

// Parent class Student
class Student {
    // Fields
    protected int rollNumber;
    protected String name;

    // Constructor
    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student Roll Number: " + rollNumber);
        System.out.println("Student Name: " + name);
    }
}

// Child class MarksDetails inheriting from Student
class MarksDetails extends Student {
    // Fields
    private int[] marks = new int[5]; // Array to store marks of 5 subjects

    // Constructor
    public MarksDetails(int rollNumber, String name) {
        super(rollNumber, name);
    }

    // Method to accept marks for 5 subjects
    public void acceptMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        scanner.close();
    }

    // Method to calculate and display result
    public void displayResult() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double averageMarks = totalMarks / 5.0;

        // Display student details
        displayStudentDetails();

        // Display marks and result
        System.out.println("Subject Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
    }
}

public class Student_details {
    public static void main(String[] args) {
        // Create an object of MarksDetails class
        MarksDetails student1 = new MarksDetails(101, "John Doe");

        // Accept marks for student1
        student1.acceptMarks();

        // Display result for student1
        student1.displayResult();
    }
}
