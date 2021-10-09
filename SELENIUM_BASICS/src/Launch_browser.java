import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Launch_browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch the browser
		
		System.setProperty("webdriver.chrome.driver", "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "D:\\JARS\\jar_files\\geckodriver\\geckodriver.exe");
		WebDriver driver1= new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver", "D:\\JARS\\jar_files\\edgedriver\\edgedriver.exe");
		WebDriver driver3= new EdgeDriver();
		WebDriver driver4= new SafariDriver();
		WebDriver driver5= new OperaDriver();
		
		
		
		
		

	}

}
