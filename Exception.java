package com.mywork;

public class Exception {

	public static void main(String[] args) {

		
		
		int a = 50;
		System.out.println(a);
	    System.out.println(a/0);//arithmetic exception 
		
		String s = "10/";// if we declare / it will throw number format exception  
		
		System.out.println(s+2);// merge the string value 
		
	 int parseInt = Integer.parseInt(s);// number format exception integer.parseInt return type
	// System.out.println(parseInt*2);// it works deponds on the athrithmtic operator
	
	
	
	}

	public void printStackTrace() {
		// TODO Auto-generated method stub
		
	}
	
	
}
