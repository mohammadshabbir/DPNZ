package dpnztestcases;

import java.util.UUID;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import dpnzpages.DPNZBaseClass;
import dpnzpages.DPNZhomepage;
import dpnzpages.DPNZloginpage;
import dpnzpages.DPNZsignuppage;

public class DPNZsignupTest  extends DPNZBaseClass{
 
	
	
	@Test
	public void validsignupTest() throws InterruptedException {
		DPNZhomepage hp=new DPNZhomepage(driver);
		hp.clickonloginlink();
		DPNZloginpage lp=new DPNZloginpage(driver);
		lp.clickCreateanaccount();
		DPNZsignuppage sp=new DPNZsignuppage(driver);
		String uniqueID = UUID.randomUUID().toString();
		String emailid=uniqueID+"@gmail.com";
		sp.enterregisteremailid(emailid);
		sp.enterregisterpassword("123456");
		sp.checksignupformacceptterms();
		sp.clickregisterButton();
		Thread.sleep(10000);
		driver.findElement(By.id("tg-adminnav")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Logout")).click();
		
	}
}
