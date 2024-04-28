package com.streak.parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterXML {
	@Parameters({"browser","env"})
	@Test
	public void getBrowser(String browser,String env)
	{
		System.out.println(browser + "---" + env);
	}

}
