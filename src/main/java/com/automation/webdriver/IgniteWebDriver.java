package com.automation.webdriver;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import com.automation.applications.Application;

public class IgniteWebDriver {

	@BeforeMethod
	public void igniteDriver(Method m, ITestContext ctx){
		Application a = m.getAnnotation(Application.class);
		String x = a.application();
		System.out.println("BeforeTest");
		WebDriverInstance instance = new WebDriverInstance();
		
	}
}
