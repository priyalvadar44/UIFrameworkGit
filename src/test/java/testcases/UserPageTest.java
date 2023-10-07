package testcases;

import org.testng.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.UserPage;
import testBase.TestBase;

public class UserPageTest extends TestBase{
	
	UserPage userpage;
	HomePage homepage;
	LoginPage loginpage;
	LoginPageTest loginPageTest;
	
	@BeforeClass
	public void initialize() throws InterruptedException {
		
		userpage = new UserPage(driver);
		homepage = new HomePage(driver);
		loginpage = new LoginPage(driver);
		loginPageTest = new LoginPageTest();
		loginPageTest.initialize();
		loginPageTest.verifyUser();
	}
	
	
	@Test(priority=1,alwaysRun = true)
	public void verfiyUserPageTitle() throws InterruptedException {
		String title = userpage.userPageTitle(driver);
		System.out.println(title);
		Assert.assertEquals(title, "Home | Mynaukri");	
		
	}
	
	@Test(priority=2,alwaysRun = true)
	public void verfiyUserHeading() throws InterruptedException {

		String act = userpage.userHeading(driver, UserPage.uHeading,"title");
		String exp ="Priyal S Vadar";
		System.out.println(act);
		Assert.assertEquals(act, exp);
	}
	

}
