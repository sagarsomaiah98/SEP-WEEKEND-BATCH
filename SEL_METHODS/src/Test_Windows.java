import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		 
       WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	
		
		driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		
		Set<String> windows= driver.getWindowHandles();
		System.out.println(windows.size());//no of windows opened
		Iterator<String> it= windows.iterator();
		
		
		String parentWin=it.next();
		String childWin=it.next();
		driver.switchTo().window(childWin);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Intellectual Property']")).click();
		
		//driver.close();
		driver.quit();
		

	

	}

}
