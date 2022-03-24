package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.pom.AddToCart;
import com.pom.ColourAndSize;
import com.pom.LogInPage;
import com.pom.SignInPage;
import com.pom.Women;

public class PageObjectManager {
	public static WebDriver driver;
	private SignInPage sp;
	private LogInPage lp;
	private Women wo;
	private ColourAndSize cs;
	private AddToCart ac;
	
	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}
	public SignInPage getSignInPage() {
		sp = new SignInPage(driver);
		return sp;

	}
	public LogInPage getLogInPage() {
		lp = new LogInPage(driver);
		return lp;

	}
	public Women getWomen() {
		wo = new Women(driver);
		return wo;

	}
	public ColourAndSize getColourAndSize() {
		cs = new ColourAndSize(driver);
		return cs;

	}
	public AddToCart getAddToCart() {
	ac = new AddToCart(driver);
		return ac;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	SignInPage sp = new SignInPage(driver);
//	LogInPage lp = new LogInPage(driver);
//	Women wo = new Women(driver);
//	ColourAndSize cs = new ColourAndSize(driver);
//	AddToCart 

}
