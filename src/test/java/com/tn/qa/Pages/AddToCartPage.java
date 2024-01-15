package com.tn.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
    public WebDriver driver;
    @FindBy(linkText= "HP LP3065")
    private WebElement validProduct;

    //@FindBy(xpath="//button[@id='button-cart']")
    //private WebElement addTocartButton;

    @FindBy(css= "div.alert.alert-success.alert-dismissible")
    private WebElement validProductSuccessfulyAdded;

   
    @FindBy(xpath= "//div[@class='form-group']/button[1]")
    private WebElement addForcheckout;

    @FindBy(linkText= "Checkout")
    private WebElement checkOut;


    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    
    public void clickOnAddForCheckout() {
        addForcheckout.click();

    }
    public void clickOnCheckout() {
        checkOut.click();

    }


	public String varifyMessageofProductAddedtext() {
		 String validProduct= validProductSuccessfulyAdded.getText();
	        return validProduct;}

		
	}
