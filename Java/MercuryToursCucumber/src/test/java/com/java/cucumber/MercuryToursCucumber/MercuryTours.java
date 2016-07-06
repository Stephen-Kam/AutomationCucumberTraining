package com.java.cucumber.MercuryToursCucumber;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MercuryTours extends InstanceCarryOver {
	
	WebDriver driver = getDriver();
	Homepage homepage = new Homepage(driver);
	
	@Given("^I am on the Mercury Tours home page$")
	public void getWebPage() throws Throwable {
	    driver.navigate().to("http://newtours.demoaut.com/");
	}

	@When("^I click on each of the top navigation links I will be taken to the right page$")
	public void checkLinks() throws Throwable {
	    homepage.checkLinks();
	}

	@Then("^The driver will close$")
	public void shutdown() throws Throwable {
	    driver.close();
	    
	}

}
