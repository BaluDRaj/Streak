package com.streak.Day6;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailure {
	
	@Test
	public void doLogin()
	{
		Assert.fail();
		System.out.println("Capture screenshot");
	}

}
