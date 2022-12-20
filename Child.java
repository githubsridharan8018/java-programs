package com.mywork;

public class Child extends Parent { 

	@Override
	public void girl() {
 System.out.println("123456");		
	}
	
	@Override
	public void boy() {
		super.boy();
	}
	private void education() {
System.out.println("b.e");
	}
	
	
	
	public static void main(String[] args) {
		
		Parent o=new Child();
		o.boy();
		o.girl();
		
	}
	

}
