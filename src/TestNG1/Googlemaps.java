package TestNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Googlemaps {
	@Test
	public void maps() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/maps/@12.9335296,77.6142848,11z?hl=en&entry=ttu");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"hArJGc\"]/span")).click();		
	     Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"sb_ifc50\"]/input")).sendKeys("Bangalore");	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"sb_ifc51\"]/input")).sendKeys("hubli");	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"directions-searchbox-1\"]/button[1]/span")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"QA0Szd\"]/div/div/div[1]/div[2]/div/div[1]/div/div/div[2]/button[2]/span")).click();	
		 Thread.sleep(1000);
driver.quit();
       
      }
		
}
