package testcases;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import genricHelper.GenricHelper;
import pageObjects.ProfilePerformancePage;
import pageObjects.ViewAndUpdateProfilePage;
import testBase.TestBase;

public class ViewAndUpdatePageProfilePageTest extends TestBase{
	public ViewAndUpdateProfilePage viewAndUpdateProfilePage;
	public ProfilePerformancePage profilePerformancePage;
	GenricHelper genricHelper;

	public UserPageTest userpageTest;
	
	
	@BeforeClass
	public void initialize() throws InterruptedException {
		userpageTest = new UserPageTest();
		userpageTest.initialize();
		
	}
	
	@Test(priority = 1)
	public void verfiyViewAndUpadtePage() throws InterruptedException {
		profilePerformancePage = new ProfilePerformancePage(driver);
		viewAndUpdateProfilePage = new ViewAndUpdateProfilePage(driver);
		genricHelper =new GenricHelper(driver);
	
		profilePerformancePage.clickOnProfileBtn();
		System.out.println(genricHelper.getTitleOfWebPage()+ " : " +genricHelper.getURL());
		viewAndUpdateProfilePage.clikOnViewAndUpdateLink();
		System.out.println(genricHelper.getTitleOfWebPage()+ " : " +genricHelper.getURL());
		
		
		
	}
	
	@Test(priority = 2)
	public void uploadResumeTest() throws InterruptedException, IOException {
		System.out.println("#################################################################");
		genricHelper =new GenricHelper(driver);
		viewAndUpdateProfilePage =new ViewAndUpdateProfilePage(driver);
		
		System.out.println(genricHelper.getURL());
		System.out.println("______________________________________________");
    
		System.out.println(genricHelper.getTitleByJs());

		System.out.println(viewAndUpdateProfilePage.attachCV.getText());
		
		System.out.println(genricHelper.isDisplayed(viewAndUpdateProfilePage.attachCV));
		System.out.println(genricHelper.isEnabled(viewAndUpdateProfilePage.attachCV));
		System.out.println(genricHelper.isSelected(viewAndUpdateProfilePage.attachCV));
		System.out.println("______________________________________________");
	
		
		
//		
//		wait =new WebDriverWait(driver, 100);
//		
//		wait.until(ExpectedConditions.visibilityOf(viewAndUpdateProfilePage.attachCV));
//		
//		wait.until(ExpectedConditions.elementToBeClickable(viewAndUpdateProfilePage.attachCV));
		System.out.println(genricHelper.isDisplayed(viewAndUpdateProfilePage.attachCV));
		System.out.println(genricHelper.isEnabled(viewAndUpdateProfilePage.attachCV));
		System.out.println(genricHelper.isSelected(viewAndUpdateProfilePage.attachCV));
		
		System.out.println("______________________________________________");
		
		Thread.sleep(5000);
		
	genricHelper.clickByActionsClass(viewAndUpdateProfilePage.attachCV);
		
//		if (genricHelper.isDisplayed(viewAndUpdateProfilePage.attachCV)) {
//			genricHelper.clickByJs(viewAndUpdateProfilePage.attachCV);
//			assertTrue(true, "clicked");
//			System.out.println(genricHelper.isSelected(viewAndUpdateProfilePage.attachCV));
//		}
     
	Thread.sleep(5000);
	
	System.out.println("_________Uploading______________________________"); 
	
	Runtime.getRuntime().exec("C:\\Users\\Pratik\\eclipse-workspace\\UIFramework\\AutoIT\\FileUpload.exe");
	
	System.out.println("____________AutoIT script exe successfully___________________________");
	
	
	Thread.sleep(1000);
	WebElement successMassage = null;
	try {
	
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='Resume has been successfully uploaded.']"))));
		
	 successMassage =driver.findElement(By.xpath("//*[text()='Resume has been successfully uploaded.']"));
		
	}catch (NoSuchElementException e) {
		
		System.out.println("$$$$$$$$$$ UNABLE TO LOCATE ELEMENT: "+e.getMessage());
	}
	
	System.out.println(successMassage.getText());
	
	Assert.assertEquals(successMassage.getText(), "Resume has been successfully uploaded.");
	
	System.out.println(" file uploaded successfully..................");
	
     	
	}
		
	
}
