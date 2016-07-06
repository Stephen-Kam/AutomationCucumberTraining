package com.java.cucumber.MercuryToursCucumber;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TestData {
	
	WebDriver driver;
	
	public TestData(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String checklinksData(int i){
	List<String> checklinksData = new ArrayList<String>();
	checklinksData.add("Welcome back to Mercury Tours!");
	checklinksData.add("To create your account");
	checklinksData.add("This section of our web site is currently under construction");
	checklinksData.add("This section of our web site is currently under construction");
	
	return checklinksData.get(i);
	}
	
}
