package testcases;

import java.util.List;

import org.apache.log4j.xml.Log4jEntityResolver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.LoginPageConstants;
import pageObjects.UserPage;
import pageObjects.UserPageConstants;
import testBase.TestBase;

public class LoginPageTest extends TestBase {

	HomePage homepage;
	LoginPage loginpage;
	UserPage userpage;
	
	@BeforeClass
	public void initialize() throws InterruptedException {
		setUp();
		homepage= new HomePage(driver);
		homepage.clickOnLoginBtn();
		
		loginpage= new LoginPage(driver);
	}
	
	@Test(priority = 1)
	public void verifyUser() throws InterruptedException {
		
		loginpage.enterUserName(LoginPageConstants.username);
		loginpage.enterPassword(LoginPageConstants.password);
		loginpage.loginSubmit();
		
		userpage = new UserPage(driver);
		
		Assert.assertEquals(userpage.urlOfUserPage(driver), UserPageConstants.userPageURL);	
		
	}
}
