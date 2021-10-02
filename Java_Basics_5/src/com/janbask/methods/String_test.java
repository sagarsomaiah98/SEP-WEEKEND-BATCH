package com.janbask.methods;

public class String_test {
	
	public void lowercase() {
	String name="WelcOme To JaNBasK TrAiniNG";
	System.out.println(name.toLowerCase());
	
		
	}
	
	//method syntax- how to create a method
	
	// accessmodifiers return type methodname
	public  void uppercase() {
		
		String name="SeLeniuM Is a AuToMaTion TooL";
		System.out.println(name.toUpperCase());
		
	}
	public void index() {
		String name="Java is platform independent";
		
		System.out.println(name.charAt(9));
				
	}
	

	public static void main(String[] args) {
		String_test t= new String_test();
		t.lowercase();
		t.index();
		t.uppercase();
	
		

	}

}
