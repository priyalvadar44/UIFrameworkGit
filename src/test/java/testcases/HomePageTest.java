package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import genricHelper.GenricHelper;
import pageObjects.HomePage;
import pageObjects.HomePageConstants;
import testBase.TestBase;

public class HomePageTest extends TestBase{
	
	HomePage homePage;
	GenricHelper genricHelper;
	
	@BeforeClass
	public void initialize() {
		
		setUp();
		
	}
	
	@Test(priority = 1,alwaysRun = true)
	public void verifyHomePageTitle() throws InterruptedException {
		
		homePage = new HomePage(driver);
		System.out.println("actual title of homepage   :"+homePage.titleOfTheHomepage());
		System.out.println("expected title of homepage :"+HomePageConstants.title_homepage);
		Assert.assertEquals(homePage.titleOfTheHomepage(), HomePageConstants.title_homepage);
		
	}
	
	
	@Test(priority = 2, alwaysRun = true)
	public void verifyHomePageURL() {
		
		homePage = new HomePage(driver);
		System.out.println("actual url of homepage   :"+HomePageConstants.url_homepage);
		System.out.println("expected url of homepage :"+homePage.urlOfTheHomepage());
		Assert.assertEquals(homePage.urlOfTheHomepage(),HomePageConstants.url_homepage);
		
	}
	
	@Test(priority = 3,alwaysRun = true)
	public void verifySkillAutosuggestion() throws InterruptedException {
		
		homePage = new HomePage(driver);
		homePage.enterSkillDesignation(homePage.skill,"selenium");
		homePage.printAutoSuggestionsTextFromSkillsInputBox(homePage.listOfSkills);	
		
	}
	@Test(priority = 4,alwaysRun = true)
	public void verifySkillAutosuggestionSize() throws InterruptedException {
		
		genricHelper =new GenricHelper(driver);
		System.out.println(genricHelper.sizeOfList(homePage.listOfSkills));
		
		Assert.assertEquals(genricHelper.sizeOfList(homePage.listOfSkills), HomePageConstants.size_List_skills);

	}
	
	
	@Test(priority = 5,alwaysRun = true)
	public void verifyLocationAutosuggestion() throws InterruptedException {
		
		System.out.println("__________________________________");
		homePage = new HomePage(driver);
		homePage.enterSkillDesignation(homePage.location,"p");
		homePage.printAutoSuggestionsTextFromSkillsInputBox(homePage.listOfLocations);	
		
	
		
	}
	
	
	
	@Test(priority = 6,alwaysRun = true)
	public void verifyLocationAutosuggestionSize() throws InterruptedException {
		
		System.out.println("__________________________________");
		genricHelper =new GenricHelper(driver);
		System.out.println(genricHelper.sizeOfList(homePage.listOfLocations));
		
		Assert.assertEquals(genricHelper.sizeOfList(homePage.listOfLocations), HomePageConstants.size_List_locations);
	}
	
	

}
