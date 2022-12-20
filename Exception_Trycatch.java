package com.mywork;

public class Exception_Trycatch {

	public static void main(String[] args) {

		
		
		int a= 20;
		
		try {
			System.out.println(a);
			
			System.out.println(a/0);
		} 
		
		
		catch (java.lang.Exception e) {
			e.printStackTrace();
		}
}}