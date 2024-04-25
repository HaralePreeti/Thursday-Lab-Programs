import java.util.Scanner;
public class Sumevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array value define
		int a[]=new int[5];
		//variable declaration
	    double evenSum=0, oddSum=0;
	    //reading value form the value
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter five numbers:");
	    for(int i=0; i<5; i++)
	    	{
	    		a[i]=sc.nextInt();
	            //even integer logic
	            if(a[i]%2==0)
	            {
	                evenSum+=a[i];  
	            }
	            //odd integer logic
	            else if(a[i]%2!=0)
	            {
	                oddSum+=a[i];  
	            }
	        }
	      System.out.println("Sum of even integer is "+evenSum);
	      System.out.println("Sum of odd integer is "+oddSum);
		}
}