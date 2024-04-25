//WAP to find Greatest among three number using Nested if

import java.util.Scanner;
public class Greatest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable declaration
		int a,b,c;
		//object of the Scanner class
        Scanner sc=new Scanner(System.in);
        //reading input from the user
        System.out.println("Enter three number:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        
        //comparing numbers
        if(a>b && a>c)
        {
            System.out.println(a+"is a greatest number.");
        }
        //comparing numbers
        else if(b>a && b>c)
        {
        	//print greatest number
        	System.out.println(b+"is a greatest number. ");
        }
        // print else statement 
        else
        {
        	//print greatest number
            System.out.println(c+":is a greatest number.");
        }
	}
}
