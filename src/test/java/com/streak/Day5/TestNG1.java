package com.streak.Day5;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG1 {

	@Test(priority = 4, dependsOnMethods = { "secondMethod", "thirdMethod" })
	public void firstMethod() {
		System.out.println("first method");
	}

	@Test(priority = 2)
	public void secondMethod() {
		System.out.println("second method");
		Assert.fail();
	}

	@Test(priority = 0)
	public void thirdMethod() {
		System.out.println("third method");
	}

	@Test(priority = 1)
	public void fourthMethod() {
		System.out.println("fourth method");
	}

	@Test(priority = 3)
	public void fifthMethod() {
		System.out.println("fifth method");
	}

}
