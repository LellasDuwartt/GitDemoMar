package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	public static WebDriver driver;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "passwd")
	private WebElement password;

	@FindBy(name = "SubmitLogin")
	private WebElement loginbtn;

	public LogInPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

}
// } public static WebDriver driver;
//
// @FindBy(id="email")
// private WebElement email;
//
// @FindBy(id="passwd")
// private WebElement password;
//
// @FindBy(name="SubmitLogin")
// private WebElement loginbtn;
//
// public LogInPage(WebDriver driver2) {
// this.driver=driver2;
// PageFactory.initElements(driver, this);
// }
//
// public WebElement getEmail() {
// return email;
// }
//
// public WebElement getPassword() {
// return password;
// }
//
// public WebElement getLoginbtn() {
// return loginbtn;
// }
//
//
// }
// @FindBy(id="email_create")
// private WebElement email;
//
// @FindBy(id="SubmitCreate")
// private WebElement submit;
////
// @FindBy(xpath="(//label[@class='top'])[1]")
// private WebElement gender;
//
// @FindBy(id="customer_firstname")
// private WebElement fname;
//
// @FindBy(id="customer_lastname")
// private WebElement lname;
//
// @FindBy(id="passwd")
// private WebElement password;
//
// @FindBy(id="days")
// private WebElement date;
//
// @FindBy(id="months")
// private WebElement month;
//
// @FindBy(id="years")
// private WebElement year;
//
// @FindBy(name="newsletter")
// private WebElement checkbox;
//
// @FindBy(id="firstname")
// private WebElement namef;
//
//
// @FindBy(id="lastname")
// private WebElement namel;
//
// @FindBy(id="company")
// private WebElement company;
//
// @FindBy(id="address1")
// private WebElement address1;
//
// @FindBy(id="address2")
// private WebElement address2;
//
// @FindBy(id="city")
// private WebElement city;
//
// @FindBy(id="id_state")
// private WebElement state;
//
// @FindBy(id="postcode")
// private WebElement postcode;
//
// @FindBy(id="id_country")
// private WebElement country;
//
// @FindBy(id="other")
// private WebElement other;
//
//
// @FindBy(id="phone")
// private WebElement phone;
//
// @FindBy(id="phone_mobile")
// private WebElement mobile;
//
// @FindBy(id="alias")
// private WebElement alias;
//
// @FindBy(id="submitAccount")
// private WebElement submitacc;
//
// public LogInPage(WebDriver driver2) {
// this.driver=driver2;
// PageFactory.initElements(driver2, this);
// }
//
// public WebElement getEmail() {
// return email;
// }
//
// public WebElement getSubmit() {
// return submit;
// }
//
// public WebElement getGender() {
// return gender;
// }
//
// public WebElement getFname() {
// return fname;
// }
//
// public WebElement getLname() {
// return lname;
// }
//
// public WebElement getPassword() {
// return password;
// }
//
// public WebElement getDate() {
// return date;
// }
//
// public WebElement getMonth() {
// return month;
// }
//
// public WebElement getYear() {
// return year;
// }
//
// public WebElement getCheckbox() {
// return checkbox;
// }
//
// public WebElement getNamef() {
// return namef;
// }
//
// public WebElement getNamel() {
// return namel;
// }
//
// public WebElement getCompany() {
// return company;
// }
//
// public WebElement getAddress1() {
// return address1;
// }
//
// public WebElement getAddress2() {
// return address2;
// }
//
// public WebElement getCity() {
// return city;
// }
//
// public WebElement getState() {
// return state;
// }
//
// public WebElement getPostcode() {
// return postcode;
// }
//
// public WebElement getCountry() {
// return country;
// }
//
// public WebElement getOther() {
// return other;
// }
//
// public WebElement getPhone() {
// return phone;
// }
//
// public WebElement getMobile() {
// return mobile;
// }
//
// public WebElement getAlias() {
// return alias;
// }
//
// public WebElement getSubmitacc() {
// return submitacc;
// }
