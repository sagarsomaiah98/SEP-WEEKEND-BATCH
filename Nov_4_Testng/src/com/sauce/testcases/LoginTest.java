package com.sauce.testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void logintest() {
		
		
System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\SEP WEEKEND BATCH\\JARS\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.xpath(" //input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		String actual=driver.findElement(By.xpath("//span[@class='title']")).getText();
		System.out.println(actual);
		
		assertEquals(actual, "PRODUCTS");
		
		driver.quit();
	}

}
