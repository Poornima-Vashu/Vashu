package POM_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomScript {
	@FindBy(id="email")
	private WebElement uname;
	@FindBy(name="pass")
	private WebElement pass;
	@FindBy(name="login")
	private WebElement btn;
	public pomScript(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void username(String usn) {
		uname.sendKeys(usn);
	}
	public void password(String pwd) {
		pass.sendKeys(pwd);
	}
	public void button() {
		btn.click();
	}
	

}
