import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void logintest() {
		
System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		 driver.get("https://www.saucedemo.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		  driver.findElement(By.xpath(" //input[@id='password']")).sendKeys("secret_sauce");
		  
	driver.findElement(By.xpath(" //input[@id='login-button']")).click();
	driver.close();
	}

}
