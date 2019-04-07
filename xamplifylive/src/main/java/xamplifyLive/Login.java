package xamplifyLive;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	
	  WebDriver driver = Instance.getInstance();

		Properties prop = PropertiesFile.readPropertyFile("datafile.properties");
		
	
	@Test(priority=1)
	public void start() throws InterruptedException {
		
	driver.get(prop.getProperty("baseUrl"));
	
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	}
	
		@Test(enabled=false,priority=2)
		public void registration_vendor() throws InterruptedException {
			
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-intro[1]/div[2]/header[1]/nav[1]/div[1]/div[2]/ul[2]/li[2]/a[1]")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("gayatri");

		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("lucky");
		
		driver.findElement(By.xpath(prop.getProperty("reg_email"))).sendKeys(prop.getProperty("reg_emailsendata"));
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Xamplify@11");
		
		driver.findElement(By.xpath("//input[@id='comfirmPassword']")).sendKeys("Xamplify@11");
		
		
		driver.findElement(By.xpath("//label[@class='check']//input[@type='checkbox']")).click();
		System.out.println("checkbox");
		driver.findElement(By.id("register-submit-btn")).click();
	System.out.println("submit");
	
	
	/*DatabaseQueries data = new DatabaseQueries();
	String query = properties.getProperty("query.getCampaignNamesByOrganizationId");//.replaceAll(":emailId",properties.getProperty("user.name"));
	List<String> campaignNames = data.listNames(query1, "email_id");
	String campaignNameFromProp = properties.getProperty("cffielddata").toLowerCase();
	Thread.sleep(8000);

	driver.findElement(By.xpath(properties.getProperty("cfcfield"))).click();
	driver.findElement(By.xpath(properties.getProperty("cfcfield"))).sendKeys(properties.getProperty("cffielddata"));	
	driver.findElement(By.xpath("//button[contains(text(),'SHOW PREVIEW')]")).click();

	Thread.sleep(8000);
	if(campaignNames.indexOf(campaignNameFromProp)>-1) {
	driver.findElement(By.xpath(properties.getProperty("cfcfield"))).clear();
	driver.findElement(By.xpath(properties.getProperty("cfcfield"))).sendKeys(System.currentTimeMillis()+"_");
	driver.findElement(By.xpath(properties.getProperty("cfcfield"))).sendKeys(properties.getProperty("cffielddata"));

*/


	/*}
	
	
		Thread.sleep(5000);		
	//	driver.close();
*/		}
		
		
		
		@Test(priority=2,enabled=true)
	public void login() throws InterruptedException, SQLException {

		driver.findElement(By.xpath(prop.getProperty("loginclick"))).click();
		Thread.sleep(5000);
		driver.findElement(By.id(prop.getProperty("email"))).sendKeys(prop.getProperty("user.name"));
		driver.findElement(By.id(prop.getProperty("password"))).sendKeys(prop.getProperty("user.password"));
		driver.findElement(By.id(prop.getProperty("signin"))).click();
		Thread.sleep(15000);
		/*driver.findElement(By.xpath(properties.getProperty("useracclick"))).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(properties.getProperty("cmpny_prfile"))).click();
		Thread.sleep(5000);
		
		WebElement cmpnyname=driver.findElement(By.xpath(properties.getProperty("Company_name")));
				cmpnyname.clear();
				cmpnyname.sendKeys("stratapps1");
		Thread.sleep(5000);
		
		WebElement cmpnyemail=driver.findElement(By.xpath(properties.getProperty("cmpny_email")));
		cmpnyemail.clear();
		cmpnyemail.sendKeys("abc11@stratapps.com");
		Thread.sleep(5000);
		
		WebElement cmpnyphone=driver.findElement(By.xpath(properties.getProperty("phone")));
		cmpnyphone.clear();
		cmpnyphone.sendKeys("9414433328");
		Thread.sleep(5000);
		
		WebElement url=driver.findElement(By.xpath(properties.getProperty("website_url")));
		url.clear();
		url.sendKeys("www.stratapps.com");
		Thread.sleep(5000);
		
		WebElement about=driver.findElement(By.xpath(properties.getProperty("aboutus")));
		about.clear();
		about.sendKeys("Stratapps Solutions Private Limited is a Private incorporated on 27 November 2009. It is classified as Non-govt company and is registered at Registrar of Companies, Mumbai. Its authorized share capital is Rs. 500,000 and its paid up capital is Rs. 100,000. It is inolved in Business activities n.e.c.\r\n" + 
				"\r\n" + 
				"Stratapps Solutions Private Limited's Annual General Meeting (AGM) was last held on 12 August 2017 and as per records from Ministry of Corporate Affairs (MCA), its balance sheet was last filed on 31 March 2017.\r\n" + 
				"\r\n" + 
				"Directors of Stratapps Solutions Private Limited are Sudhir Balakrishnan Nambiar, Venugopal Padmanabhan, Pokancheri Vazhakali Jayaprakash and Aravindu Sandela.");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("update1"))).click();
		Thread.sleep(5000);
		
		
		*/
		
		
	}
			
		
			
		
		
		
						
			}
			
		
