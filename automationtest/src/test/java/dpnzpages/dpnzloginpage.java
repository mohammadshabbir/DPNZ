package dpnzpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dpnzloginpage {
	By loginemailid=By.id("loginform-email");
	By password=By.id("loginform-password");
	By logsubmit=By.xpath(".//*[@id='dp-login-form']/fieldset/button");
	
	WebDriver driver;
	public dpnzloginpage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void enterloginemailid(String emailid) {
		driver.findElement(loginemailid).sendKeys(emailid);
	}
	public void enterpassword(String pswd) {
		driver.findElement(password).sendKeys(pswd);
	}
	public void clickloginsubmitbutton() {
		driver.findElement(logsubmit).click();
	}
	
}
