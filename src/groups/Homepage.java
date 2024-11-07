package groups;

import org.testng.annotations.Test;
@Test(groups = {"allTC"})
public class Homepage {
	@Test(groups = {"SmokeTC"})
	public void TC_01() {
		System.out.println("this is TC01 of Homepage(SmokeTC)");
	}
	@Test(groups = {"FunctionalTC"})
	public void TC_02() {
		System.out.println("this is TC02 of Homepage(FunctionalTC)");
	}
//	@Test(groups = {"IntegrationTC"})
	public void TC_03() {
		System.out.println("this is TC03 of Homepage(IntegrationTC)");
	}
	@Test(groups = {"SmokeTC"})
	public void TC_04() {
		System.out.println("this is TC04 of Homepage(SmokeTC)");
	}

}
