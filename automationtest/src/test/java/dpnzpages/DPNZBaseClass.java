package dpnzpages;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
//import org.testng.Reporter;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;



import utilities.ReadPropertyFile;

public class DPNZBaseClass {
	public static WebDriver driver;
	
	

	@BeforeMethod
	public void launchurl() throws Exception {
		
		
		ReadPropertyFile data=new ReadPropertyFile();
        System.setProperty("webdriver.chrome.driver", data.Chromedriver());
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(data.getUrl());
        Thread.sleep(5000);
      
        
    	

	}
	

	@AfterMethod
	public void closeApplication(ITestResult result)
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   String DT=dtf.format(now);
		   String DTresult = DT.replaceAll("[-+.^:,/ ]","");
		if(ITestResult.FAILURE==result.getStatus())
		{
		try 
		{
	
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/DpnzScreenshots"+result.getName()+DTresult+".png")); 
		System.out.println("Screenshot taken");
		} 
		catch (Exception e)
		{
		System.out.println("Exception while taking screenshot "+e.getMessage());
		}  
	}


	driver.quit();

		
	}


}
