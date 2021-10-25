package basicMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Teja_Vemulapati.ASIA-PACIFIC\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		Thread.sleep(200);
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//span[contains(text(),'Draggable 1')]"))).moveToElement(driver.findElement(By.xpath("//div[@id='mydropzone']"))).release().build().perform();
		

	}

}
