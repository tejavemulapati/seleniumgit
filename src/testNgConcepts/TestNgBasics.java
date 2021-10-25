package testNgConcepts;

import org.testng.annotations.*;

public class TestNgBasics {
	
	@BeforeSuite
	public void setSystemProperty() {
		System.out.println("BeforeSuite - Setting System property");
	}
	
	@BeforeClass
	public void launchTheBrowser() {
		System.out.println("BeforeClass - Launch chrome browser");
	}
	
	@BeforeMethod
	public void provideURL() {
		System.out.println("BeforeMethod - URL Fetched successfully");
	}
	
	@BeforeTest
	public void Login() {
		System.out.println("BeforeTest - Login into SCG");
	}
	
	@Test
	public void testcaseRun() {
		System.out.println("Test - SCG Web GUI loaded successfully");
	}
	
	@AfterTest
	public void Deletecookies() {
		System.out.println("AfterTest - Delete cookies successful");
	}
	
	@AfterMethod
	public void Logout() {
		System.out.println("AfterMethod - Log off successful");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AfterClass - close browser");
	}

	@AfterSuite
	public void generateTestsuite() {
		System.out.println("AfterSuite - Report Generated successfully");
	}
}
