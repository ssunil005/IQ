package parameters;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	//pre-conditions
	//test
	
	@BeforeSuite
	public void startserver() {
		System.out.println("start server");
		
	}	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch browser");
	}
	
	@BeforeTest
	public void login() {
		System.out.println();
	}
	@Test
	public void VerifyHomePageTest() {
		System.out.println("VerifyHomePageTitleTest");
	}
	
	
	

}
