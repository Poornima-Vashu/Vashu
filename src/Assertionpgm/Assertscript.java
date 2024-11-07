package Assertionpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertscript extends GenericScriptAnno
{
@Test
public void login() {
	String url = driver.getCurrentUrl();
	Assert.assertEquals(url, "https://www.meesho.com/");
	System.out.println("hello");
//	String url = driver.getCurrentUrl();
//	Assert.assertEquals(url, "https://www.facebook.com/");
//	System.out.println("hello");
	WebElement ele = driver.findElement(By.xpath("//span[.='Kids']"));
	String res = ele.getAttribute("sc-eDvSVe gUjMRV");
	System.out.println(res);
	
	
}
}
                                                                                       