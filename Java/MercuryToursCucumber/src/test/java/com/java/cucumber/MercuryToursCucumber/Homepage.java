package com.java.cucumber.MercuryToursCucumber;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;
	
	TestData testdata = new TestData(driver);
	
	String navContainer = "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/*";
	
	public Homepage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * 
	 */
	public void checkLinks() {
		List<WebElement> aList = driver.findElements(By.xpath(navContainer));
		for (int i = 0; i < aList.size(); i++){
			aList.get(i).click();
			Assert.assertTrue("Check text is correct", driver.findElement(By.tagName("body")).getText().contains(testdata.checklinksData(i)));
			driver.navigate().back();
			aList = driver.findElements(By.xpath(navContainer));
		}
	}

}
