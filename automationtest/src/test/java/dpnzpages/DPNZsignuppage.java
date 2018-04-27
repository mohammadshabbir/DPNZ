package dpnzpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DPNZsignuppage {
	
	By registeremailid=By.id("signupform-email");
	By registerpassword=By.id("signupform-password");
	By signupformacceptterms=By.xpath(".//*[@id='dp-signup-form']/fieldset/div[3]/div/label");
	By registerButton=By.xpath(".//*[@id='dp-signup-form']/fieldset/button");
	WebDriver driver;
	public DPNZsignuppage(WebDriver driver) {
		this.driver=driver;
	}
	public void enterregisteremailid(String emailid) {
		driver.findElement(registeremailid).sendKeys(emailid);
		
	}
	public void enterregisterpassword(String pswd) {
		driver.findElement(registerpassword).sendKeys(pswd);
	}
	public void checksignupformacceptterms() {
		driver.findElement(signupformacceptterms).click();
	}
	public void clickregisterButton() {
		driver.findElement(registerButton).click();
	}

}
