package basicMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Teja_Vemulapati.ASIA-PACIFIC\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.name("")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept(); // accept the alert
		alert.dismiss();

	}

}
