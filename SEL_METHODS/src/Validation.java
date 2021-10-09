import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\\\JANBASK\\\\WEEKDAY BATCH SEP\\\\CHROME DRIVER\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	WebElement loginbutton= driver.findElement(By.xpath(" //input[@id='login-button']"));
	loginbutton.click();
	
	String value=driver.findElement(By.xpath("//h3[normalize-space()='Epic sadface: Username is required']")).getText();
	System.out.println(value);
	
		

	}

}
