package com.Selenium.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {

	public Properties properties;
	
	public ReadConfigFile() {
		properties=new Properties();
		String path="C:\\Users\\HP\\eclipse-workspace\\Selenium_Project\\src\\main\\resources\\Config.Properties";
		try {
			FileInputStream fis=new FileInputStream(path);
			try {
				properties.load(fis);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	  public String getUserName() {
		String name=  properties.getProperty("UserName");
		return name;
		      
	  }
	
	  public String getPassword() {
			String pass=  properties.getProperty("PassWord");
			return pass;
			      
		  }
		
	
}
