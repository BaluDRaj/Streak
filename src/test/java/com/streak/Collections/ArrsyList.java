package com.streak.Collections;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrsyList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add("balu");
		al.add(102);
		System.out.println(al);
		
		System.out.println("Size before removal :: " + al.size());
		
		al.remove(1);
		
		System.out.println("Size after removal :: " + al.size());
		
		WebDriver driver = new ChromeDriver();
		

	}

}
