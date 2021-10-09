import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\SEP WEEKEND BATCH\\JARS\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.bing.com");
		//driver.get("http://www.google.com");
          // driver.get("http://www.salesforce.com");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.google.com");
		
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
           
           
           
	}

}
