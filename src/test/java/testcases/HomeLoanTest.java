package testcases;

import org.testng.annotations.Test;

public class HomeLoanTest extends BaseClass {

	// @Test(enabled=false)
	@Test(dependsOnMethods = "test2", groups = { "sanity" })
	// @Test
	public void test1() {
	//	test2();
		System.out.println("Inside homeloan test1");
	}

	
	@Test(groups = { "sanity","regression" })
	public void test2() {
		System.out.println("Inside homeloan test2");
	}	
	
}
