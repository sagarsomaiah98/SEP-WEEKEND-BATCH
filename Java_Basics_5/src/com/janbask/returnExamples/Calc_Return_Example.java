package com.janbask.returnExamples;

public class Calc_Return_Example {
	
public int addition(int a, int b) {
		
		
		int res=a+b;
		
		//System.out.println("Addition of "+a+" and "+b+ " is "+res);
		
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Calc_Return_Example c= new Calc_Return_Example();
		
		
		
		int output=c.addition(33, 10);;
		
		if(output>50)
			
			System.out.println(output +" is greater than 50");
		else
			System.out.println(output +" is smaller than 50");

	}

}
