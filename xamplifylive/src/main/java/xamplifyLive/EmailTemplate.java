
package xamplifyLive;

	import java.io.IOException;
	import java.sql.SQLException;
	import java.util.List;
	import java.util.Properties;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.Test;

	public class EmailTemplate {
		

		 WebDriver driver = Instance.getInstance();
		  Properties properties = PropertiesFile.readPropertyFile("datafile.properties");
		  
		@Test(priority=27,enabled=true)
	public void email_temp() throws InterruptedException, IOException, SQLException {
			Thread.sleep(5000);
		WebElement element=driver.findElement(By.xpath(properties.getProperty("email_hover")));	
		Thread.sleep(5000);                            
	 Actions action = new Actions(driver);
	 action.moveToElement(element).perform();
		WebElement subelement= driver.findElement(By.xpath(properties.getProperty("create_email_temp")));
		action.moveToElement(subelement);
		action.click();
		action.perform();
			Thread.sleep(5000);
				
			
			/*driver.findElement(By.xpath(properties.getProperty("default"))).click();
				Thread.sleep(5000);
				Actions default1=new Actions(driver);
				WebElement def_ele=driver.findElement(By.xpath(properties.getProperty("default1_path")));
				action.moveToElement(def_ele).build().perform();
				def_ele.click();
				Thread.sleep(8000);
				driver.findElement(By.xpath(properties.getProperty("default1_preview"))).click();
				Thread.sleep(5000);
				
				Actions default2=new Actions(driver);
				WebElement def_ele2=driver.findElement(By.xpath(properties.getProperty("default2_path")));
				action.moveToElement(def_ele2).build().perform();
				def_ele2.click();
				Thread.sleep(8000);
				driver.findElement(By.xpath(properties.getProperty("default2_preview"))).click();
				Thread.sleep(5000);
				
				
				Actions default3=new Actions(driver);
				WebElement def_ele3=driver.findElement(By.xpath(properties.getProperty("default3_path")));
				action.moveToElement(def_ele3).build().perform();
				def_ele3.click();
				Thread.sleep(8000);
				driver.findElement(By.xpath(properties.getProperty("default3_preview"))).click();
				Thread.sleep(5000);
				*/
				
				
				
				
				WebElement upld_cstm=driver.findElement(By.xpath(properties.getProperty("upload_custom")));
			upld_cstm.click();
	        Thread.sleep(3000);
	      Actions upld_tmp1= new Actions(driver);
	      WebElement we = driver.findElement(By.xpath(properties.getProperty("upld_create_temp")));
	      action.moveToElement(we).build().perform();
	      we.click();
	        Thread.sleep(5000);
	        
	        
	        

			DatabaseQueries data = new DatabaseQueries();
			String query5 = properties.getProperty("query.getEmailTemplates");//.replaceAll(":emailId",properties.getProperty("user.name"));
			List<String> campaignNames = data.listNames(query5, "name");
			String campaignNameFromProp = properties.getProperty("upld_tmp_name_senddata").toLowerCase();

			driver.findElement(By.xpath(properties.getProperty("upld_tmp_name"))).sendKeys(properties.getProperty("upld_tmp_name_senddata"));	
			Thread.sleep(5000);
			if(campaignNames.indexOf(campaignNameFromProp)>-1) {
			driver.findElement(By.xpath(properties.getProperty("upld_tmp_name"))).clear();
			driver.findElement(By.xpath(properties.getProperty("upld_tmp_name"))).sendKeys(properties.getProperty("upld_tmp_name_senddata")+"_"+System.currentTimeMillis());
			Thread.sleep(10000);
			}
	        
	        Thread.sleep(5000);
	        driver.findElement(By.xpath(properties.getProperty("upld_custmfile_tmp"))).click();
	        Thread.sleep(10000);
	        
	        Runtime.getRuntime().exec("C:\\Users\\lakshmig\\Desktop\\uploadcustom1.exe");
	        Thread.sleep(7000);
	        driver.findElement(By.xpath(properties.getProperty("upldcustm_save"))).click();
	        Thread.sleep(5000);
		}
	    	@Test(priority=28,enabled=true)
	    	public void email_temp1() throws InterruptedException, IOException, SQLException {
	    		driver.get("https://xamplify.io/home/dashboard/welcome");
	        WebElement upl_reg=driver.findElement(By.xpath(properties.getProperty("emailhover2")));	
			Thread.sleep(5000);  
			Actions action_reg = new Actions(driver);
			action_reg.moveToElement(upl_reg).perform();
			WebElement subele_reg= driver.findElement(By.xpath(properties.getProperty("create_email_temp2")));
			action_reg.moveToElement(subele_reg);
			action_reg.click();
			action_reg.perform();
				Thread.sleep(5000);
	         WebElement upl_reg2=driver.findElement(By.xpath(properties.getProperty("upld_custom2")));
		        upl_reg2.click();
		        Thread.sleep(5000);
		        Actions upld_tmp2= new Actions(driver);
			      WebElement we_up = driver.findElement(By.xpath(properties.getProperty("regular_create_temp")));
			      upld_tmp2.moveToElement(we_up).build().perform();
			      we_up.click();
			      Thread.sleep(5000);
			      
			      

					DatabaseQueries data = new DatabaseQueries();
					String query6 = properties.getProperty("query.getEmailTemplates");//.replaceAll(":emailId",properties.getProperty("user.name"));
					List<String> campaignNames = data.listNames(query6, "name");
					String campaignNameFromProp = properties.getProperty("regular_temp_senddata").toLowerCase();

					driver.findElement(By.xpath(properties.getProperty("regular_temp_name"))).sendKeys(properties.getProperty("regular_temp_senddata"));	
					Thread.sleep(5000);
					if(campaignNames.indexOf(campaignNameFromProp)>-1) {
					driver.findElement(By.xpath(properties.getProperty("regular_temp_name"))).clear();
					driver.findElement(By.xpath(properties.getProperty("regular_temp_name"))).sendKeys(properties.getProperty("regular_temp_senddata")+"_"+System.currentTimeMillis());
					Thread.sleep(10000);
					}
			        
			      
		        //driver.findElement(By.xpath(properties.getProperty("regular_temp_name"))).sendKeys(properties.getProperty("regular_temp_senddata"));
		        Thread.sleep(5000);
		        driver.findElement(By.xpath(properties.getProperty("regular_upld_file"))).click();
		        Thread.sleep(10000);
		       
		        Runtime.getRuntime().exec("C:\\Users\\lakshmig\\Desktop\\uploadcustom1.exe");
		        Thread.sleep(7000);
		        driver.findElement(By.xpath(properties.getProperty("regular_temp_save"))).click();
		        

		        Thread.sleep(5000);
	}
		
		@Test(priority=29,enabled=true)
		public void manage_template() throws InterruptedException {
			
			Thread.sleep(5000);
			WebElement element=driver.findElement(By.xpath(properties.getProperty("email-hover-2")));
			 Actions action = new Actions(driver);
			 action.moveToElement(element).perform();
			 WebElement mnge_ele= driver.findElement(By.xpath(properties.getProperty("mnge_template")));
				action.moveToElement(mnge_ele);
				action.click();
				action.perform();
					Thread.sleep(5000);
					driver.findElement(By.xpath(properties.getProperty("mnge_temp_preview"))).click();
					Thread.sleep(5000);
				
					driver.findElement(By.xpath(properties.getProperty("mnge_temp_preview_close"))).click();
					Thread.sleep(5000);
					
						driver.findElement(By.xpath(properties.getProperty("mnge_edit_temp"))).click();
						Thread.sleep(5000);
						
						
						
				driver.findElement(By.xpath(properties.getProperty("tmpname_updte"))).sendKeys("-1");
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("e_temp_update_button"))).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("e_gridview"))).click();

				WebElement ele_drpdwn_sort=driver.findElement(By.xpath(properties.getProperty("e_sort_drpdwn")));
				ele_drpdwn_sort.click();
				Select namea_z=new Select(ele_drpdwn_sort);
				Thread.sleep(8000);
				namea_z.selectByIndex(1);
				Thread.sleep(15000);
				namea_z.selectByIndex(2);
				Thread.sleep(15000);
				namea_z.selectByIndex(3);
				Thread.sleep(18000);
				namea_z.selectByIndex(4);
				Thread.sleep(20000);
				driver.findElement(By.xpath(properties.getProperty("e_search_temp"))).sendKeys("basic");
				Thread.sleep(15000);
				driver.findElement(By.xpath(properties.getProperty("e_clear"))).click();
				Thread.sleep(10000);	
				driver.findElement(By.xpath(properties.getProperty("e_search"))).click();
				Thread.sleep(10000);
			
			driver.findElement(By.xpath(properties.getProperty("e_m_basic"))).click();
			Thread.sleep(15000);
			
			driver.findElement(By.xpath(properties.getProperty("e_m_video"))).click();
			Thread.sleep(8000);
			
			driver.findElement(By.xpath(properties.getProperty("e_m_uploaded"))).click();
			Thread.sleep(8000);
			
			driver.findElement(By.xpath(properties.getProperty("e_m_partner"))).click();
			Thread.sleep(8000);
			
			driver.findElement(By.xpath(properties.getProperty("e_m_emailcobranding"))).click();
			Thread.sleep(8000);
			
			driver.findElement(By.xpath(properties.getProperty("e_m_videocobranding"))).click();
			
			Thread.sleep(15000);
			
			
		}





	}



