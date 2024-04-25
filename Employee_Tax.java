//Write a program in Java to accept the name of an employee and his/her annual income. 
//Pass the name and the annual income. Displays the name of the employee and the income tax as per the given tariff:

import java.util.Scanner;

public class Employee_Tax
{
    public void tax(String name, int income) {
        
    	//variable declaration
        double tax;
        
        //tax rates are decided as per the income
        if (income <= 250000)
            tax = 0;
        else if (income <= 500000)
            tax = (income - 250000) * 0.1;
        else if (income <= 1000000)
            tax = 30000 + ((income - 500000) * 0.2);
        else
            tax = 50000 + ((income - 1000000) * 0.3);
        
        //Here name and income tax is displayed 
        System.out.println("The name of the employee and the income tax as per the given tariff is:");
        System.out.println("Name: " + name);
        System.out.println("Income Tax: " + tax);
    }
    
    //main method
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");//taking user input as a name
        String n = in.nextLine();
        System.out.print("Enter annual income: ");//taking user input as a income
        int i = in.nextInt();
        
        //object calling
        Employee_Tax obj = new Employee_Tax();
        obj.tax(n, i);
    }
}