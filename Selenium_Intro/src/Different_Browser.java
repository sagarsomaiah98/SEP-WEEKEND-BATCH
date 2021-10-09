import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Different_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\SEP WEEKEND BATCH\\JARS\\chromedriver\\chromedriver.exe");
		
	//	WebDriver driver= new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "D:\\JANBASK\\SEP WEEKEND BATCH\\JARS\\geckodriver\\geckodriver.exe");
		
		WebDriver driver1 = new FirefoxDriver();
		
		WebDriver driver2= new EdgeDriver();
		
		WebDriver driver3= new SafariDriver();
		

	}

}
