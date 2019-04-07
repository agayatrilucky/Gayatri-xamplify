package xamplifyLive;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class ManagePartners {


	 Properties prop = PropertiesFile.readPropertyFile("datafile.properties");
	 WebDriver driver = Instance.getInstance();


@Test(priority=8,enabled=true)
public void managePartners() throws InterruptedException, SQLException, IOException {	
	
	driver.get("https://xamplify.io/home/dashboard/welcome");
    Actions actions = new Actions(driver);
    
	WebElement mpartners = driver.findElement(By.xpath(prop.getProperty("hover_mpartner")));
    actions.moveToElement(mpartners).build().perform();
 	Thread.sleep(3000);
 	driver.findElement(By.xpath(prop.getProperty("mng_partners"))).click();
 	Thread.sleep(5000);
 	
 	driver.findElement(By.xpath(prop.getProperty("mp_all_detail"))).click();
 	Thread.sleep(5000);
 	

 	driver.findElement(By.xpath(prop.getProperty("mp_more1"))).click();
 	Thread.sleep(5000);
 	

 	driver.findElement(By.xpath(prop.getProperty("mp_select1"))).click();
 	Thread.sleep(5000);
 	
 	
 	driver.findElement(By.xpath(prop.getProperty("mp_select12"))).click();
 	Thread.sleep(5000);
 	

 	driver.findElement(By.xpath(prop.getProperty("mp_sel_settings_click"))).click();
 	Thread.sleep(5000);
 	

 	driver.findElement(By.xpath(prop.getProperty("mp_sel_sett_saveas"))).click();
 	Thread.sleep(5000);
 	
 	
 	DatabaseQueries data = new DatabaseQueries();
	String query44 = prop.getProperty("query.getPartnerslistsname");//.replaceAll(":emailId",properties.getProperty("user.name"));
	List<String> campaignNames = data.listNames(query44, "user_list_name");
	String campaignNameFromProp = prop.getProperty("mp_data").toLowerCase();

	driver.findElement(By.xpath(prop.getProperty("mp_saveas_plist"))).sendKeys(prop.getProperty("mp_data"));
	
	Thread.sleep(5000);
 	driver.findElement(By.xpath(prop.getProperty("mp_saveas_plist_save"))).click();
	Thread.sleep(5000);

	if(campaignNames.indexOf(campaignNameFromProp)>-1) {
	driver.findElement(By.xpath(prop.getProperty("mp_saveas_plist"))).clear();
	driver.findElement(By.xpath(prop.getProperty("mp_saveas_plist"))).sendKeys(System.currentTimeMillis()+"_");
	driver.findElement(By.xpath(prop.getProperty("mp_saveas_plist"))).sendKeys(prop.getProperty("mp_data"));
	
	
	}

 	
 	
 	
 	
 	

 	driver.findElement(By.xpath(prop.getProperty("mp_saveas_plist_save"))).click();
 	Thread.sleep(5000);



 	driver.get("https://xamplify.io/home/partners/manage");
 	Thread.sleep(8000);
 	
 	

 	driver.findElement(By.xpath(prop.getProperty("mp_all_dv2"))).click();
 	Thread.sleep(5000);
 	

 	driver.findElement(By.xpath(prop.getProperty("mp_sttngs_clck"))).click();
 	Thread.sleep(5000);
 	


 	driver.findElement(By.xpath(prop.getProperty("mp_export_excel"))).click();
 	Thread.sleep(5000);
 	
 	
 	

 	driver.get("https://xamplify.io/home/partners/manage");
 	Thread.sleep(8000);
 	


 	driver.findElement(By.xpath(prop.getProperty("mp_all_dv3"))).click();
 	Thread.sleep(5000);
 	
 	
 	
 	
 	
 	
	driver.findElement(By.xpath(prop.getProperty("mp_filter1"))).click();
 	Thread.sleep(8000);
 	

 	WebElement mp_f_drpdwn11=driver.findElement(By.xpath(prop.getProperty("mp_f_sortby1")));
 	
 	Select sort_f1=new Select(mp_f_drpdwn11);
 	sort_f1.selectByVisibleText("First Name");
	Thread.sleep(8000);
WebElement mp_f_drpdwn12=driver.findElement(By.xpath(prop.getProperty("mp_f_sort_cndtn1")));
 	
 	Select sort_f11=new Select(mp_f_drpdwn12);
 	sort_f11.selectByVisibleText("=");
	Thread.sleep(5000);
 	
	
 	driver.findElement(By.xpath(prop.getProperty("mp_f_data1"))).sendKeys("lucky");
 	Thread.sleep(5000);
 	
 	driver.findElement(By.xpath(prop.getProperty("mp_f_submit1"))).click();
 	Thread.sleep(8000);
 	
	
 	driver.findElement(By.xpath(prop.getProperty("mp_f_close"))).click();
 	Thread.sleep(5000);
 	

 	WebElement mp_all_drpdwn=driver.findElement(By.xpath(prop.getProperty("mp_all_sort")));
 	
 	Select sort_all=new Select(mp_all_drpdwn);
 	sort_all.selectByIndex(1);
	Thread.sleep(5000);
	sort_all.selectByIndex(2);
	Thread.sleep(5000);
	sort_all.selectByIndex(3);
	Thread.sleep(5000);
	sort_all.selectByIndex(4);
	Thread.sleep(5000);
	sort_all.selectByIndex(5);
	Thread.sleep(5000);
	sort_all.selectByIndex(6);
	Thread.sleep(5000);
	sort_all.selectByIndex(7);
	Thread.sleep(5000);
	sort_all.selectByIndex(8);
	Thread.sleep(5000);
	sort_all.selectByIndex(9);
	Thread.sleep(5000);
	sort_all.selectByIndex(10);
	Thread.sleep(5000);
	sort_all.selectByIndex(11);
	Thread.sleep(5000);
	sort_all.selectByIndex(12);
	Thread.sleep(5000);
	sort_all.selectByIndex(13);
	Thread.sleep(5000);
	sort_all.selectByIndex(14);
	Thread.sleep(5000);
	sort_all.selectByIndex(15);
	Thread.sleep(5000);
	sort_all.selectByIndex(16);
	Thread.sleep(5000);
	

 	driver.findElement(By.xpath(prop.getProperty("mp_all_search"))).sendKeys("gayatri");
 	Thread.sleep(5000);
 	
	driver.findElement(By.xpath(prop.getProperty("mp_all_search_cli"))).click();
 	Thread.sleep(8000);
 	driver.get("https://xamplify.io/home/partners/manage");
 	Thread.sleep(8000);
 	
 	driver.findElement(By.xpath(prop.getProperty("mp_active"))).click();
 	Thread.sleep(8000);
 	
 	
 	driver.findElement(By.xpath(prop.getProperty("mp_a_more1"))).click();
 	Thread.sleep(5000);
 	

 	driver.findElement(By.xpath(prop.getProperty("mp_asettings_click"))).click();
 	Thread.sleep(5000);
 	
 

 	driver.findElement(By.xpath(prop.getProperty("mp_aexport"))).click();
 	Thread.sleep(5000);
		driver.get("https://xamplify.io/home/partners/manage");
 	Thread.sleep(8000);
 	


 	driver.findElement(By.xpath(prop.getProperty("mp_a_dv2"))).click();
 	Thread.sleep(5000);
 	
 	
 	
 	

 	driver.findElement(By.xpath(prop.getProperty("mp_afilter"))).click();
 	Thread.sleep(8000);
 	WebElement mp_f_adrpdwn=driver.findElement(By.xpath(prop.getProperty("mp_f_asortby")));
 	
 	Select sort_fa=new Select(mp_f_adrpdwn);
 	sort_fa.selectByVisibleText("First Name");
	Thread.sleep(8000);
	
WebElement mp_f_adrpdwn2=driver.findElement(By.xpath(prop.getProperty("mp_f_asort_cndtn")));
 	
 	Select sort_fa2=new Select(mp_f_adrpdwn2);
 	sort_fa2.selectByVisibleText("=");
	Thread.sleep(5000);
 	
	
	

 	driver.findElement(By.xpath(prop.getProperty("mp_f_adata"))).sendKeys("lucky");
 	Thread.sleep(5000);
 	
 	

	
 	driver.findElement(By.xpath(prop.getProperty("mp_f_asubmit"))).click();
 	Thread.sleep(5000);
 	
 	

	 	driver.findElement(By.xpath(prop.getProperty("mp_f_aclose"))).click();
	 	Thread.sleep(5000);
	 	
	 			

	 	driver.findElement(By.xpath(prop.getProperty("mp_ac_f2"))).click();
	 	Thread.sleep(8000);
	 	
	 	
	 	
	 	
	 	WebElement mp_f_ac_drpdwn11=driver.findElement(By.xpath(prop.getProperty("mp_f_acsortby2")));
	 	
	 	Select sort_fac2=new Select(mp_f_ac_drpdwn11);
	 	sort_fac2.selectByVisibleText("Last Name");
		Thread.sleep(5000);
	
	WebElement mp_f_ac_drpdwn12=driver.findElement(By.xpath(prop.getProperty("mp_f_ac_srt_cndtn2")));
	 	
	 	Select sort_f_ac21=new Select(mp_f_ac_drpdwn12);
	 	sort_f_ac21.selectByVisibleText("Contains");
		Thread.sleep(5000);
	 	
		
		

	 	driver.findElement(By.xpath(prop.getProperty("mp_f_ac_data2"))).sendKeys("gayatri");
	 	Thread.sleep(5000);
	 
		
	 	driver.findElement(By.xpath(prop.getProperty("mp_f_ac_submit2"))).click();
	 	Thread.sleep(5000);
	 	
	 	
 	
 	
 	driver.get("https://xamplify.io/home/partners/manage");
 	
 	Thread.sleep(8000);

 	driver.findElement(By.xpath(prop.getProperty("mp_a_dv3"))).click();
 	Thread.sleep(5000);
 	
 
 	WebElement mp_act_drpdwn=driver.findElement(By.xpath(prop.getProperty("mp_f_asort")));
 	
 	Select sort_act=new Select(mp_act_drpdwn);
 	sort_act.selectByIndex(1);
	Thread.sleep(5000);
	sort_act.selectByIndex(2);
	Thread.sleep(5000);
	sort_act.selectByIndex(3);
	Thread.sleep(5000);
	sort_act.selectByIndex(4);
	Thread.sleep(5000);
	sort_act.selectByIndex(5);
	Thread.sleep(5000);
	sort_act.selectByIndex(6);
	Thread.sleep(5000);
	sort_act.selectByIndex(7);
	Thread.sleep(5000);
	sort_act.selectByIndex(8);
	Thread.sleep(5000);
	sort_act.selectByIndex(9);
	Thread.sleep(5000);
	sort_act.selectByIndex(10);
	Thread.sleep(5000);
	sort_act.selectByIndex(11);
	Thread.sleep(5000);
	sort_act.selectByIndex(12);
	Thread.sleep(5000);
	sort_act.selectByIndex(13);
	Thread.sleep(5000);
	sort_act.selectByIndex(14);
	Thread.sleep(5000);
	sort_act.selectByIndex(15);
	Thread.sleep(5000);
	sort_act.selectByIndex(16);
	Thread.sleep(5000);
	
 	driver.findElement(By.xpath(prop.getProperty("mp_act_search"))).sendKeys("gayatri");
 	Thread.sleep(5000);
 	
	driver.findElement(By.xpath(prop.getProperty("mp_act_search_cli"))).click();
 	Thread.sleep(8000);
 	driver.get("https://xamplify.io/home/partners/manage");
 	Thread.sleep(8000);
 	
 	
 	
	
 	driver.findElement(By.xpath(prop.getProperty("mp_unregisered"))).click();
 	Thread.sleep(5000);
 	
 			
 		 	driver.findElement(By.xpath(prop.getProperty("mp_unreg_more"))).click();
 		 	Thread.sleep(5000);

 		 	driver.findElement(By.xpath(prop.getProperty("mp_unreg_resendreg"))).click();
 		 	Thread.sleep(5000);
 		 	
 		 	
 		 	driver.findElement(By.xpath(prop.getProperty("mp_unregsettings_click"))).click();
 		 	Thread.sleep(5000);
 		 	
 		 

 		 	driver.findElement(By.xpath(prop.getProperty("mp_unregexport"))).click();
 		 	Thread.sleep(5000);
 			
 		 	

 		 	

 		 	driver.get("https://xamplify.io/home/partners/manage");
 		 	Thread.sleep(8000);
 		 	


 		 	driver.findElement(By.xpath(prop.getProperty("mp_unreg_dv2"))).click();
 		 	Thread.sleep(5000);
 		 	
 		 	
 		 	
 		 	

 		 	driver.findElement(By.xpath(prop.getProperty("mp_unreg_filter"))).click();
 		 	Thread.sleep(8000);
 		 	WebElement mp_f_unreg_drpdwn=driver.findElement(By.xpath(prop.getProperty("mp_f_unregsortby")));
 		 	
 		 	Select sort_funreg=new Select(mp_f_unreg_drpdwn);
 		 	sort_funreg.selectByVisibleText("Last Name");
 			Thread.sleep(8000);
 			
 		WebElement mp_f_unreg_drpdwn2=driver.findElement(By.xpath(prop.getProperty("mp_f_unreg_srt_cndtn")));
 		 	
 		 	Select sort_f_unreg2=new Select(mp_f_unreg_drpdwn2);
 		 	sort_f_unreg2.selectByVisibleText("=");
 			Thread.sleep(5000);
 		 	
 			
 			

 		 	driver.findElement(By.xpath(prop.getProperty("mp_f_unreg_data"))).sendKeys("gayatri");
 		 	Thread.sleep(5000);
 		 	
 		 	

 			
 		 	driver.findElement(By.xpath(prop.getProperty("mp_f_unreg_submit"))).click();
 		 	Thread.sleep(5000);
 		 	

 			
 		 	driver.findElement(By.xpath(prop.getProperty("mp_unreg_fclose"))).click();
 		 	Thread.sleep(5000);
 		 	
 		 			

 		 	driver.findElement(By.xpath(prop.getProperty("mp_unreg_f2"))).click();
 		 	Thread.sleep(8000);
 		 	
 		 	
 		 	
 		 	
 		 	WebElement mp_f_unreg_drpdwn11=driver.findElement(By.xpath(prop.getProperty("mp_f_unregsortby2")));
 		 	
 		 	Select sort_funreg2=new Select(mp_f_unreg_drpdwn11);
 		 	sort_funreg2.selectByVisibleText("Last Name");
 			Thread.sleep(5000);
 			
 		WebElement mp_f_unreg_drpdwn12=driver.findElement(By.xpath(prop.getProperty("mp_f_unreg_srt_cndtn2")));
 		 	
 		 	Select sort_f_unreg21=new Select(mp_f_unreg_drpdwn12);
 		 	sort_f_unreg21.selectByVisibleText("Contains");
 			Thread.sleep(5000);
 		 	
 			
 			

 		 	driver.findElement(By.xpath(prop.getProperty("mp_f_unreg_data2"))).sendKeys("gayatri");
 		 	Thread.sleep(5000);
 		 	
 		 	

 			
 		 	driver.findElement(By.xpath(prop.getProperty("mp_f_unreg_submit2"))).click();
 		 	Thread.sleep(5000);
 		 	
 		 	
 		 	
 		 	
 		 	
 		 	driver.get("https://xamplify.io/home/partners/manage");
 		 	
 		 	Thread.sleep(8000);

 		 	driver.findElement(By.xpath(prop.getProperty("mp_unreg_dv3"))).click();
 		 	Thread.sleep(5000);
 		 	
 		 
 		 	WebElement mp_unreg_drpdwn=driver.findElement(By.xpath(prop.getProperty("mp_f_unregsort")));
 		 	
 		 	Select sort_unreg=new Select(mp_unreg_drpdwn);
 		 	sort_unreg.selectByIndex(1);
 			Thread.sleep(5000);
 			sort_unreg.selectByIndex(2);
 			Thread.sleep(5000);
 			sort_unreg.selectByIndex(3);
 			Thread.sleep(5000);
 			sort_unreg.selectByIndex(4);
 			Thread.sleep(5000);
 			sort_unreg.selectByIndex(5);
 			Thread.sleep(5000);
 			sort_unreg.selectByIndex(6);
 			Thread.sleep(5000);
 			sort_unreg.selectByIndex(7);
 			Thread.sleep(5000);
 			sort_unreg.selectByIndex(8);
 			Thread.sleep(5000);
 			sort_unreg.selectByIndex(9);
 			Thread.sleep(5000);
 			sort_unreg.selectByIndex(10);
 			Thread.sleep(5000);
 			sort_unreg.selectByIndex(11);
 			Thread.sleep(5000);
 			sort_unreg.selectByIndex(12);
 			Thread.sleep(5000);
 			sort_unreg.selectByIndex(13);
 			Thread.sleep(5000);
 			sort_unreg.selectByIndex(14);
 			Thread.sleep(5000);
 			sort_unreg.selectByIndex(15);
 			Thread.sleep(5000);
 			sort_unreg.selectByIndex(16);
 			Thread.sleep(5000);
 			
 		 	driver.findElement(By.xpath(prop.getProperty("mp_unreg_search"))).sendKeys("gayatri");
 		 	Thread.sleep(5000);
 		 	
 			driver.findElement(By.xpath(prop.getProperty("mp_unreg_search_cli"))).click();
 		 	Thread.sleep(5000);
 	
 	
 	driver.get("https://xamplify.io/home/partners/manage");
 	
 	
 	driver.findElement(By.xpath(prop.getProperty("mp_undeliverable"))).click();
 	Thread.sleep(5000);
 	
 	driver.get("https://xamplify.io/home/partners/manage");
 	Thread.sleep(5000);

 	driver.findElement(By.xpath(prop.getProperty("mp_unsubscribe"))).click();
 	Thread.sleep(5000);
 	
 	driver.get("https://xamplify.io/home/partners/manage");
 	Thread.sleep(5000);

 	driver.findElement(By.xpath(prop.getProperty("mp_edit"))).click();
 	Thread.sleep(5000);
 	

 	driver.findElement(By.xpath(prop.getProperty("mp_edit_slct_chckbx1"))).click();
 	Thread.sleep(5000);
 	
 	

 	driver.findElement(By.xpath(prop.getProperty("mp_edit_slct_chckbx2"))).click();
 	Thread.sleep(5000);
 	

 	driver.findElement(By.xpath(prop.getProperty("mp_edt_actns"))).click();
 	Thread.sleep(5000);
 	

 	driver.findElement(By.xpath(prop.getProperty("mp_edt_saveas"))).click();
 	Thread.sleep(5000);
 	

 	driver.findElement(By.xpath(prop.getProperty("mp_edt_svs_save"))).click();
 	Thread.sleep(5000);
 	
 	driver.findElement(By.xpath(prop.getProperty("mp_edit2"))).click();
 	Thread.sleep(5000);
 	

 	driver.findElement(By.xpath(prop.getProperty("mp_edt_actns2"))).click();
 	Thread.sleep(5000);
 	
 	driver.findElement(By.xpath(prop.getProperty("mp_edit_exprt"))).click();
 	Thread.sleep(5000);
 	
 	driver.findElement(By.xpath(prop.getProperty("mp_edit_slctchckbx3"))).click();
 	Thread.sleep(5000);
 	
 	
 	driver.findElement(By.xpath(prop.getProperty("mp_edit_actns3"))).click();
 	Thread.sleep(5000);
 	

 	driver.findElement(By.xpath(prop.getProperty("mp_edit_del"))).click();
 	Thread.sleep(5000);
 	

 	driver.findElement(By.xpath(prop.getProperty("mp_edit_del_yes"))).click();
 	Thread.sleep(8000);
 	
 	driver.get("https://xamplify.io/home/partners/manage");
 	Thread.sleep(8000);
 	

 	
 	
 	
 	driver.findElement(By.xpath(prop.getProperty("mp_edit_editt"))).click();
 	Thread.sleep(5000);


 	driver.findElement(By.xpath(prop.getProperty("mp_one_atatime"))).click();
 	Thread.sleep(5000);

 	
 	driver.findElement(By.xpath(prop.getProperty("mp_one_at_mail"))).sendKeys("gayatrialla11@gmail.com");
 	Thread.sleep(5000);
 	


 	driver.findElement(By.xpath(prop.getProperty("mp_one_at_cmpny"))).sendKeys("sag");
 	Thread.sleep(5000);

 	driver.findElement(By.xpath(prop.getProperty("mp_one_at_save"))).click();
 	Thread.sleep(5000);


 	driver.findElement(By.xpath(prop.getProperty("mp_one_at_delete"))).click();
 	Thread.sleep(5000);

 	driver.findElement(By.xpath(prop.getProperty("mp_one_at_delete_s"))).click();
 	Thread.sleep(5000);
 	


 	driver.findElement(By.xpath(prop.getProperty("mp_cpyfrmclp"))).click();
 	Thread.sleep(5000);

	
	 
	 	WebElement mp_cpyfrmclp=driver.findElement(By.xpath(prop.getProperty("mp_cpyfrmclp_drpdwn")));
	 	
	 	Select sort_cpyfrmclp=new Select(mp_cpyfrmclp);
	 	sort_cpyfrmclp.selectByVisibleText("Comma Separated");
		Thread.sleep(5000);

	 	driver.findElement(By.xpath(prop.getProperty("mp_cpy_txt"))).sendKeys("f,l,c,jt,gayatrimail@email.com,v,r,pt,c,add,ci,s,z,co,ph");
	 	Thread.sleep(5000);
		
		
 	
 	
 	
 	driver.findElement(By.xpath(prop.getProperty("mp_cpy_shwprvw"))).click();
 	Thread.sleep(5000);

 	
 	
 	driver.findElement(By.xpath(prop.getProperty("mp_cpy_cancel"))).click();
 	Thread.sleep(5000);
 	
 	

 	/*driver.findElement(By.xpath(prop.getProperty("mp_upld"))).click();
 	Thread.sleep(10000);
 	
 	Runtime.getRuntime().exec("C:\\Users\\lakshmig\\Desktop\\managepartners_upld.exe");
    Thread.sleep(7000);
 	
 	
    

 	driver.findElement(By.xpath(prop.getProperty("mp_actns_clck"))).click();
 	Thread.sleep(5000);
 	
 	

 	driver.findElement(By.xpath(prop.getProperty("mp_actns_sve"))).click();
 	Thread.sleep(5000);
    

 	driver.findElement(By.xpath(prop.getProperty("mp_actns_sved"))).click();
 	Thread.sleep(5000);
    
 	*/
 	
 	

 	driver.get("https://xamplify.io/home/partners/manage");
 	Thread.sleep(8000);
 	
 
 	
 	driver.findElement(By.xpath(prop.getProperty("mp_edit_edit4"))).click();
 	Thread.sleep(5000);

 	
 	driver.findElement(By.xpath(prop.getProperty("mp_edit_edit11"))).click();
 	Thread.sleep(5000);
 	
 	
 	
	driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Gayatri");
	
	driver.findElement(By.xpath(prop.getProperty("mp_edit_edit_cmpny"))).sendKeys("StratApps Solutions");
	
	
	driver.findElement(By.xpath(prop.getProperty("mp_edit_edit_update"))).click();
 	Thread.sleep(5000);
 	
	
 	driver.get("https://xamplify.io/home/partners/manage");
 	Thread.sleep(5000);

 	driver.findElement(By.xpath(prop.getProperty("mp_copy"))).click();
 	Thread.sleep(5000);
 	driver.findElement(By.xpath(prop.getProperty("mp_cpy_save"))).click();
 	Thread.sleep(5000);
 	
 	

 	driver.findElement(By.xpath(prop.getProperty("mp_dwnld"))).click();
 	Thread.sleep(5000);
 	driver.findElement(By.xpath(prop.getProperty("mp_delete"))).click();
 	Thread.sleep(5000);
 	
 	driver.findElement(By.xpath(prop.getProperty("mp_delete_s"))).click();
 	Thread.sleep(5000);
 	driver.get("https://xamplify.io/home/partners/manage");
 	Thread.sleep(5000);



 	driver.findElement(By.xpath(prop.getProperty("mp_grid"))).click();
 	Thread.sleep(5000);
 	
 	
 	driver.findElement(By.xpath(prop.getProperty("mp_list"))).click();
 	Thread.sleep(8000);
 	
 	
 	WebElement mp_drpdwn=driver.findElement(By.xpath(prop.getProperty("mp_sortby")));
 	
 	Select sort=new Select(mp_drpdwn);
 	sort.selectByIndex(0);
	Thread.sleep(5000);

 	sort.selectByIndex(1);
	Thread.sleep(5000);

	sort.selectByIndex(2);
	Thread.sleep(5000);

	sort.selectByIndex(3);
	Thread.sleep(5000);

	sort.selectByIndex(4);
	Thread.sleep(5000);

 	driver.findElement(By.xpath(prop.getProperty("mp_search"))).sendKeys("tga");
 	Thread.sleep(5000);
 	
 	driver.findElement(By.xpath(prop.getProperty("mp_search_clck"))).click();
 	Thread.sleep(5000);
 	
 	
 	driver.findElement(By.xpath(prop.getProperty("mp_search_clr"))).click();
 	Thread.sleep(5000);
 	
 	
 	driver.findElement(By.xpath(prop.getProperty("mp_search2"))).sendKeys("gayatri");
 	Thread.sleep(5000);
 	
 	driver.findElement(By.xpath(prop.getProperty("mp_search_clck2"))).click();
 	Thread.sleep(5000);
 	
 	driver.get("https://xamplify.io/home/partners/manage");

 	Thread.sleep(8000);
 	
 								
}
}

