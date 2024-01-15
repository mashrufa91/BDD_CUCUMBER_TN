package com.tn.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProductPage {
    public WebDriver driver;

    @FindBy(linkText = "HP LP3065")
    private WebElement validProduct;



    @FindBy(xpath="//div[@class='button-group']/button[1]")
    private WebElement addToCartButton;



    public SearchProductPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean verifyDisplayStatusOfValidProduct() {
        boolean presenceValidProduct = validProduct.isDisplayed();
        return presenceValidProduct;
    }

    public ProductInfoPage clickOnAddtoCart() {
        addToCartButton.click();
        return new ProductInfoPage(driver);
    }

}

