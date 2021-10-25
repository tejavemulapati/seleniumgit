	package basicMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Teja_Vemulapati.ASIA-PACIFIC\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(6000); // --> Static wait
		
		//Pageloadtimeout -->Dynamic in nature
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//Implicit wait -->Dynamic in nature
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

	}

}
