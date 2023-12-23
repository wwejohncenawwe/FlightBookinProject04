package com.flightbooking.testdata;

import org.testng.annotations.DataProvider;

import com.flightbooking.baseclass.FlightBooking_BaseClass;
import com.flightbooking.utilities.FlightBooking_ReadExcel;

public class FlightBooking_DataProvider extends FlightBooking_BaseClass {

	String[][] Exceldata=null;

	@DataProvider(name="logindata")
	public String[][] getData(){
		//		logger.error("Loading Excel Data");
		Exceldata=getExcelData();
		return Exceldata;
	}
	public String[][] getExcelData(){
		String path="D:\\Eclipse Workspace\\Flight-Booking-Project\\src\\test\\java\\com\\flightbooking\\testdata\\TC02.xlsx";
		//		logger.info("Getting Rowcount");
		int rowcount=FlightBooking_ReadExcel.getRowCount(path,"loginbox");
		//		logger.info("Getting Cellcount");
		int cellcount=FlightBooking_ReadExcel.getCellCount(path,"loginbox", rowcount);
		String datavalue[][]=new String[rowcount][cellcount];
		for(int i=1;i<=rowcount;i++) {
			for(int j=0;j<cellcount;j++) {
				datavalue[i-1][j]=FlightBooking_ReadExcel.getCellData(path,"loginbox", i, j);
			}
		}
		//		logger.info("ExcelData value Feteched Done");
		return datavalue;
	}
}


