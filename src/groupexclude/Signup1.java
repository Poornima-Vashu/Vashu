package groupexclude;

import org.testng.annotations.Test;

public class Signup1 {
	@Test(groups = {"SmokeTC"})
	public void TC_01() {
		System.out.println("this is TC01 of Signup(SmokeTC)");
	}
	@Test(groups = {"FunctionalTC"})
	public void TC_02() {
		System.out.println("this is TC02 of Signup(FunctionalTC)");
	}
//	@Test(groups = {"IntegrationTC"})
	public void TC_03() {
		System.out.println("this is TC03 of Signup(IntegrationTC)");
	}
	@Test(groups = {"SmokeTC"})
	public void TC_04() {
		System.out.println("this is TC04 of Signup(SmokeTC)");
	}

}
