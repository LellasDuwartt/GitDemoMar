package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;
	

	public static WebDriver browserLaunch(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if (browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void geturl(String url) {
		driver.get(url);
	}

	public static void refersh() {
		driver.navigate().refresh();
	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void back() {
		driver.navigate().back();
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void getTittle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	// WebElement Method
        //SEND KEYS-1
	public static void sendKeys(WebElement element, String Value) {
		element.sendKeys(Value);
	}
        //CLICK-2
	public static void click(WebElement element) {
		element.click();
	}
         //CLEAR-3
	public static void clear(WebElement element) {
		element.clear();
	}
        //ISENABLED-4
	public static void isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}
      //ISDISPLAYED-5
	public static void isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println("IsDisplayed :" + displayed);
	}
      //ISSELECTED_6
	public static void isSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);

	}
            //GETATTRIBUTE-7
	public static void getAttribute(WebElement elememnt, String type) {

		if (type.equalsIgnoreCase("value")) {

			String attribute = elememnt.getAttribute("value");
			System.out.println(attribute);

		} else if (type.equalsIgnoreCase("name")) {
			String attribute1 = elememnt.getAttribute("name");
			System.out.println(attribute1);

		}
	}
        //DROPDOWN-8
	public static void dropDown(WebElement element, String type, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		} else if (type.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);

		}
	} 
	        //ACTIONS-9
	  public static void Actions_Method(WebElement element, String type) {
		  
		  Actions a = new Actions(driver);
		  
		  if (type.equalsIgnoreCase("move")) {
			  a.moveToElement(element).build().perform();
		}
		  else if (type.equalsIgnoreCase("click")) {
			  a.click(element).build().perform();
		}
		  else if (type.equalsIgnoreCase("doubleclick")) {
			  a.doubleClick(element).build().perform();
			
		}
		  else if (type.equalsIgnoreCase("rightclick")) {
			  a.contextClick(element).build().perform();
			}
	}
	     //WINDOWSHANDLES-10
	  public static void windowHandle(int index) {
		  Set<String> windowHandles = driver.getWindowHandles();
		  List<String> list = new ArrayList<String>();
		  
		  list.addAll(windowHandles);
		  
		  driver.switchTo().window(list.get(index));
	}
	     //SCREENSHOT-11
	  public static void screenShot(String location) throws IOException {
		  TakesScreenshot ts = (TakesScreenshot) driver;
		  
		  File src = ts.getScreenshotAs(OutputType.FILE);
		  
		  File dest = new File(location);
		  
		   FileUtils.copyFile(src, dest);
	}
	    //ALERT-12
	  public static void alert(String alerttype) {
		  
		  Alert alert = driver.switchTo().alert();
		  
		  if (alerttype.equalsIgnoreCase("ok")) {
			  alert.accept();
		}
		  else if (alerttype.equalsIgnoreCase("cancel")) {
			  alert.dismiss();
		}
		else if (alerttype.equalsIgnoreCase("gettext")) {
			String text = alert.getText();
			System.out.println(text);
		}
		  
		  

	}
	  // Scroll_Down

	  public static void scrollDown(WebElement element, String type) {
          if (type.equalsIgnoreCase("ScrollDown")) {
        	  JavascriptExecutor js = (JavascriptExecutor) driver;
  			  js.executeScript("arguments[0].scrollIntoView();", element);
  		  
		}
          else if (type.equalsIgnoreCase("ScrollUp")) {
        	  JavascriptExecutor js = (JavascriptExecutor) driver;
  			  js.executeScript("arguments[0].scrollIntoView();", element);
  		  
		}
 			

	}
	  public static void waitMethod() {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
}