package com.janbask.methods;

public class Calc {
	
	
	public void addition() {
		
		int a=40;
		int b=30;
		int res=a+b;
		
		System.out.println("Addition of "+a+" and "+b+ " is "+res);
		
	}
	
	
	
	
	public void subtraction() {
		
		int k=30;
		int l=15;
		int res1=k-l;
		
		System.out.println("subtraction of "+k+" and "+l+ " is "+res1);
	}

	public static void main(String[] args) {
		
		//Create a object 
		
		//Classname objectname= new Classname();
		
		Calc c=new Calc();
		
		c.subtraction();
		c.addition();
		
		
		
		

	}

}
