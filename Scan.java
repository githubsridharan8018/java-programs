package com.mywork;

import java.util.Scanner;

public class Scan {
	
	
	
	
public static void main(String[] args) {
		
	Scanner t =new Scanner(System.in);
	
	
	
	System.out.println("What is  your age ?");
	
	byte nextByte = t.nextByte();
	
	
	System.out.println("My age = " + nextByte);
	
	
	System.out.println("What is your name ?");
	String next = t.next();
	System.out.println("My name = " + next);
	
	
t.nextLine();

System.out.println("What is your nick name");

String nextLine = t.nextLine();

System.out.println("My nick name = " +nextLine);


}

}
