package basicMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Teja_Vemulapati.ASIA-PACIFIC\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		//below xpath is not recomended
		driver.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/input[1]")).sendKeys("Tom");
		
		//find by id 
		//driver.findElement(By.id(""));
		//driver.findElement(By.name(""));
		
		//link
		driver.findElement(By.linkText("Sign-In")).click();
		
		//Partial
		driver.findElement(By.partialLinkText("")).click();
		
		//css
		driver.findElement(By.cssSelector(""));
		
		//class
		driver.findElement(By.className("")).click();

	}

}
