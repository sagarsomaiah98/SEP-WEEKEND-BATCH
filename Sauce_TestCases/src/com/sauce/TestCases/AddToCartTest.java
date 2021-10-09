package com.sauce.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartTest {
	
	public void AddTocartTest(String username, String password) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		 driver.get("https://www.saucedemo.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		  driver.findElement(By.xpath(" //input[@id='password']")).sendKeys(password);
		  
	driver.findElement(By.xpath(" //input[@id='login-button']")).click();
	
	driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(" //a[@class='shopping_cart_link']")).click();
	Thread.sleep(3000);
	String value=driver.findElement(By.xpath(" //div[@class='inventory_item_name']")).getText();
	System.out.println(value);
		
		driver.close();
		
		
	}

}
