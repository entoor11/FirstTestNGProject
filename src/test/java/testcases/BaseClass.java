package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeTest
	public void method3() {
		System.out.println("Before Test");
	}

	@BeforeMethod
	public void method1() {
		System.out.println("Before Method");
	}

	// If you have 100 @test it will execute 100 times before method and after
	// method
	@AfterMethod
	public void method2() {
		System.out.println("After Method");
	}

	// If you have 100 @test after test and before test will execute only once
	@AfterTest
	public void method4() {
		System.out.println("After Test");
	}

}
