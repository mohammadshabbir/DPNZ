package utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {
	public static void main(String[]args) {
	Logger logger=	Logger.getLogger("Log");
	PropertyConfigurator.configure("log4j.properties");

	}

}
