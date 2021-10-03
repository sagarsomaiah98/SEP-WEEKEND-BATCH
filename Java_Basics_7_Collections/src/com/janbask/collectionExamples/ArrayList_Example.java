package com.janbask.collectionExamples;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> regNo= new ArrayList<Integer>();
		regNo.add(1200);
		regNo.add(1210);
		regNo.add(1300);
		regNo.add(1350);
		regNo.add(1400);
		regNo.add(1420);
		regNo.add(1500);
		regNo.add(1600);
		regNo.add(1700);
		regNo.add(1420);
		
		
		System.out.println(regNo.size());
		
		int len=regNo.size();
		
		/*
		 * System.out.println(regNo.get(0)); System.out.println(regNo.get(1));
		 * System.out.println(regNo.get(2)); System.out.println(regNo.get(3));
		 * System.out.println(regNo.get(4)); System.out.println(regNo.get(5));
		 * System.out.println(regNo.get(6));
		 */
		
		for( int i=0;i<len;i++) {
			System.out.println(regNo.get(i));
			
		}
		
		regNo.add(2, 999);
		regNo.remove(5);
		
		
System.out.println("After inserting the values");
int newsize=regNo.size();
System.out.println("new size is "+newsize);
for( int i=0;i<newsize;i++) {
			System.out.println(regNo.get(i));
			
		}
		
		
	}

}
