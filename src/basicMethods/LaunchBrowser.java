package basicMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Teja_Vemulapati.ASIA-PACIFIC\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String exp_title = "Google";
		driver.get("http://www.google.com");
		String actual_title = driver.getTitle();
		if(exp_title.equals(actual_title)) {
			System.out.println("Title "+actual_title+" is correct title ");
		}else {
			System.out.println("Title "+actual_title+" is not correct title ");
		}
		
		String act_url = driver.getCurrentUrl();
		System.out.println("Actual url is --> "+act_url);
		//System.out.println(driver.getPageSource());
		driver.quit();

	}

}
