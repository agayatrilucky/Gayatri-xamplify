package xamplifyLive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class Instance {

	
	public static WebDriver driver;

	   public static WebDriver getInstance() {
	     if (driver == null) {
	 		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver2.exe");

	       driver = new ChromeDriver();
	     }
	     return driver;
	   }
	
}
