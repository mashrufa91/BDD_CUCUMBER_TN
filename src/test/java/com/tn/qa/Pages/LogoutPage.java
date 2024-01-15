package com.tn.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
public WebDriver driver;
	
	@FindBy (xpath= "//div[@id='content']/p[1]")	
	public WebElement logoutStatus;
	
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public boolean getDisplayStatusOfAccountLogout() {
		boolean displayStatus = logoutStatus.isDisplayed();
		return displayStatus;
	}	
}
