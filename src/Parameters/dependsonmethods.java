package Parameters;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsonmethods {
	@Test
	public void compose() {
		System.out.println("message composed");
	}
	@Test(dependsOnMethods ="sentItems" )
	public void sentItems() {
		Assert.fail();
		System.out.println("message sent");
	}
	@Test(dependsOnMethods ="Trash" )
	public void Trash() {
		System.out.println("message deleted");
	}
}
