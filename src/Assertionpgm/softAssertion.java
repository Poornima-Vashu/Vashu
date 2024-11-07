package Assertionpgm;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertion extends GenericScriptAnno{
@Test
public void sign() {
	String title = driver.getTitle();
	SoftAssert sa=new SoftAssert();
//	sa.assertTrue(title.contains("meesho"));
//	System.out.println("hii vashu");
	sa.assertEquals(title,"https://www.meesho.com/");
	System.out.println("hii poo");
	sa.assertAll();
}
}
