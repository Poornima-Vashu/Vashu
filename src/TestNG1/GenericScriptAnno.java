package TestNG1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericScriptAnno {
	public WebDriver driver;
	public Actions act;
	@BeforeMethod
	public  void openApp() {
		System.setProperty("webdriver.chrome.driver","./software1/chromedriver.exe");
	    driver=new ChromeDriver();
	    act= new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void closeApp() throws Throwable {
		//GenricPhotoscript.getPhoto(driver);
		driver.close();
	}

}
