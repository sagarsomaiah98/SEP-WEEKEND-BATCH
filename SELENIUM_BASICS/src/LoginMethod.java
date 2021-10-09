import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginMethod {
	
	
	public void login(String username, String password) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://saucedemo.com");
		driver.manage().window().maximize();
		//Thread.sleep(3000);//pause the execution for 3 seconds
		
		//Fill the details and submit
		
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		//Thread.sleep(3000);
		
		driver.close();
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		LoginMethod l= new LoginMethod();
		l.login("standard_user","secret_sauce");
		l.login("locked_out_user", "secret_sauce");
		l.login("problem_user", "secret_sauce");
		l.login("performance_glitch_user", "secret_sauce");
		

	}

}
