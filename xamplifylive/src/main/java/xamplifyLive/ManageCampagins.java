package xamplifyLive;



	import java.util.Properties;

	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.Test;

	public class ManageCampagins {
		
		WebDriver driver = Instance.getInstance();
		  Properties properties = PropertiesFile.readPropertyFile("datafile.properties");
		  

			@Test(priority=41,enabled=true)
		
			public void manage_campaign() throws InterruptedException {
				Thread.sleep(5000);
				
				driver.get("https://xamplify.io/home/dashboard");
				Thread.sleep(15000);
				WebElement mng_cmpgn=driver.findElement(By.xpath(properties.getProperty("campaignhover1")));
				Thread.sleep(5000);
				Actions camp_action=new Actions(driver);
				 camp_action.moveToElement(mng_cmpgn).perform();
				 driver.findElement(By.xpath(properties.getProperty("managecampaign"))).click();
				 Thread.sleep(15000);
				 driver.findElement(By.xpath(properties.getProperty("memail"))).click();
				 Thread.sleep(15000);
				 driver.findElement(By.xpath(properties.getProperty("mvideo"))).click();
				 Thread.sleep(15000);
				 driver.findElement(By.xpath(properties.getProperty("msocial"))).click();
				 Thread.sleep(15000);
				 driver.findElement(By.xpath(properties.getProperty("mevent"))).click();
				 Thread.sleep(15000);
				 driver.findElement(By.xpath(properties.getProperty("mall"))).click();
				 Thread.sleep(5000);
				 driver.findElement(By.xpath(properties.getProperty("mgridview"))).click();
				 Thread.sleep(5000);
				 driver.findElement(By.xpath(properties.getProperty("mlistview"))).click();
				 Thread.sleep(5000);
				 
				 driver.findElement(By.xpath(properties.getProperty("mcalendar"))).click();
				 Thread.sleep(5000);
				 driver.get("https://xamplify.io/home/campaigns/manage");
				WebElement ele_drpdwn=driver.findElement(By.xpath(properties.getProperty("msortby")));
				Select sort=new Select(ele_drpdwn);
				Thread.sleep(5000);
				sort.selectByIndex(1);
				Thread.sleep(6000);
				sort.selectByIndex(2);
				Thread.sleep(6000);
				sort.selectByIndex(3);
				Thread.sleep(5000);
				sort.selectByIndex(4);
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("msearchdata"))).sendKeys("video-28");
				Thread.sleep(8000);
				driver.findElement(By.xpath(properties.getProperty("msearchicon"))).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("cmpgnbasedreport"))).click();
				Thread.sleep(5000);
				
			
				driver.findElement(By.xpath(properties.getProperty("mc_vdepreview"))).click();
				Thread.sleep(15000);
				driver.findElement(By.xpath(properties.getProperty("mc_vdeclosepreview"))).click();	//preview vde//
				
				
				Thread.sleep(15000);
				
				driver.findElement(By.xpath(properties.getProperty("mc_emailpreview"))).click();
				Thread.sleep(6000);
				driver.findElement(By.xpath(properties.getProperty("mc_emailclose"))).click();
				Thread.sleep(25000);
				driver.findElement(By.xpath(properties.getProperty("mc_prtnr_preview"))).click();
				Thread.sleep(6000);
				driver.findElement(By.xpath(properties.getProperty("mc_prtnr_preview_clse"))).click();
				Thread.sleep(15000);
				
				
				
				driver.findElement(By.xpath(properties.getProperty("mc_tot_receipents"))).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("mc_tot_receipentsclose"))).click();
				Thread.sleep(5000);
				
				

				driver.findElement(By.xpath(properties.getProperty("mc_act_receipents"))).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("mc_act_receipentsclose"))).click();
				Thread.sleep(5000);
			
				
				driver.findElement(By.xpath(properties.getProperty("mc_clckdurl"))).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("mc_clckdurl_close"))).click();
				Thread.sleep(5000);
				
				
				driver.findElement(By.xpath(properties.getProperty("mc_views"))).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("mc_view_clse"))).click();
				Thread.sleep(5000);
			
								 driver.get("https://xamplify.io/home/campaigns/manage");
								 Thread.sleep(3000);
								 driver.findElement(By.xpath(properties.getProperty("msearchdata"))).sendKeys("video-28");
									Thread.sleep(8000);
									driver.findElement(By.xpath(properties.getProperty("msearchicon"))).click();
									Thread.sleep(5000);
									WebElement web11=driver.findElement(By.xpath("/html/body/app-root/app-home/div/div/app-manage-publish/div[1]/div[3]/div/div/div/div[2]/div/select"));
									Select w1=new Select(web11);
									w1.selectByVisibleText("All");
									Thread.sleep(5000);
									driver.findElement(By.xpath(properties.getProperty("mc_settingsicon"))).click();
									
								

								/*	Select prvw=new Select(web1_drpdwn);
									prvw.selectByVisibleText(" Preview Campaign\r\n" + 
											"													");*/
/*
									JavascriptExecutor jse = (JavascriptExecutor) driver;*/
									 
									Thread.sleep(5000);
									/*WebElement we_in=driver.findElement(By.xpath("/html/body/app-root/app-home/div/div/app-manage-publish/div[1]/div[3]/div/div/div/section/div"));
																					
												 jse.executeScript("arguments[0].scrollIntoView(true);",we_in);
										  Thread.sleep(5000);
										  /html/body/app-root/app-home/div/div/app-manage-publish/div[1]/div[3]/div/div/div/section/div
										  */
									
									/*	
										  EventFiringWebDriver efwd=new EventFiringWebDriver(driver);
										  Thread.sleep(5000);
										  efwd.executeScript("document.getelementbyxpath('/html/body/app-root/app-home/div/div/app-manage-publish/div[1]/div[3]/div/div/div/section/div').scrollBottom=500");
										  
										  
										
										  */
									driver.findElement(By.xpath(properties.getProperty("mc_preview"))).click();
									Thread.sleep(5000);
									driver.findElement(By.xpath(properties.getProperty("mc_preview_close"))).click();
									Thread.sleep(5000);
									
									
									 driver.findElement(By.xpath(properties.getProperty("msearchdata"))).sendKeys("video-28");
										Thread.sleep(8000);
										driver.findElement(By.xpath(properties.getProperty("msearchicon"))).click();
										Thread.sleep(5000);
										driver.findElement(By.xpath(properties.getProperty("mc_settingsicon"))).click();
										Thread.sleep(5000);

									driver.findElement(By.xpath(properties.getProperty("mc_cpycampaign"))).click();
									Thread.sleep(5000);
									driver.findElement(By.xpath(properties.getProperty("mc_cpy_cmpgn_save"))).click();
									Thread.sleep(5000);
									
									
									
									driver.findElement(By.xpath(properties.getProperty("mc_settingsicon1"))).click();
									Thread.sleep(5000);
									driver.findElement(By.xpath(properties.getProperty("mc_drft_delete"))).click();
									Thread.sleep(5000);
									
									driver.findElement(By.xpath(properties.getProperty("mc_s_delete"))).click();
									Thread.sleep(5000);
									
			}
			
			
			
		
		
		
		


	}

