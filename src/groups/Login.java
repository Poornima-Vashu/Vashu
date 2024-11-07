package groups;

import org.testng.annotations.Test;

public class Login {
	@Test(groups = {"SmokeTC"})
	public void TC_01() {
		System.out.println("this is TC01 of Login(SmokeTC)");
	}
	@Test(groups = {"FunctionalTC"})
	public void TC_02() {
		System.out.println("this is TC02 of Login(FunctionalTC)");
	}
//	@Test(groups = {"IntegrationTC"})
	public void TC_03() {
		System.out.println("this is TC03 of Login(IntegrationTC)");
	}
	@Test(groups = {"SmokeTC"})
	public void TC_04() {
		System.out.println("this is TC04 of Login(SmokeTC)");
	}

}
