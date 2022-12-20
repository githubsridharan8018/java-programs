package com.mywork;

public class Array_For_Loop {

	public static void main(String[] args) {// array based on  for loop
		
		int a[]=new int[10];
		
		a[0]=100;
		a[2]=123;
		a[2]=25;// we can also override the value
		a[8]=12;
		
		
		
		
		
		for (int i = 0; i < a.length; i++) {// for loop
			
			
			System.out.println(a[i]);
		}

	}

}
