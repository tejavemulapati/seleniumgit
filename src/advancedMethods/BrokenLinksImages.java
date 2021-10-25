package advancedMethods;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksImages {
	public static WebDriver driver;
	public static List<WebElement> linkslist;
	public static ArrayList<WebElement> valid_url_list;
	public static HttpURLConnection httpurlconnection;
	
	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Teja_Vemulapati.ASIA-PACIFIC\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.testyou.in/Login.aspx");
		
		//get all the links and images starting with tag a and href
		linkslist = driver.findElements(By.tagName("a"));
		linkslist.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Total links are  :"+linkslist.size());
		
		valid_url_list = new ArrayList<WebElement>();
		for(int i=0; i<linkslist.size(); i++) {
			System.out.println(linkslist.get(i).getAttribute("href"));
			if(linkslist.get(i).getAttribute("href") != null && (!linkslist.get(i).getAttribute("href").contains("javascript"))) { 
				valid_url_list.add(linkslist.get(i));
			}	
		}
		System.out.println("Total number of valid links in webpage are :"+ valid_url_list.size());
		
		//check the href url
		for(int j=0; j<valid_url_list.size(); j++) {
			httpurlconnection = (HttpURLConnection) new URL(valid_url_list.get(j).getAttribute("href")).openConnection();
			httpurlconnection.connect();
			int response_code = httpurlconnection.getResponseCode();
			String response_message = httpurlconnection.getResponseMessage();
			System.out.println(valid_url_list.get(j).getAttribute("href")+" <<<Response code is --> "+response_code+">>>"+" Response Message is --> "+response_message);
		}
		
		driver.close();
	}

}
