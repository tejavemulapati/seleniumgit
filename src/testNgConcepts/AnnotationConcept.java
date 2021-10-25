package testNgConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationConcept {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Teja_Vemulapati.ASIA-PACIFIC\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
	}
	
	@Test(priority=1, groups = "p0")
		public void googleTest() {
			int i = 9/0;
			System.out.println(i);
		}

	@Test(priority=1, groups = "p0",dependsOnMethods = "googleTest")
	public void googleTest1() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test(priority=1, groups = "p0",dependsOnMethods = "googleTest")
	public void googleTest2() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	
	
	
	
	}


