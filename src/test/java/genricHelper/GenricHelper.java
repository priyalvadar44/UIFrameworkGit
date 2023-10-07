package genricHelper;

import java.util.List;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class GenricHelper extends TestBase {

	public JavascriptExecutor js;

	public GenricHelper(WebDriver driver) {

		this.driver = driver;

	}

	public boolean isDisplayed(WebElement ele) {
		return ele.isDisplayed();
	}
	
	
	public boolean isSelected(WebElement ele) {
		return ele.isSelected();
	}
	
	public boolean isEnabled(WebElement ele) {
		return ele.isEnabled();
	}
	
	public String getAttributeOfWebElement(String attributeName, WebElement ele) {

		return ele.getAttribute(attributeName);
	}

	public String getTitleOfWebPage() throws InterruptedException {
//	        TestBase.log("Getting title of Web Page");
//	        TestBase.log("Title is : " + driver.getTitle());

		Thread.sleep(2000);
		return driver.getTitle();
	}

	public String getURL() {
//	        TestBase.log("Getting URL of Web Page");
//	        TestBase.log("URL is : " + driver.getCurrentUrl());
		return driver.getCurrentUrl();
	}

	public String getWebElementText(WebElement element) {

		return element.getText();
	}

	public void clickOnWebElment(WebElement ele) throws InterruptedException {
//	        TestBase.log("clicking on webelement ");

		Thread.sleep(2000);
		ele.click();
	}

	public void setText(WebElement ele, String text) {
		ele.sendKeys(text);
	}

	public List<WebElement> autoSuggestion(List<WebElement> autoSgt) {

		return autoSgt;

	}

	public int sizeOfList(List<WebElement> element) {

		return element.size();
	}

	public void scrollToElement(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void forEachLoop(List<WebElement> elements) throws InterruptedException {

		for (WebElement ele : elements) {
			Thread.sleep(1000);
			scrollToElement(ele);
			System.out.println(ele.getText());
		}

	}

	public void forLoop(List<WebElement> elements) throws InterruptedException {

		for (int i = 0; i < elements.size(); i++) {
			Thread.sleep(1000);
			scrollToElement(elements.get(i));
			System.out.println(elements.get(i).getText());
		}

	}

	public void clickByJs(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	

	public void clickByActionsClass(WebElement ele) throws InterruptedException {
		Thread.sleep(5000);
		 Actions builder = new Actions(driver);
	        Action clickButton = builder.moveToElement(ele).click(ele).build();
	        clickButton.perform();  //working
	}
	public void setTextByJs(WebElement ele, String text) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + text + "';", ele);

	}

	public String getTitleByJs() {
//		        TestBase.log("Getting title of Web Page by using js");
//		        TestBase.log("Title is : " + driver.getTitle());

		js = (JavascriptExecutor) driver;
		return js.executeScript("return document.title;").toString();

	}

	public void scrollPageDown() {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight");

	}

	
}
