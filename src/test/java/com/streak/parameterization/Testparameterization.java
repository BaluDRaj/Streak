package com.streak.parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testparameterization {

	@Test(dataProvider = "getData")
	public void doLogin(String username, String password) {

		System.out.println(username + "---" + password);

	}

	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "123";
		data[0][1] = "1234";
		data[1][0] = "12345";
		data[1][1] = "12";

		return data;
	}
}
