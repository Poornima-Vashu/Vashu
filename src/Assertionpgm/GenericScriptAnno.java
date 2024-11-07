package Assertionpgm;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericScriptAnno {
	public WebDriver driver;
	public Actions act;
	public WebDriverWait wait;
	@BeforeMethod
	public  void openApp() {
		System.setProperty("webdriver.chrome.driver","./software1/chromedriver.exe");
	    driver=new ChromeDriver();
	    act= new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    wait=new WebDriverWait(driver, 10);
		
		
	}
	@AfterMethod
	public void closeApp() throws Throwable {
		//GenricPhotoscript.getPhoto(driver);
		Thread.sleep(2000);
		driver.close();
	}

}
