package dpnztestcases;



import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import dpnzpages.DPNZBaseClass;
import dpnzpages.DPNZhomepage ;
import dpnzpages.DPNZloginpage;
import utilities.ReadPropertyFile;

public class DPNZloginTest extends DPNZBaseClass {
	
@Test
public void validloginTest() throws Exception {
		ReadPropertyFile data=new ReadPropertyFile();
		DPNZhomepage hp=new DPNZhomepage(driver);
		hp.clickonloginlink();
		
		DPNZloginpage lp=new DPNZloginpage(driver);
		lp.enterloginemailid(data.getUserName());
		lp.enterpassword(data.getPassword());
		lp.clickloginsubmitbutton();
		Thread.sleep(5000);
		String a=driver.findElement(By.id("tg-adminnav")).getText();
		System.out.println(a);
		Assert.assertEquals(a, "Hi! mohammad shabbir");
		driver.findElement(By.id("tg-adminnav")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Logout")).click();
		
		
	}

@Test
public void invalidpswdloginTest() throws Exception {
	ReadPropertyFile data=new ReadPropertyFile();
	DPNZhomepage hp=new DPNZhomepage(driver);
	hp.clickonloginlink();
	
	DPNZloginpage lp=new DPNZloginpage(driver);
	lp.enterloginemailid(data.getUserName());
	lp.enterpassword("shabbir");
	Thread.sleep(5000);
	lp.clickloginsubmitbutton();	
	Thread.sleep(5000);
	String a=driver.findElement(By.xpath(".//*[@id='dp-login-form']/fieldset/div[2]/div")).getText();
	System.out.println(a);
	Assert.assertEquals(a, "Incorrect email or password.");
}
@Test
public void invalidusernameloginTest() throws Exception {
	ReadPropertyFile data=new ReadPropertyFile();
	DPNZhomepage hp=new DPNZhomepage(driver);
	hp.clickonloginlink();
	
	DPNZloginpage lp=new DPNZloginpage(driver);
	lp.enterloginemailid("mohammad@123.com");
	lp.enterpassword(data.getPassword());
	lp.clickloginsubmitbutton();
	Thread.sleep(5000);
	String a=driver.findElement(By.xpath(".//*[@id='dp-login-form']/fieldset/div[2]/div")).getText();
	System.out.println(a);
	Assert.assertEquals(a, "Incorrect email or password.");
	
	
}
@Test
public void invalidnullpwdloginTest() throws Exception {
		ReadPropertyFile data=new ReadPropertyFile();
		DPNZhomepage hp=new DPNZhomepage(driver);
		hp.clickonloginlink();
		
		DPNZloginpage lp=new DPNZloginpage(driver);
		lp.enterloginemailid(data.getUserName());
		lp.enterpassword("");
		Thread.sleep(5000);
		lp.clickloginsubmitbutton();	
Thread.sleep(5000);
String a=driver.findElement(By.xpath(".//*[@id='dp-login-form']/fieldset/div[2]/div")).getText();
System.out.println(a);
Assert.assertEquals(a, "Password cannot be blank.");
	}
@Test
public void invalidnullusernameloginTest() throws Exception {
		ReadPropertyFile data=new ReadPropertyFile();
		DPNZhomepage hp=new DPNZhomepage(driver);
		hp.clickonloginlink();
		
		DPNZloginpage lp=new DPNZloginpage(driver);
		lp.enterloginemailid("");
		lp.enterpassword(data.getPassword());
			
Thread.sleep(5000);
String a=driver.findElement(By.xpath(".//*[@id='dp-login-form']/fieldset/div[1]/div")).getText();
System.out.println(a);
Assert.assertEquals(a, "Email cannot be blank.");
	}
@Test
public void invalidnullloginTest() throws Exception {
	
		DPNZhomepage hp=new DPNZhomepage(driver);
		hp.clickonloginlink();
		
		DPNZloginpage lp=new DPNZloginpage(driver);
		lp.enterloginemailid("");
		lp.enterpassword("");
		Thread.sleep(5000);
		lp.clickloginsubmitbutton();	
		Thread.sleep(5000);
	String a=driver.findElement(By.xpath(".//*[@id='dp-login-form']/fieldset/div[1]/div")).getText();
	System.out.println(a);
	Assert.assertEquals(a, "Email cannot be blank.");
		
	String b=driver.findElement(By.xpath(".//*[@id='dp-login-form']/fieldset/div[2]/div")).getText();
	System.out.println(b);
	Assert.assertEquals(b, "Password cannot be blank.");
		
}
}


