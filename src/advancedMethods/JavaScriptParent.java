package advancedMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptParent {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Teja_Vemulapati.ASIA-PACIFIC\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.testyou.in/Login.aspx");
		WebElement loginbtn = driver.findElement(By.xpath("//input[@name=\"ctl00$CPHContainer$btnLoginn\"]"));
		clickElementbyJS(loginbtn, driver);
		//driver.navigate().refresh();
		//refreshBrowserByJS(driver);
		//Thread.sleep(3000);
		//clickElementbyJS(loginbtn, driver);
		
		//gettitle of page by js
		System.out.println(getTitleByJS(driver));
		
		//get page inner text
		System.out.println(getPageInnerTextByJS(driver));
		
		//scrollpage down
		scrollPageDownByJS(driver);
		
		//Hiddenelements
		
		WebElement verificationlink = driver.findElement(By.xpath("//a[contains(text(),'Get Verification Mail')]"));
		scrollintoviewByJS(verificationlink,driver);
		Thread.sleep(3000);
		driver.close();
	}
	
	public static void clickElementbyJS(WebElement webelement, WebDriver driver ) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		//since only one element is there so we are giving 0 in the arguments
		//directly hit the html code in the website
		js.executeScript("arguments[0].click();", webelement);
	}
	
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}
	
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static String getPageInnerTextByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		return js.executeScript("return document.documentElement.innerText;").toString();
	}
	
	public static void scrollPageDownByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollintoviewByJS(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public static void hiddenElementsByJS(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("document.getElementsByclassName(element).click();");
	}
}
