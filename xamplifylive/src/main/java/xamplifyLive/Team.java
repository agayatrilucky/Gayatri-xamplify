package xamplifyLive;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Team {
	 WebDriver driver = Instance.getInstance();
	 
		Properties properties = PropertiesFile.readPropertyFile("datafile.properties");

@Test(priority=45,enabled=true)

public void team() throws InterruptedException, IOException, SQLException
{
	
	//driver.get("https://release.xamplify.io/home/dashboard/welcome");
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	        .withTimeout(30, TimeUnit.SECONDS)
	        .pollingEvery(5, TimeUnit.SECONDS)
	        .ignoring(NoSuchElementException.class);
	 
	driver.findElement(By.xpath(properties.getProperty("vteam"))).click();
	Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("vdwnld_tmplte"))).click();
		driver.findElement(By.xpath(properties.getProperty("vadd_member"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("vadd_tm_first"))).sendKeys("lucky");
		driver.findElement(By.xpath(properties.getProperty("vadd_tm_last"))).sendKeys("a");
		
		
		Thread.sleep(5000);
	
		List<String> campaignNames = new ArrayList<String>();
		String queryt = properties.getProperty("query.getteammails");//.replaceAll(":emailId",properties.getProperty("user.name"));
		ResultSet resultSet = DatabaseConnection.getResultSet(queryt);
		while (resultSet.next()) {
			campaignNames.add(resultSet.getString("email_id").toLowerCase());
		}
		String campaignNameFromProp = properties.getProperty("vmail").toLowerCase();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("vtm_mail"))).sendKeys(properties.getProperty("vmail"));	
		Thread.sleep(5000);
		if(campaignNames.indexOf(campaignNameFromProp)>-1) {
			driver.findElement(By.xpath(properties.getProperty("vtm_mail"))).clear();
			driver.findElement(By.xpath(properties.getProperty("vtm_mail"))).sendKeys(properties.getProperty("vmail")+"_"+System.currentTimeMillis());	
		}
		Thread.sleep(3000);	
		
		
		
		
		
		
		
		
		
		
		//Thread.sleep(5000);
		/*
		DatabaseQueries data = new DatabaseQueries();
		String queryt = properties.getProperty("query.query.getteammails");
		//.replaceAll(":emailId",properties.getProperty("user.name"));
		List<String> campaignNames = data.listNames(queryt, "email_id");
		String campaignNameFromProp = properties.getProperty("vmail").toLowerCase();
		
		driver.findElement(By.xpath(properties.getProperty("vtm_mail"))).sendKeys(properties.getProperty("vmail"));	

		Thread.sleep(5000);
		if(campaignNames.indexOf(campaignNameFromProp)>-1) {
		driver.findElement(By.xpath(properties.getProperty("vtm_mail"))).clear();
		driver.findElement(By.xpath(properties.getProperty("vtm_mail"))).sendKeys("vmail"+"_"+System.currentTimeMillis());
		Thread.sleep(10000);
		}*/
			
	
		
		
	//	driver.findElement(By.xpath(properties.getProperty("vtm_mail"))).sendKeys("gabcd@gmail11.com");
		
		
		
		
		
		driver.findElement(By.xpath(properties.getProperty("vtm_mail_add"))).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("vtm_checkall"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("vtm_save"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/div/app-table-editable/div/div[4]/div[1]/section/div[1]")).click();
		
		
		
		   Runtime.getRuntime().exec("C:\\Users\\lakshmig\\Desktop\\team-csv.exe");
	        Thread.sleep(7000);
	        driver.findElement(By.xpath(properties.getProperty("vtm_upldcustm_save"))).click();
	        Thread.sleep(5000);
	
		
		
		
		driver.findElement(By.xpath(properties.getProperty("vtm_delete"))).click();
	
				Select tdropdown = new Select(driver.findElement(By.xpath("//*[@id=\"org-id\"]")));
				Thread.sleep(3000);
				tdropdown.selectByVisibleText("dtejashwini@stratapps.com");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"delete-team-member-modal\"]/div/div/div[3]/button[2]")).click();
				
		
		
		
}
}
