import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\SEP WEEKEND BATCH\\JARS\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("This is a link")).click();
		
		driver.navigate().back();
		driver.findElement(By.id("fname")).sendKeys("selenium");
		driver.findElement(By.cssSelector("#idOfButton")).click();
		
		
		driver.findElement(By.xpath(" //input[@id='male']")).click();
		
		
		driver.findElement(By.xpath("//input[@value='Performance']")).click();
	
		

	}

}
