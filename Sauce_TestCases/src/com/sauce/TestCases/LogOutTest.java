package com.sauce.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOutTest {
	
public void logoutTest(String uname,String password) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	 driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
	  driver.findElement(By.xpath(" //input[@id='password']")).sendKeys(password);
	  
driver.findElement(By.xpath(" //input[@id='login-button']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//button[normalize-space()='Open Menu']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath(" //a[normalize-space()='Logout']")).click();
driver.close();
}

}
