package com.janbask.inheritanceExample;

public class Parent {
	
	String name="John";
	int age=55;
	
	
	public void bike() {
		
		System.out.println(" parent owns a bike");
	}
	
	public void house() {
		
		System.out.println(" parent owns a house");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Parent();
		p.bike();
		p.house();

	}

}
