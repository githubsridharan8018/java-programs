package com.mywork;

public class Child1 extends Parent1{

	
	@Override
	public void be() {
	System.out.println("part time");}
	
	
	
	@Override
	public void me() {
 System.out.println("part time ");		
	}

	
	@Override
	public void car() {
System.out.println("bmw");		
	}
	
	public static void main(String[] args) {//denotes upcasting
		
		Parent1 s = new Child1();
		s.be();
		s.me();
		s.car();
		
		
	}
	}


