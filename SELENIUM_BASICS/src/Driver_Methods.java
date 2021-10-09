import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		/*
		 * d.get("https://www.google.com"); d.get("https://www.bing.com");
		 * d.get("https:///selenium.hq.org");
		 */
		
		//d.navigate().to("https://www.saucedemo.com/");
		
		d.get("https://saucedemo.com");
		
		//to maximize
		
		d.manage().window().maximize();
		//d.close();
		
		Thread.sleep(3000);
		d.quit();
		
	
		

	}

}
