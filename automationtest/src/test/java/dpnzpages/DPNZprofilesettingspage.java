package dpnzpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DPNZprofilesettingspage {
By changepassword=By.partialLinkText("Change Password");
By currentpassword=By.id("changepasswordform-currentpassword");
By changenewpassword=By.id("changepasswordform-newpassword");
By Changenewpasswordretype=By.id("changepasswordform-retypepassword");
By ChangeNow=By.xpath(".//*[@id='w0']/div/button");
WebDriver driver;

public DPNZprofilesettingspage(WebDriver driver) {
	this.driver=driver;
}

public void clickonchangepassword() {
	driver.findElement(changepassword).click();
}

public void entercurrentpassword(String currentpswd) {
	driver.findElement(currentpassword).sendKeys(currentpswd);
}
public void enternewpassword(String newpswd) {
	driver.findElement(changenewpassword).sendKeys(newpswd);
	
}

public void enterretypenewpassword(String retypenewpswd) {
	driver.findElement(Changenewpasswordretype).sendKeys(retypenewpswd);
}

public void clickonChangeNow() {
	driver.findElement(ChangeNow).click();
}

}
