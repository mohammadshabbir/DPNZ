package utilities;


import java.io.InputStream;
import java.util.Properties;

public class ReadPropertyFile {
	
	protected Properties prop=null;
	protected InputStream input =ReadPropertyFile.class.getClassLoader().getResourceAsStream("utilities/config.properties");
	
	public ReadPropertyFile() throws Exception {
		prop= new Properties();
		prop.load(input);
		
	}
	
	public String Chromedriver() {
		return prop.getProperty("chromedriver");
	}

	public String getUrl() {
		return prop.getProperty("url");
	}
	
	public String getUserName() {
		return prop.getProperty("username");
	}
	
	public String getPassword() {
		return prop.getProperty("password");
		
	}
}
