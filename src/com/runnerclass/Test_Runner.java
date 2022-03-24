package com.runnerclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Wait;

import com.baseclass.Base_Class;
import com.pageobjectmanager.PageObjectManager;
import com.pom.AddToCart;
import com.pom.ColourAndSize;
import com.pom.LogInPage;
import com.pom.SignInPage;
import com.pom.Women;



public class Test_Runner extends Base_Class {
	public static WebDriver driver=Base_Class.browserLaunch("chrome");

	public static void main(String[] args) throws IOException {
		
		PageObjectManager pom = new PageObjectManager(driver);
        
		geturl("http://automationpractice.com/index.php");
		waitMethod();

		screenShot("C:\\Users\\Yellas\\eclipse-workspace\\Mini_Project1\\SCREEN_SHOT\\Sign_Page.image.png");
		click(pom.getSignInPage().getSignBtn());
		
		
//		sendKeys(lp.getEmail(), "lellasduwartt22@gmail.com");
//		click(lp.getSubmit());
//		click(lp.getGender());
//		sendKeys(lp.getFname(), "Lellas");
//		sendKeys(lp.getLname(), "Duwartt");
//		sendKeys(lp.getPassword(), "Feb221993");
//		dropDown(lp.getDate(), "value", "22");
//		dropDown(lp.getMonth(), "value", "2");
//		dropDown(lp.getYear(), "value", "1994");
//		click(lp.getCheckbox());
//		sendKeys(lp.getCompany(), "HSBC");
//		sendKeys(lp.getAddress1(), "458 Kildeer Drive");
//		sendKeys(lp.getAddress2(), "Philadelphia");
//		sendKeys(lp.getCity(), "Philadelphia");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		dropDown(lp.getState(), "value", "38");
//		sendKeys(lp.getPostcode(), "19115");
		//dropDown(lp.getCountry(), "text", "united States");
//		sendKeys(lp.getOther(), "Null");
//		sendKeys(lp.getPhone(), "740-983-7787");
//		sendKeys(lp.getMobile(), "9176045473");
//		sendKeys(lp.getAlias(), "My Address");
//		click(lp.getSubmitacc());
		
		
		
        Actions_Method(pom.getWomen().getWomen(), "move");
        Actions_Method(pom.getWomen().getCasual(), "click");
        
        screenShot("C:\\Users\\Yellas\\eclipse-workspace\\Mini_Project1\\SCREEN_SHOT\\SizePage.image.png");
        click(pom.getColourAndSize().getSize());
        click(pom.getColourAndSize().getColour());
        click(pom.getColourAndSize().getCompositions());
        
         
 
        
        Actions_Method(pom.getAddToCart().getImage(), "move");
        screenShot("C:\\Users\\Yellas\\eclipse-workspace\\Mini_Project1\\SCREEN_SHOT\\Addtocartpage.image.png");
        Actions_Method(pom.getAddToCart().getAddcart(), "click");
        
        
        click(pom.getAddToCart().getProceed1());
        click(pom.getAddToCart().getProceed2());
        sendKeys(pom.getAddToCart().getEmail(), "lellasduwartt22@gmail.com");
        sendKeys(pom.getAddToCart().getPassword(), "Feb221993");
        screenShot("C:\\Users\\Yellas\\eclipse-workspace\\Mini_Project1\\SCREEN_SHOT\\loginpage.image.png");
        click(pom.getAddToCart().getSignin());
        screenShot("C:\\Users\\Yellas\\eclipse-workspace\\Mini_Project1\\SCREEN_SHOT\\Proceed1_Page.image.png");
        click(pom.getAddToCart().getProceed3());
        click(pom.getAddToCart().getCbox());
        screenShot("C:\\Users\\Yellas\\eclipse-workspace\\Mini_Project1\\SCREEN_SHOT\\Proceed2_Page.image.png");
        click(pom.getAddToCart().getProceed4());
        screenShot("C:\\Users\\Yellas\\eclipse-workspace\\Mini_Project1\\SCREEN_SHOT\\Cheque_Page.image.png");
        click(pom.getAddToCart().getCheque());
        click(pom.getAddToCart().getConfirm());
        scrollDown(pom.getAddToCart().getSummary(), "ScrollDown");
         screenShot("C:\\Users\\Yellas\\eclipse-workspace\\Mini_Project1\\SCREEN_SHOT\\confim_orderimage.png");
        
    	}

}
