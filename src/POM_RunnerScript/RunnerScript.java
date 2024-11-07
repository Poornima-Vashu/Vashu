package POM_RunnerScript;

import org.testng.annotations.Test;

import Assertionpgm.GenericScriptAnno;
import POM_Script.pomScript;

public class RunnerScript extends GenericScriptAnno{
	@Test
	public void Loginfb() throws Throwable
	{
//		System.setProperty("webdriver.chrome.driver","./software1/chromedriver.exe");
//	   WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
		pomScript p=new pomScript(driver);
		p.username("poo@gmail.com");
		Thread.sleep(2000); 
		p.password("vashu@123");
		Thread.sleep(2000);
//		p.button();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.username("vashu@gmail.com");
		Thread.sleep(2000);
		p.password("poo@123");
		Thread.sleep(2000);
		p.button();
//		Thread.sleep(2000);
//        driver.quit();
	}
	
}
