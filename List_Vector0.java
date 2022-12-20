package com.mywork;

import java.util.List;
import java.util.Vector;

public class List_Vector0 {

	public static void main(String[] args) {
		

		
		List<Integer> a = new Vector<Integer>();
		
		   
		   a.add(10);
		   a.add(20);
		   a.add(50);
		   a.add(20);
		   a.add(50);
		   a.add(70);//method --add
		   
		   
		   List<Integer> b = new Vector<Integer>();
		   
		   b.add(22);
		   b.add(61);
		   b.add(70);
		   b.add(20);
		   b.add(33);
		   b.add(45);
		   
		 //b.addAll(a); //it add all the value from both index, obj starts from printing statement   
		 //System.out.println(b);
		   
		   
		//a.removeAll(b);  
		 //System.out.println(a);//remove common value from printing index what we give from sysout
		   
		 
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
