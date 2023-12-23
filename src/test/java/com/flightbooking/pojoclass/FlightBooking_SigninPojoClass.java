package com.flightbooking.pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flightbooking.baseclass.FlightBooking_BaseClass;

public class FlightBooking_SigninPojoClass extends FlightBooking_BaseClass {

	public WebDriver ldriver;

	public FlightBooking_SigninPojoClass(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);;
	}
//	@FindBy(xpath="//button[@id='ensCloseBanner']")
	@FindBy(xpath="//button[@id='ensRejectAll']")
	@CacheLookup
	private WebElement cookies;
	@FindBy(xpath="//a/following::span[text()='Sign in'][2]")
	@CacheLookup
	private WebElement signin;
	@FindBy(xpath="//div[@class='field']/input[@type='text']")
	@CacheLookup
	private WebElement emailid;
	@FindBy(xpath="//div[@class='field']/input[@type='password']")
	@CacheLookup
	private WebElement password;
	@FindBy(xpath="//div[@class='field']/following::button[@type='submit']")
	@CacheLookup
	private WebElement submit;

	public WebElement getCookies() {
		return cookies;
	}
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getEmailid() {
		return emailid;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
	public void setCookies() {
		getCookies();
//		webdriverClickWait(cookies);
//		moveToElement(cookies);
		btnClick(cookies);
	}
	public void setSignin() {
		getSignin();
		btnClick(signin);
	}
	public void setEmailid(String email) {
		getEmailid();
		type(emailid, email);
	}
	public void setPassword(String pass) {
		getPassword();
		type(password, pass);
	}
	public void setSubmit() {
		getSubmit();
		btnClick(submit);
	}
	


}
