package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class RegistrationPage extends TestBase{
	
	public RegistrationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

}
