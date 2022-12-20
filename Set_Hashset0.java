package com.mywork;

import java.util.HashSet;
import java.util.Set;

public class Set_Hashset0 {

	public static void main(String[] args) {

		
		Set<Integer> a = new HashSet<Integer>();
		
		
		     a.add(10);
		     a.add(20);
		     a.add(50);
		     a.add(20);
		     a.add(50);
		     a.add(70);//method --add
		    
		     
		     
		     
		     
		     
		     int size = a.size();//index of length
		     System.out.println("The value of index size = " + size); // (method ----size) 
		     
		     
		     
		     
		     
		     boolean contains = a.contains(90);
		     System.out.println("The given value in present or not in contains =" + contains);
		     // (it will check the value is present or not -- true or false)
		     
		     



		  boolean empty = a.isEmpty();
		  System.out.println("the vlue of index is empty or not:" + empty);

		  a.clear();
		  System.out.println(a);//will clear the index box

		
		
		
		
	}

}
