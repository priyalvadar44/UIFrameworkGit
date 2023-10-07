package pageObjects;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import genricHelper.GenricHelper;
import testBase.TestBase;

public class UserPage extends TestBase{

	GenricHelper genricHelper;
	
	public UserPage(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*")
	List<WebElement> allEle;
	
	@FindBy(xpath = "//div[@class='info__heading']")
	public static WebElement uHeading;
	
	
	
	
	public List<WebElement> listOfAllWebElements() {
		
		return allEle;
	}
	
	
	public String urlOfUserPage(WebDriver driver) throws InterruptedException {
		
		genricHelper =new GenricHelper(driver);
		String url="";
		Thread.sleep(5000);
		JavascriptExecutor j = (JavascriptExecutor)driver;
		if (j.executeScript("return document.readyState").toString().equals("complete")){
		   System.out.println("Page has loaded");
		   url= genricHelper.getURL();
		}
		return url;
		
	}
	
	
	public String userHeading(WebDriver driver,WebElement element ,String title) throws InterruptedException {
        Thread.sleep(5000);
		genricHelper =new GenricHelper(driver);
	    return genricHelper.getAttributeOfWebElement(title, element);
	    
//		Thread.sleep(5000);
//		String title=element.getAttribute("title");
//		System.out.println(title);
//		return title;
	}
	
	public String userPageTitle(WebDriver driver) throws InterruptedException {

		genricHelper =new GenricHelper(driver);
		return genricHelper.getTitleOfWebPage();
		
	}

	
}

