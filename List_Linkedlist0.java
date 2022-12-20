package com.mywork;

import java.util.LinkedList;
import java.util.List;

public class List_Linkedlist0 {

	public static void main(String[] args) { //linked list 2

		
		List<Integer> a = new LinkedList<Integer>();
		
		   
		   a.add(10);
		   a.add(20);
		   a.add(50);
		   a.add(20);
		   a.add(50);
		   a.add(70);//method --add
		   
		   
		   List<Integer> b = new LinkedList<Integer>();
		   
		   b.add(22);
		   b.add(61);
		   b.add(70);
		   b.add(20);
		   b.add(33);
		   b.add(45);
		   
		 //b.addAll(a); //it add all the value from both index, obj starts from printing statement   
		 //System.out.println(b);
		   
		   
		 //b.removeAll(a);  
		 //System.out.println(b);//remove common valus from printing index what we give from sysout
		   
		 
		// b.retainAll(a);
		 //System.out.println(b);//it retains the same value in the index from sysout what we declare a or b
		 
		 
         Object[] array = a.toArray();		//convert list to array using for each loop , w can call any of index
             for (Object object : array) {
			System.out.println(object);
			}
           
           String string = a.toString();//convert list to string
           System.out.println(string);
           
		
		
		
		
		
		
	}

}
