
package com.mywork;

import java.util.Scanner;

public class New_Scanner {

		
		
		

   public static void main(String[] args)
		   
   {
	   
		      int noOfDays, noOfSeconds;
		      Scanner s = new Scanner(System.in);
		      
		      System.out.print("Enter the Number of Days: ");
		      noOfDays = s.nextInt();
		      
		      noOfSeconds = noOfDays*86400;
		      System.out.println("\nTotal Seconds = " +noOfSeconds);
		   }
		
	}


