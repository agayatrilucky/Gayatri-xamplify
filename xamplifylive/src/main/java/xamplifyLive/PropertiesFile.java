package xamplifyLive;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	
	public static Properties readPropertyFile(String filePath){
		
	Properties prop = new Properties();

	File file = new File(filePath);
	 
	FileInputStream fileInput = null;
	try {
	fileInput = new FileInputStream(file);

	} 
	catch (FileNotFoundException e) {
	e.printStackTrace();
	}


	//load properties file
	try {
	prop.load(fileInput);
	} catch (IOException e) {
	e.printStackTrace();
	}
	return prop;
	}


}
