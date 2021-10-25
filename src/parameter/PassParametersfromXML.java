package parameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class PassParametersfromXML {
	
	WebDriver driver;
	
	@BeforeMethod
	@Parameters({"url"})
	public void setUp(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Teja_Vemulapati.ASIA-PACIFIC\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		driver.findElement(By.cssSelector("body:nth-child(2) div.L99Ugb:nth-child(2) div.o3j99.LLD4me.yr19Zb.LS8OJ:nth-child(2) div.k1zIA.rSk4se:nth-child(2) > img.lnXdpd:nth-child(2)"));

}

}