package xamplifyLive;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class EventCampaign {

	 WebDriver driver = Instance.getInstance();
	 
		Properties properties = PropertiesFile.readPropertyFile("datafile.properties");


		@BeforeMethod
		
		public void evecampaign() throws InterruptedException, SQLException
		{
			driver.get("https://xamplify.io/home/dashboard/welcome");

				Thread.sleep(15000);
				Properties properties = PropertiesFile.readPropertyFile("datafile.properties");

				Thread.sleep(10000);
				WebElement campele=driver.findElement(By.xpath(properties.getProperty("evecampaign_hover")));
																
																		
				Actions camp_action=new Actions(driver);
				 camp_action.moveToElement(campele).perform();
				 Thread.sleep(5000);
				 WebElement create_campele= driver.findElement(By.xpath(properties.getProperty("eve_createcampaign")));
				 camp_action.moveToElement(create_campele);
				 camp_action.click();
				 camp_action.perform();
				Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("eve_openecampaign"))).click();		
			Thread.sleep(5000);
			
		}

}
