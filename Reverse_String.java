//WAP to Reverse a string with the help of loop.

import java.io.*;
import java.util.Scanner;
 
public class Reverse_String {
    public static void main (String[] args) {
    	
       //variable declaration
        String str= "Preeti", nstr="";
        char ch;
      
      System.out.println("Here we are going to reverse the String!!");
      System.out.print("Original String: ");
      System.out.println("Preeti"); //Example word
      
      //here for loop is used 
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      //printing reverse string
      System.out.println("Reversed String: "+ nstr);
    }
}