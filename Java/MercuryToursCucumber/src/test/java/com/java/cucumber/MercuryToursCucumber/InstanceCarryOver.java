package com.java.cucumber.MercuryToursCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InstanceCarryOver {
	
	protected static WebDriver driver;
	
	protected  WebDriver getDriver() {
		if (driver == null) {
			driver = new FirefoxDriver();
		}
		return driver;
	}
	
	 protected WebDriver closeDriver() {
		  if (driver != null){ //instanciated driver for the first time
		   driver.close();
		  }
		  return driver=null;
	 }
}
