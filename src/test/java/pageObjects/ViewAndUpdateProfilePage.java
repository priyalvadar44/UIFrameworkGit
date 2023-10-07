package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genricHelper.GenricHelper;
import testBase.TestBase;

public class ViewAndUpdateProfilePage extends TestBase{

	public ViewAndUpdateProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = ViewAndUpdateProfilePageConstants.xpath_viewAndUpadateProfile)
	public WebElement updateBtn;
	
	@FindBy(xpath = ViewAndUpdateProfilePageConstants.xpath_uploadResume)
	public WebElement attachCV;
	
	
	GenricHelper genricHelper;
	
	public void clikOnViewAndUpdateLink() throws InterruptedException {
		genricHelper = new GenricHelper(driver);
		genricHelper.clickOnWebElment(updateBtn);
	}
	
//	public void clikUploadResumeLink() throws InterruptedException {
//		genricHelper = new GenricHelper(driver);
//		genricHelper.clickOnWebElment(attachCV);
//	}
//	public void clikUploadLink() throws InterruptedException {
//		genricHelper = new GenricHelper(driver);
//		genricHelper.clickOnWebElment(uploadCVLink);
//	}
	
	public void clikUploadResumeLinkByActoion() throws InterruptedException {
	genricHelper = new GenricHelper(driver);


	genricHelper.clickByActionsClass(attachCV);
}
public void clikUploadLink() throws InterruptedException {
	genricHelper = new GenricHelper(driver);
	genricHelper.clickOnWebElment(attachCV);
	genricHelper.clickByActionsClass(attachCV);
}
}
