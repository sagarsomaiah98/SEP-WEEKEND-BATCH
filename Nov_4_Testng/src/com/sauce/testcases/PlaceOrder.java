package com.sauce.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PlaceOrder {
	
	
	@Test
	public void placeOrder() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\SEP WEEKEND BATCH\\JARS\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.xpath(" //input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		driver.findElement(By.xpath(" //button[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath(" //a[@class='shopping_cart_link']")).click();
		driver.findElement(By.xpath(" //button[@id='checkout']")).click();
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("john");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("ken");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("21478");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='finish']")).click();
		
		String confirmation=driver.findElement(By.xpath("//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")).getText();
		System.out.println(confirmation);
		Thread.sleep(3000);
		driver.quit();
		
	}

}
