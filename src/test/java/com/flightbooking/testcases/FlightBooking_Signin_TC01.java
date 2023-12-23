package com.flightbooking.testcases;

import org.testng.annotations.Test;

import com.flightbooking.baseclass.FlightBooking_BaseClass;
import com.flightbooking.pojoclass.FlightBooking_SigninPojoClass;
import com.flightbooking.testdata.FlightBooking_DataProvider;

public class FlightBooking_Signin_TC01 extends FlightBooking_BaseClass {
	
	@Test(dataProvider="logindata",dataProviderClass=FlightBooking_DataProvider.class)
	public void signinTestcase(String data1,String data2) {
		FlightBooking_SigninPojoClass pojo= new FlightBooking_SigninPojoClass(driver);
		logger.info("Cookies Cleared");
		pojo.setCookies();
		logger.info("Going to SignIn");
		pojo.setSignin();
		logger.info("Going to Enter EmailId");
		pojo.setEmailid(data1);
		logger.info("Going to Enter Password");
		pojo.setPassword(data2);
		logger.info("Clicked Submit");
		pojo.setSubmit();
		
		
		
		
	}
	

}
