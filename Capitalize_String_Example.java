//Write a java program to capitalize each word in string.

package com.test;

import java.util.Scanner;

public class Capitalize_String_Example {
	public static void main(String[] args){
		
		//User input method 
		Scanner sc=new Scanner(System.in);
		
		String str;//variable declaration
		String UpperCaseStr;//Variable declaration
		
		//User input taken
		System.out.println("Enter a string:");
		str=sc.nextLine();
		
		//toUpperCase() built in method used to capitalize each word in string.
		UpperCaseStr=(str.toUpperCase());
		
		//Print the string after converting into upper case format
		System.out.println("The string in upper case is:"+UpperCaseStr+".");		
	}
}
