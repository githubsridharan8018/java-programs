package com.mywork;

import java.util.Set;
import java.util.TreeSet;

public class Set_Treeset {

	public static void main(String[] args) {// tree set prints the output in ascending order 

		
		Set<Integer> a = new TreeSet<Integer>();
		
		
		 a.add(10);
	     a.add(20);
	     a.add(50);
	     a.add(20);
	     a.add(50);
	     a.add(70);//method --add
	    
	     
	     
	     
	     //a.add(2, 88);
	     //a.add(3, 15);
	     System.out.println(a);//(method -- add(index,object)
	     
	     
	     int size = a.size();//index of length
	     System.out.println("The value of index size = " + size); // (method ----size) 
	     
	     
	     //int indexOf = a.indexOf(50);   
	     //System.out.println("the value of index of =" + indexOf); //(it will print the first occurrence of the value)
	     
	     
	     //int lastIndexOf = a.lastIndexOf(50);
	     //System.out.println("The last index of =" + lastIndexOf);// (it will print the last occurrence of the value) 
	     
	     boolean contains = a.contains(90);
	     System.out.println("The given value in present or not in contains =" + contains);
	     // (it will check the value is present or not -- true or false)
	     
	     
	  //Integer integer = a.get(4);   
	  //System.out.println("the value of get="+ integer);//it will get the value from index what we choose,if we declare unknown index value 
	  //will through indexout of bounds exception


	  //a.set(3, 123);
	  //System.out.println(a);//it will replace the index value no return type

	  boolean empty = a.isEmpty();
	  System.out.println("the vlue of index is empty or not:" + empty);

	  a.clear();
	  System.out.println(a);//will clear the index box


	     
		
		
		
	}

}
