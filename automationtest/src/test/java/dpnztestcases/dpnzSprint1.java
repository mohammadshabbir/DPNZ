package dpnztestcases;



import org.testng.annotations.Test;
import dpnzpages.dpnzBaseClass;
import dpnzpages.dpnzhomepage ;
import dpnzpages.dpnzloginpage;
import utilities.ReadPropertyFile;

public class dpnzSprint1 extends dpnzBaseClass {
	
@Test
public void validloginTest() throws Exception {
		ReadPropertyFile data=new ReadPropertyFile();
		dpnzhomepage hp=new dpnzhomepage(driver);
		hp.clickonloginlink();
		
		dpnzloginpage lp=new dpnzloginpage(driver);
		lp.enterloginemailid(data.getUserName());
		lp.enterpassword(data.getPassword());
		lp.clickloginsubmitbutton();	
	}
@Test
public void invalidpswdloginTest() throws Exception {
	ReadPropertyFile data=new ReadPropertyFile();
	dpnzhomepage hp=new dpnzhomepage(driver);
	hp.clickonloginlink();
	
	dpnzloginpage lp=new dpnzloginpage(driver);
	lp.enterloginemailid(data.getUserName());
	lp.enterpassword("shabbir");
	lp.clickloginsubmitbutton();	
	
	
}
public void invalidusernameloginTest() throws Exception {
	ReadPropertyFile data=new ReadPropertyFile();
	dpnzhomepage hp=new dpnzhomepage(driver);
	hp.clickonloginlink();
	
	dpnzloginpage lp=new dpnzloginpage(driver);
	lp.enterloginemailid("mohammad@123.com");
	lp.enterpassword(data.getPassword());
	lp.clickloginsubmitbutton();	
	
	
}
@Test
public void invalidnullpwdloginTest() throws Exception {
		ReadPropertyFile data=new ReadPropertyFile();
		dpnzhomepage hp=new dpnzhomepage(driver);
		hp.clickonloginlink();
		
		dpnzloginpage lp=new dpnzloginpage(driver);
		lp.enterloginemailid(data.getUserName());
		lp.enterpassword(" ");
		lp.clickloginsubmitbutton();	
	}
@Test
public void invalidnullusernameloginTest() throws Exception {
		ReadPropertyFile data=new ReadPropertyFile();
		dpnzhomepage hp=new dpnzhomepage(driver);
		hp.clickonloginlink();
		
		dpnzloginpage lp=new dpnzloginpage(driver);
		lp.enterloginemailid("");
		lp.enterpassword(data.getPassword());
		lp.clickloginsubmitbutton();	
	}
@Test
public void invalidnullloginTest() throws Exception {
	
		dpnzhomepage hp=new dpnzhomepage(driver);
		hp.clickonloginlink();
		
		dpnzloginpage lp=new dpnzloginpage(driver);
		lp.enterloginemailid(" ");
		lp.enterpassword(" ");
		lp.clickloginsubmitbutton();	
	}

}
