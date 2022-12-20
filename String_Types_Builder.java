package com.mywork;

public class String_Types_Builder {

	public static void main(String[] args) {//stringBuilder is a class 

		StringBuilder e = new StringBuilder("Java");           // original string
	    System.out.println(System.identityHashCode(e));
		//identified  memory location as -- 885284298
	    
	    
	    
	    StringBuilder f = new StringBuilder("Java");           //duplicate string 
	    System.out.println(System.identityHashCode(f));
	    //if we duplicate the String--- memory location is created as new -- 1389133897
	    
	    
	    
	    StringBuilder append = e.append("Language");// append string builder
	    System.out.println(append); //JavaLanguage
	    System.out.println(System.identityHashCode(append));
	    
		//in string builder using append ------ memory  is shared -- 885284298
	    
	    
	    
	    System.out.println(f);//without appending the object the value cannot be changed 
	    
	    
	    System.out.println(e);//after appending the object the value can be changed
	    
		
	}

}
