package com.mywork;

public class String_Types_Buffer {

	public static void main(String[] args) {//string buffer is a class

		
		
		StringBuffer b = new StringBuffer("Java");
		
		System.out.println(System.identityHashCode(b));//885284298
		
		//identify the memory location stored
		
		
		
		StringBuffer a = new StringBuffer("Java");
		System.out.println(System.identityHashCode(a));//1389133897
		
		//identify the memory location is stored as new
		
		
        StringBuffer append = a.append("Language");		
		
        System.out.println(append);// in buffer we can append the two strings
		//JavaLanguage
		
		System.out.println(System.identityHashCode(append));
		//in buffer memory will be shared while doing append
		
		System.out.println(a);// in buffer string is mutable --mutable mean the value can be changed
		
		System.out.println(b);
	}
	
	

}
