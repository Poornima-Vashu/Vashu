package groupexclude;

import org.testng.annotations.Test;
@Test(groups ={"runall"})
public class Allclass {
	@Test(groups = {"Smoke"})
	public void TC_01() {
		System.out.println("this is Smoke_Tc1");
	}
	@Test(groups = {"Functional"})
	public void TC_02() {
		System.out.println("this is Functional_Tc2");
	}
	@Test(groups = {"Integration"})
	public void TC_03() {
		System.out.println("this is Integration_Tc3");
	}
	@Test(groups = {"Smoke"})
	public void TC_04() {
		System.out.println("this is Smoke_Tc4");
	}
	@Test(groups = {"Smoke"})
	public void TC_05() {
		System.out.println("this is Smoke_Tc5");
	}

}
