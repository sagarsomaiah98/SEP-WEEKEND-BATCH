package com.janbask.returnExamples;

public class String_Return_Example {
	
	
	public String string_method(String value) {
		
		String output=value.substring(5, 10);
		
		return output;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String_Return_Example s= new String_Return_Example();
	String k=s.string_method("Welcome to training");
	System.out.println(k.length());
	System.out.println(k.substring(3,5));
	System.out.println(k.indexOf('i'));
	
	

	}

}
