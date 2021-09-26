package com.janbask.exceptionExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionExample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
	FileInputStream fs = new FileInputStream("C:/Test.tx");
	
	System.out.println("File not found");

	}

}
