package basicMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyfile  {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream fs = new FileInputStream("C:\\Users\\Teja_Vemulapati.ASIA-PACIFIC\\eclipse-workspace\\SeleniumConcepts\\src\\basicMethods\\config.properties");
		prop.load(fs);
		System.out.println(prop.getProperty("name"));
		
		String browser = prop.getProperty("browser");
		
		System.out.println(browser);
		

	}

}
