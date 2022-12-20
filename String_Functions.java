package com.mywork;


public class String_Functions {

	public static void main(String[] args) {

		String s = "Welcome to String"; //declare string s = "Welcome to string"
		int length = s.length();
		System.out.println("The value of length =" + length);
	
	    int i = length-1; // totally 21 length within double quotes in the above string
		System.out.println("the value of index =" + i);
		
		boolean equals = s.equals("welcome to the string");// comparing the above string with current string  
		System.out.println("The value of equals ="+ equals);
		
		boolean a = s.equalsIgnoreCase(s);// comparing and ignore case sensitive
		System.out.println("The value of equalsIgnoreCase ="+ a);
		
		String upperCase = s.toUpperCase();// change the string to UPPERCASE
		System.out.println("The value of upperCase ="+ upperCase);
		
		String lowerCase = s.toLowerCase();// change the string to lowercase
		System.out.println("The value of lowerCase ="+ lowerCase);
			
		char charAt = s.charAt(16);//total string value calculation (i.e) string length-1
		//it displays the what character in the string is available 
		System.out.println("The value of charAt = "+ charAt);
		
		int indexOf = s.indexOf("t");// it will check the first occurrence of the given char
		System.out.println("The value of indexOf ="+ indexOf);
		
		int lastIndexOf = s.lastIndexOf("t");// it will search from last occurrence of the given char
		System.out.println("The value of lastIndexOf ="+ lastIndexOf);
		
		boolean contains = s.contains("e");// it will check the character is present in our string or not
		System.out.println("The value of contains ="+ contains);

        boolean startsWith = s.startsWith("W");//check the first letter of the string starts with or not	
        System.out.println("The given prefix string is present or not =" +  startsWith);
	
	    boolean endsWith = s.endsWith("g");//check the last letter of the string ends with or not
	    System.out.println("The suffix string is present or not =" + endsWith);
	
	    String trim = s.trim();//remove the unwanted space in the string "  welcome to string  " 
	    System.out.println("Remove unwanted space from the string =" + trim);
	
	    String replace = s.replace("to","my");
	    System.out.println("replace old char to new =" + replace);

	   	    
	    String concat = s.concat("data");
	    System.out.println("the concate string is =" + concat);
	    
	    
	    String substring2 = s.substring(8);
	    System.out.println("the value of sub string is = " + substring2);
	    
	    String substring = s.substring(9,12);
	    System.out.println("the sub string is =" + substring);
	    
	    
	    // String c = null;//if we declare the string value is null 
	    //then it will throw exception as null pointer exception
	    //boolean empty = c.isEmpty();
	    //System.out.println("the string declared as null equal to =" + empty  );
	    
	    boolean empty2 = s.isEmpty();
	    System.out.println("Check whaether the string is empty or not =" + empty2);
	    
	    String[] split = s.split( "" );
	    for (String string : split) {
	    	System.out.println(string);
		}
	    
	    
	    
	   
        //String replaceAll = s.replaceAll("[^a-zA-Z*$]","" );
        
        
	    //System.out.println("the value of replace all = " + replaceAll);
	
	}
}
