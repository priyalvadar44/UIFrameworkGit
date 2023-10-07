package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genricHelper.GenricHelper;
import testBase.TestBase;

public class LogoutPage extends TestBase {

	public LogoutPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = LogoutPageConstants.xpath_logoutBtn)
	WebElement logoutBtn;
	
	GenricHelper genricHelper;
	
	public void clickOnLogoutBtn() throws InterruptedException {
		Thread.sleep(2000);
		genricHelper =new GenricHelper(driver);
		genricHelper.clickOnWebElment(logoutBtn);
	}
	
	
	public String getUrlOfPageAfterLogout() throws InterruptedException {
		Thread.sleep(5000);
		genricHelper =new GenricHelper(driver);
		return genricHelper.getURL();
	}
}
