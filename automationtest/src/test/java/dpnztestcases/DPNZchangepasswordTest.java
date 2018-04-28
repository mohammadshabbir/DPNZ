package dpnztestcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import dpnzpages.DPNZBaseClass;
import dpnzpages.DPNZhomepage;
import dpnzpages.DPNZloginpage;
import dpnzpages.DPNZprofilesettingspage;
import dpnzpages.DPNZuserhomepage;
import utilities.ReadPropertyFile;

public class DPNZchangepasswordTest extends DPNZBaseClass {
	
	
	@Test
	public void changepasswordTest() throws Exception {
		
		
		
		ReadPropertyFile data=new ReadPropertyFile();
		DPNZhomepage hp=new DPNZhomepage(driver);
		DPNZloginpage lp=new DPNZloginpage(driver);
		DPNZuserhomepage up=new DPNZuserhomepage(driver);
		DPNZprofilesettingspage psp=new DPNZprofilesettingspage(driver);
		
		
		hp.clickonloginlink();
		lp.enterloginemailid(data.getUserName());
		lp.enterpassword(data.getPassword());
		lp.clickloginsubmitbutton();
		Thread.sleep(5000);
		String a=driver.findElement(By.id("tg-adminnav")).getText();
		System.out.println(a);
		Assert.assertEquals(a, "Hi! mohammad shabbir");
		up.clickuserdropdown();
		Thread.sleep(2000);
		up.clickprofilesettings();
		psp.clickonchangepassword();
		psp.entercurrentpassword(data.getPassword());
		psp.enternewpassword("123456");
		psp.enterretypenewpassword("123456");
		psp.clickonChangeNow();
		System.out.println("change pasword success");
		Thread.sleep(2000);
		driver.findElement(By.id("tg-dash-logout")).click();
		
		

		hp.clickonloginlink();
		lp.enterloginemailid(data.getUserName());
		lp.enterpassword("123456");
		lp.clickloginsubmitbutton();
		Thread.sleep(5000);
		String e=driver.findElement(By.id("tg-adminnav")).getText();
		System.out.println("change pasword login success");
		System.out.println(e);
		Assert.assertEquals(e, "Hi! mohammad shabbir");
		up.clickuserdropdown();
		Thread.sleep(2000);
		up.clickprofilesettings();
		psp.clickonchangepassword();
		psp.entercurrentpassword("123456");
		psp.enternewpassword(data.getPassword());
		psp.enterretypenewpassword(data.getPassword());
		psp.clickonChangeNow();
		Thread.sleep(2000);
		driver.findElement(By.id("tg-dash-logout")).click();

	hp.clickonloginlink();
	lp.enterloginemailid(data.getUserName());
	lp.enterpassword(data.getPassword());
	lp.clickloginsubmitbutton();
	Thread.sleep(5000);
	String m=driver.findElement(By.id("tg-adminnav")).getText();
	System.out.println(m);
	Assert.assertEquals(m, "Hi! mohammad shabbir");
	driver.findElement(By.id("tg-adminnav")).click();
	Thread.sleep(5000);
	driver.findElement(By.partialLinkText("Logout")).click();

}
}
