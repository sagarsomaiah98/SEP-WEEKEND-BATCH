package com.sauce.testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogoutTest {
	
	@Test
	public void logout() throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\SEP WEEKEND BATCH\\JARS\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.xpath(" //input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		
	boolean status=	driver.findElement(By.xpath("//input[@id='login-button']")).isDisplayed();
	
	System.out.println(status);
	assertEquals(status, true);
		
		driver.quit();
	}

}
