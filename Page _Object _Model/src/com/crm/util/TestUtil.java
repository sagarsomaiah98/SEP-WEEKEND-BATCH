package com.crm.util;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.crm.testbase.TestBase;

public class TestUtil extends TestBase {
	
	public static String random_String() {
		
		String[] alp= {"a","b","c","d","2","3","12","v","z","3","t","y","r"};
 		
		int num;
		
		String value = "";
		for( int i=0;i<5;i++) {
		num= (int) (Math.random()*10);
		//System.out.println(num);
		value=alp[num]+value;
		}
		System.out.println(value);
			return value;	
				
	}
	
	@Test
	public static String DateTime() {
		
		LocalDateTime myDateObj = LocalDateTime.now();
	   
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm");

	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	    
	    return formattedDate;
	    
	}
	
	public static void Screenshot () throws IOException {
		
		
	    
		
	     String name = driver.getTitle()+"_"+DateTime();

			TakesScreenshot scrShot = ((TakesScreenshot) driver);

			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			
			System.out.println(System.getProperty("user.dir") +"\\SCREENSHOTS\\");

			File DestFile = new File(System.getProperty("user.dir") + "\\SCREENSHOTS\\" +  name+".jpeg");

			FileUtils.copyFile(SrcFile, DestFile);
		
	}
	

}
