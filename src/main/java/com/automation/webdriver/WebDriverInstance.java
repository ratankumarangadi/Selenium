package com.automation.webdriver;

public class WebDriverInstance extends IgniteWebDriver {

	public static final ThreadLocal<WebDriverDetails> driverDetails = new ThreadLocal<WebDriverDetails>();
	WebDriverConfiguration driverConfiguration;
	
}
