package testNgConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertConcepts {
	
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
	
	@Test()
	public void googleTitle() {
		String title = driver.getTitle();
		System.out.println("Actual title is --> "+title);
		
		Assert.assertEquals(title, "Google1","Title is not matched");
	}
	
	@Test()
	public void googleLogoTest() {
		boolean b =	driver.findElement(By.cssSelector("body:nth-child(2) div.L3eUgb:nth-child(2) div.o3j99.LLD4me.yr19Zb.LS8OJ:nth-child(2) div.k1zIA.rSk4se:nth-child(2) > img.lnXdpd:nth-child(2)")).isDisplayed();
		Assert.assertTrue(b);
		Assert.assertEquals(b, true);
		}
	
	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}

}
