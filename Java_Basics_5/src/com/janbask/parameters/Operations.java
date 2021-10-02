package com.janbask.parameters;

public class Operations {
	
public void addition(int a, int b) {
		
		
		int res=a+b;
		
		System.out.println("Addition of "+a+" and "+b+ " is "+res);
		
	}
	
	
	public void subtraction(int k,int m, int l) {
		
		
		int res1=k-m-l;
		
		System.out.println("subtraction of "+k+" and "+l+ " and "+m+ " is "+res1);
	}

	public static void main(String[] args) {
		Operations O=new Operations();
		/*
		 * O.addition(50,10); 
		 * O.addition(20,15); 
		 * O.addition(88,63);
		 */
		
		
		O.subtraction(95, 10, 5);
		O.subtraction(100, 20, 10);
		
		O.subtraction(66, 85, 5);
		
		
		
		
		
		

	}

}
