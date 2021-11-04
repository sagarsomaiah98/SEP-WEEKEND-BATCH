import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngAnnotations {
	
	
	
	
	@Test
	public void method1() {
		System.out.println("method 1 ");
	}
	
	@BeforeMethod
	public void before() {
		
		System.out.println("Calling before method");
	}
	
	@AfterMethod
	public void after() {
		
		System.out.println("Calling after method");
	}
	
	@Test
	public void method2() {
		
		System.out.println("method 2");
	}

	@Test
	public void method3() {
		
		System.out.println("method 3");
	}
	
	@BeforeClass
	public void beforeclass() {
		
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterclass() {
		
		System.out.println("After class");
	}

}
