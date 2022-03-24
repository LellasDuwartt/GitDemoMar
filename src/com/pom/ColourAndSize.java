package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ColourAndSize {
	public static WebDriver driver;
	@FindBy(name="layered_id_attribute_group_3")
	private WebElement size;
	
	@FindBy(name="layered_id_attribute_group_13")
	private WebElement colour;
	
	@FindBy(name="layered_id_feature_5")
	private WebElement compositions;
	

     
	

	public ColourAndSize(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColour() {
		return colour;
	}

	public WebElement getCompositions() {
		return compositions;
	}

	

	
}
