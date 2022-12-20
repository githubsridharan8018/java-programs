package com.mywork;

import java.util.ArrayList;
import java.util.List;

public class List_Arraylist { //list to array list

	public static void main(String[] args) {

		
		
		 List<Integer> a = new ArrayList<Integer>();
		   
		   a.add(10);
		   a.add(20);
		   a.add(50);
		   a.add(20);
		   a.add(50);
		   a.add(70);//method --add
		   
		   
		   List<Integer> b = new ArrayList<Integer>();
		   
		   b.add(22);
		   b.add(61);
		   b.add(70);
		   b.add(20);
		   b.add(33);
		   b.add(45);
		   
		 //b.addAll(a); it add all the value from both index, obj starts from printing statement   
		 //System.out.println(b);
		   
		   
		 //b.removeAll(a);  
		 //System.out.println(b);//remove common valus from printing index what we give from sysout
		   
		 
		 //b.retainAll(a);
		 //System.out.println(b);//it retains the same value in the index from sysout what we declare a or b
		 
		 
            Object[] array = b.toArray();		//convert list to array  
               for (Object object : array) {
			System.out.println(object);
			}
             
             String c = b.toString();//convert list to string
             System.out.println(c);
             
		 
	}

}
