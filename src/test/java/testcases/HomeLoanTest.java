package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoanTest extends BaseClass{

	

	//@Test(enabled=false)
	@Test
	public void test1() {
		System.out.println("Inside homeloan test1");
	}

	@Test
	public void test2() {
		System.out.println("Inside homeloan test2");
	}

}
