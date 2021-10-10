import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogOutTest {
	
	
	@Test
	public void logOut() throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		 driver.get("https://www.saucedemo.com/");
		 driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		  driver.findElement(By.xpath(" //input[@id='password']")).sendKeys("secret_sauce");
		  
	driver.findElement(By.xpath(" //input[@id='login-button']")).click();
	
	driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
	
	
	driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	
	Thread.sleep(3000);
	driver.close();
	
	}

}
