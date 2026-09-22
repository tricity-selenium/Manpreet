package utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public static String readconfig(String propname) throws IOException
	{
		Properties prop = new Properties();
		FileReader fr = new FileReader("F:\\DeepakWS\\ManpreetFramework\\src\\test\\resources\\config.properties");
		prop.load(fr);
		return prop.getProperty(propname);
	}
	
}
