package com.janbask.methodOverloading;

public class CalcTest {
	
	
	public void add(int a,int b) {
		int res=a+b;
		
		System.out.println(res);		
		
	}
	public void add(int a,int b,int c) {
		int res=a+b+c;
		
		System.out.println(res);		
		
	}
	public void add(int a,int b,int c,int d) {
		int res=a+b+c+d;
		
		System.out.println(res);
			
	}
	
	public void add(double a, double b) {
		
		double  res=a+b;
		System.out.println("double method");
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		CalcTest c= new CalcTest();
		/*
		 * c.add(20, 10,50); c.add(50, 10); c.add(100, 20); c.add(10, 10, 20, 40);
		 * c.add(5, 20,60); c.add(100, 200);
		 */
		c.add(2.5,7.5);
		

	}

}
