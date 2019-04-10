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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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
				
				WebElement eecampele=driver.findElement(By.xpath(properties.getProperty("evecampaign_hover")));
																
																		
				Actions eecamp_action=new Actions(driver);
				eecamp_action.moveToElement(eecampele).perform();
				 Thread.sleep(5000);
				 WebElement eecreate_campele= driver.findElement(By.xpath(properties.getProperty("eve_createcampaign")));
				 eecamp_action.moveToElement(eecreate_campele);
				 eecamp_action.click();
				 eecamp_action.perform();
				Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("eve_openecampaign"))).click();		
			Thread.sleep(5000);
			
			
			
			
			DatabaseQueries data = new DatabaseQueries();
			String queryev = properties.getProperty("query.getCampaignNamesByOrganizationId").replaceAll(":emailId",properties.getProperty("user.name"));
			List<String> campaignNames = data.listNames(queryev, "campaign_name");
			String campaignNameFromProp = properties.getProperty("eve_cmpgntxt").toLowerCase();
			
			driver.findElement(By.xpath(properties.getProperty("eve_campaigname"))).sendKeys(properties.getProperty("eve_cmpgntxt"));	
			
			Thread.sleep(5000);
			if(campaignNames.indexOf(campaignNameFromProp)>-1) {
			driver.findElement(By.xpath(properties.getProperty("eve_campaigname"))).clear();
			driver.findElement(By.xpath(properties.getProperty("eve_campaigname"))).sendKeys(properties.getProperty("eve_cmpgntxt")+"_"+System.currentTimeMillis());
			Thread.sleep(10000);
			}
			
			
			
			
			
			
			//driver.findElement(By.xpath(properties.getProperty("eve_campaigname"))).sendKeys("eve-1");
			driver.findElement(By.xpath(properties.getProperty("eve_subject"))).sendKeys("eve-sub");;
			
			driver.findElement(By.xpath(properties.getProperty("eve_through"))).click();
			driver.findElement(By.xpath(properties.getProperty("eve_co_on"))).click();
			
			driver.findElement(By.xpath(properties.getProperty("eve_calendar"))).click();
			
			WebDriverWait wait=new WebDriverWait(driver,30);



			// Wait till the element is not visible

			WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("eve_nxt_mnth"))));
			element.click();
			
			
			//driver.findElement(By.xpath(properties.getProperty("eve_calendar_start"))).click();
			
			WebDriverWait wait1=new WebDriverWait(driver,20);



		
			WebElement element1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("eve_strt_selectdate"))));
			element1.click();
			
			
			
			
			//driver.findElement(By.xpath(properties.getProperty("eve_strt_selectdate"))).click();
			
			driver.findElement(By.xpath(properties.getProperty("eve_strt_selectdate_time"))).sendKeys("1");
			
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("eve_endate"))).click();
			
			
			WebElement eve_drpdwn=driver.findElement(By.xpath(properties.getProperty("eve_cntrydrpdwn")));
			eve_drpdwn.click();
			Select eve_cntry=new Select(eve_drpdwn);
		//	eve_cntry.selectByVisibleText("India");
			eve_cntry.selectByValue("103");
			
			driver.findElement(By.xpath(properties.getProperty("eve_nextpage"))).click();
			
			
			WebElement bottom_drpdwn=driver.findElement(By.xpath("/html/body/app-root/app-home/div/div/app-event-campaign/div[1]/div[2]/div/div[2]/div/div[3]/app-pagination/div/select"));			
			bottom_drpdwn.click();
			Select btm_drpdwn=new Select(bottom_drpdwn);
			btm_drpdwn.selectByVisibleText(" All");
			
			

			JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				  
				 Thread.sleep(8000);
				
			
			driver.findElement(By.xpath(properties.getProperty("eve_slctlsit"))).click();
			
			driver.findElement(By.xpath(properties.getProperty("eve_slctlsit_nxt"))).click();

			JavascriptExecutor js1 = (JavascriptExecutor) driver;
				  js1.executeScript("window.scrollTo(document.body.scrollHeight,0)");
				  
				 Thread.sleep(8000);
			
			
				 
				 WebDriverWait wait2=new WebDriverWait(driver,20);



					
					WebElement element2=wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("eve_tmplte_search"))));
					element2.sendKeys("lucky");
					
					
				 
				 
				 
				 
			//driver.findElement(By.xpath(properties.getProperty("eve_tmplte_search"))).sendKeys("lucky");
			
					
					
					driver.findElement(By.xpath(properties.getProperty("eve_search_click"))).click();
		
			
					
					 
					 WebDriverWait wait3=new WebDriverWait(driver,20);



						
						WebElement element3=wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("eve_search_clear"))));
						element3.click();
						
						
					 
					
			
			//driver.findElement(By.xpath(properties.getProperty("eve_search_clear"))).click();
						 WebDriverWait wait4=new WebDriverWait(driver,20);

							WebElement element4=wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("eve_clear_search"))));
							element4.click();
							
						
						
			//driver.findElement(By.xpath(properties.getProperty("eve_clear_search"))).click();
							
							 WebDriverWait wait5=new WebDriverWait(driver,20);

								WebElement element5=wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("eve_slct_tmplte"))));
								element5.click();
			//driver.findElement(By.xpath(properties.getProperty("eve_slct_tmplte"))).click();
			
			driver.findElement(By.xpath("/html/body/app-root/app-home/div/div/app-event-campaign/div[1]/div[2]/div/div[2]/div[1]/div[3]/section/ul[1]/li/div/div[2]/div/div[3]")).click();
			driver.findElement(By.xpath(properties.getProperty("eve_prvw"))).click();
			
			
			 WebDriverWait wait6=new WebDriverWait(driver,30);

				WebElement element6=wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("eve_prvw_clse"))));
				element6.click();
			
			//driver.findElement(By.xpath("//*[@id=\"show_email_template_preivew\"]/div/div/div[1]/button")).click();
			
				
				
				JavascriptExecutor js3 = (JavascriptExecutor) driver;
				  js3.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				  
				 Thread.sleep(8000);
				driver.findElement(By.xpath(properties.getProperty("eve_tmplte_nxt"))).click();
				 
		
		driver.findElement(By.xpath(properties.getProperty("eve_are"))).click();
		
		
		
		WebElement everdrpwn=driver.findElement(By.xpath(properties.getProperty("eve_are_r1")));
		//.click();
		Select eve_rdrpdwn=new Select(everdrpwn);
		eve_rdrpdwn.selectByValue("0");
		  
		 Thread.sleep(8000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("plz open the mail:[email is not opened for eve] ");
		
		
		Thread.sleep(5000);
/*
		driver.switchTo().defaultContent();
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		  js3.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		  
		 Thread.sleep(8000);
		
		WebDriverWait evewait=new WebDriverWait(driver,20);



		// Wait till the element is not visible

		WebElement eve_element=evewait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("eve_are2"))));
		eve_element.click();
		
		
		
		//driver.findElement(By.xpath(properties.getProperty("eve_are2"))).click();
		
		WebElement everdrpwn2= driver.findElement(By.xpath(properties.getProperty("eve_are_r2")));
				//.click();
		
		//iframe[@class='cke_wysiwyg_frame cke_reset']
		
				Select eve_rdrpdwn2=new Select(everdrpwn2);
		eve_rdrpdwn2.selectByValue("13");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("cke_102_contents")));
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("tq for opening mail:[email is  opened for eve] ");

		driver.switchTo().defaultContent();
		*/


		}
		
		
@Test(priority=1)
public void eve_now() throws InterruptedException {

	WebDriverWait waitnow=new WebDriverWait(driver,50);



	WebElement elementnow=waitnow.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("eve_now"))));
	elementnow.click();
	 	
		//driver.findElement(By.xpath(properties.getProperty("eve_now"))).click();
		
		driver.findElement(By.xpath(properties.getProperty("eve_launch"))).click();
		
}

@Test(priority=2)
public void eve_schedule() throws InterruptedException {

	
	WebDriverWait waitsave=new WebDriverWait(driver,20);



	// Wait till the element is not visible

	WebElement elements=waitsave.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("EVE_SAVE"))));
	elements.click();
	 	
		//driver.findElement(By.xpath(properties.getProperty("EVE_SAVE"))).click();
		
		driver.findElement(By.xpath(properties.getProperty("eve_saved"))).click();
		
}

}



