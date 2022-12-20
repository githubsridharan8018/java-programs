package com.mywork;

import java.util.Scanner;

public class My_Work {

	public static void main(String[] args) {// scanner is a class

		Scanner s=new Scanner(System.in); //system is a final class //.in ---input stream 
		
System.out.println("what is u r age ?");
		
        byte nextByte = s.nextByte();      //s.next
        
        System.out.println("my age is " + nextByte);
        
        System.out.println("what is your id");
        
        
        byte nextByte2 = s.nextByte();
        System.out.println("my id is"+ nextByte2);
        
        
        System.out.println("what i u r native ?");
       String next = s.next();
       System.out.println("my native is "+ next);
        
       
       
        s.nextLine();// to avoid data confusion from  next and nextLine declaration
       
       
       
        
    System.out.println("what is ur name?"); //s.nextLine

String nextLine = s.nextLine();
System.out.println("my name "+ nextLine);



System.out.println("what is ur address?");


String nextLine2 = s.nextLine();
System.out.println("my address is " + nextLine2);
        
        
        
	}

}
