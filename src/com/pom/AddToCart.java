package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	public static WebDriver driver;

	@FindBy(xpath = "(//img[@class='replace-2x img-responsive'])[2]")
	private WebElement image;

	public WebElement getImage() {
		return image;
	}

	public WebElement getAddcart() {
		return addcart;
	}

	@FindBy(xpath = "//a[@title='Add to cart']")
	private WebElement addcart;

	@FindBy(xpath = "//button[@class='exclusive']")
	private WebElement submit;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceed1;

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceed2;

	@FindBy(name = "email")
	private WebElement email;

	@FindBy(id = "passwd")
	private WebElement password;

	@FindBy(name = "SubmitLogin")
	private WebElement signin;

	@FindBy(name = "processAddress")
	private WebElement proceed3;

	@FindBy(id = "cgv")
	private WebElement cbox;

	@FindBy(name = "processCarrier")
	private WebElement Proceed4;

	@FindBy(xpath = "//a[@class='cheque']")
	private WebElement cheque;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement confirm;

	@FindBy(xpath = "div[@class='coloumns-container']")
	private WebElement page;
	
	@FindBy(xpath="//li[@class='step_done first']")
	private WebElement summary;

	public WebElement getSummary() {
		return summary;
	}

	public WebElement getPage() {
		return page;
	}

	public WebElement getProceed3() {
		return proceed3;
	}

	public void setProceed3(WebElement proceed3) {
		this.proceed3 = proceed3;
	}

	public WebElement getCbox() {
		return cbox;
	}

	public void setCbox(WebElement cbox) {
		this.cbox = cbox;
	}

	public WebElement getProceed4() {
		return Proceed4;
	}

	public void setProceed4(WebElement proceed4) {
		Proceed4 = proceed4;
	}

	public WebElement getCheque() {
		return cheque;
	}

	public void setCheque(WebElement cheque) {
		this.cheque = cheque;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public void setConfirm(WebElement confirm) {
		this.confirm = confirm;
	}

	public AddToCart(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getProceed1() {
		return proceed1;
	}

	public WebElement getProceed2() {
		return proceed2;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin() {
		return signin;
	}

}
