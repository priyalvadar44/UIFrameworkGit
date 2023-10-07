package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genricHelper.GenricHelper;
import testBase.TestBase;

public class HomePage extends TestBase {
	
	public HomePage(WebDriver driver) {
		
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = HomePageConstants.xpath_loginBtn)
	public static WebElement login;
	
	@FindBy(xpath = HomePageConstants.xpath_registrationBtn)
	public static WebElement reg;
	
	@FindBy(xpath = HomePageConstants.xpath_skills_designations_companies)
	public WebElement skill;
	
	@FindBy(xpath = HomePageConstants.xpath_List_AutoSuggestions)
	public  List<WebElement> listOfSkills;
	
	
	@FindBy(xpath = HomePageConstants.xpath_location)
	public WebElement location;
	

	@FindBy(xpath = HomePageConstants.xpath_List_locations_AutoSuggestions)
	public  List<WebElement> listOfLocations;
	
	public void clickOnLoginBtn() {
		
		login.click();
		
	}
	
	GenricHelper genricHelper;
	
    public String titleOfTheHomepage() throws InterruptedException {
		
    	genricHelper = new GenricHelper(driver);
    	
    	return genricHelper.getTitleOfWebPage();
    	
	 }
		
  public String urlOfTheHomepage() {
		
    	genricHelper = new GenricHelper(driver);
    	
    	return genricHelper.getURL();
    	
	 }
  
  public void enterSkillDesignation(WebElement element ,String text) throws InterruptedException {
	  Thread.sleep(5000);
	  genricHelper = new GenricHelper(driver);
	  
	  genricHelper.setText(element, text);
	   
  }
  public List<WebElement> handleAutoSuggestionOfSkills(List<WebElement> list) {
	  
	  
	  genricHelper = new GenricHelper(driver);
	  
	  return genricHelper.autoSuggestion(list);
	   
  }
  

  public void printAutoSuggestionsTextFromSkillsInputBox(List<WebElement> elents) throws InterruptedException {

	  Thread.sleep(5000);
	  genricHelper = new GenricHelper(driver);
	  genricHelper.forEachLoop(elents);
  }
	

}
