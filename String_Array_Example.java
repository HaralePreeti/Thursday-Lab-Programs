//WAP to search given student name is available in the list of student name using String array.

package com.test;

import java.util.Scanner;

public class String_Array_Example{
    public static void main(String[] args) {
        // Sample list of student names
        String[] studentNames = {"Preeti", "Rani", "Vaishanvi", "Sushma", "Rutika", "Manisha"};
        
        String searchName;
        
        Scanner sc=new Scanner(System.in);		
        System.out.println("Enter a name of student which you want to search in list:");
        searchName=sc.nextLine();		

        // Call the search method
        boolean found = searchStudent(studentNames, searchName);

        // Display the result
        if (found) {
            System.out.println("The student '" + searchName + "' is in the list.");
        } else {
            System.out.println("The student '" + searchName + "' is not in the list.");
        }
    }

    // Method to search for a student name in the array
    public static boolean searchStudent(String[] names, String searchName) {
        for (String name : names) {
            if (name.equals(searchName)) {
                return true; // Name found
            }
        }
        return false; // Name not found
    }
}
