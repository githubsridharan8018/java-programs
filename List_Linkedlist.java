package com.mywork;

import java.util.LinkedList;
import java.util.List;

public class List_Linkedlist {

	public static void main(String[] args) {// list - linked list

		List<Integer> a = new LinkedList<Integer>();
		
		
		   a.add(10);//no return type
		   a.add(20);
		   a.add(50);
		   a.add(20);
		   a.add(50);
		   a.add(70);//method --add
		  
		   
		   
		   
		  a.add(2, 88);//no return type
		  a.add(3, 15);
		 System.out.println(a);//(method -- add(index,object)
		   
		   
		   int size = a.size();
		   System.out.println("The value of index size = " + size); // (method ----size) 
		   
		   
		   int indexOf = a.indexOf(50);   
		   System.out.println("the value of index of =" + indexOf); //(it will print the first occurrence of the value)
		   
		   
		   int lastIndexOf = a.lastIndexOf(50);
		   System.out.println("The last index of =" + lastIndexOf);// (it will print the last occurrence of the value) 
		   
		   boolean contains = a.contains(88);
		   System.out.println("The given value in present or not in contains =" + contains);
		   // (it will check the value is present or not -- true or false)
		   
		   
		Integer integer = a.get(6);   
		System.out.println("the value of get="+ integer);//it will get the value from index what we choose,if we declare unknown index value 
		//will through indexout of bounds exception


		a.set(3, 123);
		System.out.println(a);//it will replace the index value no return type

		boolean empty = a.isEmpty();
		System.out.println("the vlue of index is empty or not:" + empty);

		a.clear();
		System.out.println(a);//will clear the index box
		
		
		
	}

}
