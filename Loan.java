//WAP to check whether the person is eligible for getting loan or not.
//Condition to grant loan is he should have salary more than 50000 and He should be citizen of INDIA.Otherwise
//Loan can't be given to customer.

import java.util.Scanner;

public class Loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salary;//variable declaration
	    String citizen;//variable declaration
	    
	    //reading output from user
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter your salary:");
	    salary=sc.nextDouble();
	    sc.nextLine();
	    System.out.println("Enter your citizen:");
	    citizen=sc.next();
	    
	    //condition statement logic
	    if(salary>=50000 && citizen.equalsIgnoreCase("Indian"))
	    {
	    	System.out.println("Your salary is:"+salary+"\n You are citizen of "+citizen+"\n So You are eligible for loan.");
	    }
	   else
	   {
		   System.out.println("Your salary is:"+salary+"\n You are citizen of "+citizen+"\n So You are not eligible for loan.");
	   }
	}
}