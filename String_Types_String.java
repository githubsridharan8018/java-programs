package com.mywork;

public class String_Types_String {

	public static void main(String[] args) {//String
		
		
		String s = "Java";
		
		
		System.out.println(System.identityHashCode(s));//885284298
		//identify the memory location stored 

		
		
		//string duplicate
		
		String a = "Java";
		System.out.println(System.identityHashCode(a));//885284298
		
		//if we duplicate the string memory will be shared 
		
		//-----------------------------------------------
		
		
		//string concat 
		
		String concat = a.concat("program");
		
		System.out.println(concat);//javaprogram
		//it will merge the two strings 
		
		System.out.println(System.identityHashCode(concat));//1389133897
		//if we concat the string new memory will be created
		
		
		
		System.out.println(s);//java
		//if we call the object  the string value cannot be changed
		
		System.out.println(a);//Java
		//if we call the object the string value cannot be changed
		
	}
	
	

}
