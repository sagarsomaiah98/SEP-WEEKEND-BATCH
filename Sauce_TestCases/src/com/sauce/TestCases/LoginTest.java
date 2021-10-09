package com.sauce.TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void loginTest(String username, String password) throws IOException {
		
System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		 driver.get("https://www.saucedemo.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		  driver.findElement(By.xpath(" //input[@id='password']")).sendKeys(password);
		  
	driver.findElement(By.xpath(" //input[@id='login-button']")).click();
	//driver.close();
	
	TakesScreenshot scrShot = ((TakesScreenshot) driver);

	File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
	File DestFile= new File("D:\\JANBASK\\WEEKDAY BATCH SEP\\Page _Object _Model\\SCREENSHOTS");
	
	FileUtils.copyFile(SrcFile, DestFile);
	
	}

	

}
