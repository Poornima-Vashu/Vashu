 package Assertionpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Refresh {
	@Test
	public void login() throws Throwable {
		System.setProperty("webdriver.chrome.driver","./software1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		ele.sendKeys("poornima@gmail.com");
		WebElement ps = driver.findElement(By.xpath("//input[@type='password']"));
		ps.sendKeys("poo");
		Thread.sleep(2000);
		driver.navigate().refresh();
		ele.sendKeys("poornima@gmail.com");
		Thread.sleep(2000);
		ps.sendKeys("poo");
		driver.quit();
	}
	

}
