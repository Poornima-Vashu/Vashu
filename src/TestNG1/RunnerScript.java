package TestNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RunnerScript extends GenericScriptAnno{
	@Test
	public void launch() {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("poornima@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("poo");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		act.contextClick(ele).perform();
	}

}
 