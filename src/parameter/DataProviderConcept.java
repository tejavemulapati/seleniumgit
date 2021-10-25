package parameter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataProviderConcept {
	
	WebDriver driver;

	@BeforeMethod
	public void setUp(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Teja_Vemulapati.ASIA-PACIFIC\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData(){
		ArrayList<Object[]> testInput = ReadExcelSheet.getDataFromExcel();
		return testInput.iterator();
	}
	
	@Test(dataProvider = "getTestData")
	public void enterData(String username, String password) {
		//driver.findElement(By.cssSelector("#ctl00_CPHContainer_txtUserLogin"))drive
		//#ctl00_CPHContainer_txtPassword
		
		//Input Username
		driver.findElement(By.cssSelector("#ctl00_CPHContainer_txtUserLogin")).clear();
		driver.findElement(By.cssSelector("#ctl00_CPHContainer_txtUserLogin")).sendKeys(username);
		
		//Input Password
		driver.findElement(By.cssSelector("#ctl00_CPHContainer_txtPassword")).clear();
		driver.findElement(By.cssSelector("#ctl00_CPHContainer_txtPassword")).sendKeys(password);
		
	}
}
