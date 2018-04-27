package dpnzpages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DPNZhomepage {
	WebDriver driver;
	By Login=By.linkText("Login");
	
	
	public DPNZhomepage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickonloginlink() {
		
		driver.findElement(Login).click();
	}
	
		

}
