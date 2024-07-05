package com.streak.Day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAndGet {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.google.ca/");
		driver.get("https://www.wikipedia.org/");
		driver.navigate().back();

//		
//		driver.navigate().to("https://www.google.ca/");
//
//		driver.navigate().to("https://www.wikipedia.org/");

	}

}
