import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Test_Diff_locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://saucedemo.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);//pause the execution for 3 seconds
		
		//Fill the details and submit
		
		/*
		 * driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 * driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 * driver.findElement(By.id("login-button")).click();
		 */
		
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		
		try {
		
		driver.findElement(By.xpath("//span[@class='title']")).isDisplayed();
		System.out.println("Login successfull");
		
		}
		
		catch(Exception e) {
			
			System.out.println("login failed");
		}
		
			}

}
