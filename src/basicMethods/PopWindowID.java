package basicMethods;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PopWindowID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Teja_Vemulapati.ASIA-PACIFIC\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.dummysoftware.com/popupdummy_testpage.html");
		Thread.sleep(200);
		
		//Get window handles for parent and child and store them inside set object
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		
		//Navigate inside set
		String Parentid = it.next();
		String childId1 = it.next();
		String childId2 = it.next();
		String childId3 = it.next();
		
		System.out.println("Parent window title is --> "+driver.getTitle());
		System.out.println("Parent window ID is --> "+Parentid);
		
		//Switch to 1st pop-up
		Thread.sleep(1000);
		driver.switchTo().window(childId1);
		System.out.println(driver.getTitle());
		driver.close();
		
		//Switch to 2nd pop-up
		Thread.sleep(1000);
		driver.switchTo().window(childId2);
		System.out.println(driver.getTitle());
		driver.close();
		
		//Switch to 3rd pop-up
		Thread.sleep(1000);
		driver.switchTo().window(childId3);
		System.out.println(driver.getTitle());
		driver.close();
		
		
	}

}
