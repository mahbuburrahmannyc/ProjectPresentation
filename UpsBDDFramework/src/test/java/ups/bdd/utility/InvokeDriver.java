package ups.bdd.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeDriver {
	
	public static WebDriver driver;
	
	public static void callDriver() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new  ChromeDriver();
		
	}
	
	public static void tearDown() {
		
		driver.close();
	}
}
