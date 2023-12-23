package com.flightbooking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FlightBooking_ReadConfig {

	public File file;
	public Properties properties;
	public FileInputStream fileinputstream;

	public FlightBooking_ReadConfig() {
		file=new File("./Configuration/config.properties");
		try {
			fileinputstream=new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		properties=new Properties();
		try {
			properties.load(fileinputstream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String getApplicationUrl() {
		String applicationurl=properties.getProperty("Url");
		return applicationurl;
	}
	public String getChromeLoaction() {
		String browserLocation=properties.getProperty("ChromeLocation");
		return browserLocation;
	}
	public String getEmailId() {
		String emailid=properties.getProperty("EmailId");
		return emailid;
	}
	public String getPassword() {
		String password=properties.getProperty("Password");
		return password;
	}


}
