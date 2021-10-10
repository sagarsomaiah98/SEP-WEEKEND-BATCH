import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Before_Testng_Method {

	
	@Test
	public void test1() {
		
		System.out.println("Test1 testng method");
	}
	
	
	
	@Test
	public void test2() {
		
		System.out.println("Test2 testng method");
	}
	@Test
	public void test3() {
		
		System.out.println("Test3 testng method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("**********BEFORE METHOD**********");
	}
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("**********AFTER METHOD**********");
	}
	
	

}
