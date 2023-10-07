package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genricHelper.GenricHelper;
import testBase.TestBase;

public class ProfilePerformancePage extends TestBase{

	public ProfilePerformancePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = ProfilePerformamcePageConstants.xpath_Profile)
	WebElement profileBtn;
	
	GenricHelper genricHelper;
	
	public void clickOnProfileBtn() throws InterruptedException {
		genricHelper = new GenricHelper(driver);
		genricHelper.clickOnWebElment(profileBtn);
		
	}
}
