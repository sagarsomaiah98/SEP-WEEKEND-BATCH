import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_Filling_Example {
	
	public String randomValue() {
String[] alp= {"a","b","c","d","2","3","12","v","z","3","t","y","r"};
 		
		int num;
		
		String value = "";
		for( int i=0;i<5;i++) {
		num= (int) (Math.random()*10);
		//System.out.println(num);
		value=alp[num]+value;
		
		
	}
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Form_Filling_Example f= new Form_Filling_Example();
		String uname=f.randomValue();
	System.out.println(uname);	
	
	System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	 driver.get("https://parabank.parasoft.com/parabank/register.htm");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath(" //input[@id='customer.username']")).sendKeys(uname);

		
		
		


	}
		
}
