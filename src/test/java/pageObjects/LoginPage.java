package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class LoginPage extends TestBase{

	public LoginPage(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = LoginPageConstants.xpath_username)
	WebElement username;
	
	@FindBy(xpath = LoginPageConstants.xpath_password)
	WebElement password;
	
	@FindBy(xpath = LoginPageConstants.xpath_submitButton)
	WebElement submitBtn;
	
	public void enterUserName(String um) {
		
		username.sendKeys(um);
	}
	
	public void enterPassword(String pass) {
		
		password.sendKeys(pass);
	}
	
public void loginSubmit() {
		
		submitBtn.click();
	}
	
}
