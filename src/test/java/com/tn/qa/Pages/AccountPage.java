package com.tn.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	
	public WebDriver driver;
	
	
	
	@FindBy(linkText = "Edit your account information")
	private WebElement editYourAccountInfo;
	
	@FindBy(linkText = "My Account")
	private WebElement myAccountDropDown;
	
	@FindBy (linkText= "Logout")
	private WebElement logOutButton;
	
	
	public AccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean getDisplayStatusOfEditAccountInfo() {
		boolean displayStatus = editYourAccountInfo.isDisplayed();
		return displayStatus;
	}
	public void clickOnMyAccount() {
		myAccountDropDown.click();
	}
	
	public void clickOnLogout() {
		logOutButton.click();
	}
	
	
	}


