//WAP a program to reverse a given String without using reverse() method.

package com.test;

import java.util.Scanner;

public class Reverse_String_Example {

	public static void main(String[] args) {
		//User input method 
		Scanner sc=new Scanner(System.in);
				
		String str;//variable declaration
				
		//User input taken
		System.out.println("Enter a string:");
		str=sc.nextLine();
		
		//for loop is used to reverse the string using decrement operator to length of the given string
		
		for(int i=str.length();i>0;--i)                //i is the length of the string  
		{ 
		System.out.print(str.charAt(i-1));            //printing the character at index i-1  
		}  
		
		//printing string after reverse
		System.out.println(": is a string after reverse.");
	}

}
