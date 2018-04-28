package dpnzpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DPNZuserhomepage {
	By userdropdown= By.id("tg-adminnav");
	By logoutlink=By.partialLinkText("Logout");
	By ProfileSettings=By.partialLinkText("Profile Settings");
	
	WebDriver driver;
	
	
	public DPNZuserhomepage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickuserdropdown() {
		driver.findElement(userdropdown).click();
	}
	public void clicklogoutlink() {
		driver.findElement(logoutlink).click();
	}
	public void clickprofilesettings() {
		driver.findElement(ProfileSettings).click();
	}
	

}
