package com.janbask.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("This is a link")).click();
		driver.navigate().back();
		driver.findElement(By.name("firstName")).sendKeys("Janbask");
		
		driver.findElement(By.xpath("//button[@id='idOfButton']")).click();
		driver.findElement(By.xpath("//input[@id='male']")).click();
		driver.findElement(By.xpath("//input[@value='Automation']")).click();
		
		

	}

}
