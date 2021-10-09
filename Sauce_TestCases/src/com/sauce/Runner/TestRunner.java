package com.sauce.Runner;

import java.io.IOException;

import com.sauce.TestCases.AddToCartTest;
import com.sauce.TestCases.LogOutTest;
import com.sauce.TestCases.LoginTest;

public class TestRunner {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		LoginTest t= new LoginTest();
		t.loginTest("standard_user"	, "secret_sauce");
		
		/*
		 * AddToCartTest a= new AddToCartTest(); a.AddTocartTest("standard_user" ,
		 * "secret_sauce");
		 * 
		 * 
		 * LogOutTest l=new LogOutTest();
		 * 
		 * l.logoutTest("standard_user" , "secret_sauce");
		 */

	}

}
