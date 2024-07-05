package com.streak.Day6;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgOrder {

	@Test()
	public void firstMethod() {
		System.out.println("first method");
	}

	@Test(priority = 1)
	public void secondMethod() {
		System.out.println("second method");
		
	}

	@Test(priority = 0)
	public void thirdMethod() {
		System.out.println("third method");
	}

	@Test()
	public void fourthMethod() {
		System.out.println("fourth method");
	}

	@Test()
	public void fifthMethod() {
		System.out.println("fifth method");
	}

}
