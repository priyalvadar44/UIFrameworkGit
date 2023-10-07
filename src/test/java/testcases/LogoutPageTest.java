package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePageConstants;
import pageObjects.LogoutPage;
import pageObjects.ProfilePerformancePage;
import testBase.TestBase;

public class LogoutPageTest extends TestBase{
	
    UserPageTest userPageTest ;
    LogoutPage logoutPage;
    ProfilePerformancePage profilePerformancePage;
    
	@BeforeClass
	public void initialize() throws InterruptedException {
		userPageTest=new UserPageTest();
		userPageTest.initialize();
	}
	
	@Test(priority = 1,alwaysRun = true)
	public void userLogout() throws InterruptedException {
		
		
		profilePerformancePage = new ProfilePerformancePage(driver);
		logoutPage = new LogoutPage(driver);
		
		profilePerformancePage.clickOnProfileBtn();
		logoutPage.clickOnLogoutBtn();
		
		Assert.assertEquals(logoutPage.getUrlOfPageAfterLogout(), HomePageConstants.base_Url);
		
		
		
	}

}
 