package com.streak.Day6;

import org.testng.Assert;
import org.testng.annotations.Test;

//groups 
public class TestNGGroups {
	@Test(priority = 4, dependsOnMethods = "secondMethod")
	public void firstMethod() {
		System.out.println("first method");
	}

	@Test(priority = 2, groups = "smoke")
	public void secondMethod() {
		System.out.println("second method");
		Assert.fail();
	}

	@Test(priority = 0, dependsOnMethods = "secondMethod", alwaysRun = true)
	public void thirdMethod() {
		System.out.println("third method");
	}

	@Test(priority = 1, groups = { "smoke", "functional" })
	public void fourthMethod() {
		System.out.println("fourth method");
	}

	@Test(priority = 3, groups = "functional")
	public void fifthMethod() {
		System.out.println("fifth method");
	}

	@Test(groups = "smoke", priority = 5)
	public void SixthMethod() {
		System.out.println("Sixth method");
	}
}
