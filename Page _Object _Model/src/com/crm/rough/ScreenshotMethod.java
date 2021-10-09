package com.crm.rough;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		 driver.get("https://www.saucedemo.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("sdfsdf");
		  driver.findElement(By.xpath(" //input[@id='password']")).sendKeys("sfsfsfsdf");
		  
	driver.findElement(By.xpath(" //input[@id='login-button']")).click();

	TakesScreenshot scrShot = ((TakesScreenshot) driver);

	File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
	File DestFile= new File("D:\\JANBASK\\WEEKDAY BATCH SEP\\Page _Object _Model\\SCREENSHOTS\\test.jpeg");
	
	FileUtils.copyFile(SrcFile, DestFile);
		

	}

}
