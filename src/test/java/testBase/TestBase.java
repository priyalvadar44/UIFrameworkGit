
package testBase;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class TestBase {

	  public static  WebDriver driver;
	  public static ChromeOptions chromeOptions;
	  public static WebDriverWait wait;
	  public static WebElement element;
	  private static org.apache.log4j.Logger logger;
	  
	 
	   @BeforeTest(alwaysRun = true)
	    public void setLogger(){
	        System.out.println("\n\n\n\n\n*************** Setting Logger ***************");
	        logger = LogManager.getLogger(TestBase.class);
	        TestBase.log("*************** Logger Set ***************");
	    }

	   public static void log(String log){
	        logger.info(log);

	        StringBuilder classLogs = null;
			//Allure Report
	        if(classLogs == null) classLogs = new StringBuilder();
	        Calendar current = Calendar.getInstance();
	        log = current.getTime() + " ## " + log;
	        classLogs.append(log).append(System.lineSeparator());
	    }

	 public void setUp() {
		
	   WebDriverManager.chromedriver().setup();
	  
	   chromeOptions= new ChromeOptions();
	   chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors", "extensions");
	   chromeOptions.addArguments("--incognito");
	   driver = new ChromeDriver(chromeOptions);
	   
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);

       wait = new WebDriverWait(driver, 30);
	   driver.get("https://www.naukri.com/");  
	   
	   
	}
}
