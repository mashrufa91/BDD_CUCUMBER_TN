package com.tn.qa.Step_Definitions;

import org.openqa.selenium.WebDriver;

import com.tn.qa.Pages.HomePage;
import com.tn.qa.Pages.SearchProductPage;
import com.tn.qa.driver_Factory.DriverFactory_Code;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProduct {
	public WebDriver driver;
	public HomePage homepage;
	public SearchProductPage searchproductpage;
	
	@Given("User opens the application")
	public void user_opens_the_application() {
		  driver = DriverFactory_Code.getDriver();
	}

	@When("User enters valid product {string}")
	public void user_enters_valid_product(String validProductText) {
		homepage = new HomePage(driver);
        homepage.enterValidProduct(validProductText);
	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
		 searchproductpage = homepage.clickOnSearchIcon();
	}

	@Then("User gets valid product info display in search page")
	public void user_gets_valid_product_info_display_in_search_page() {
		 searchproductpage= new SearchProductPage(driver);
		 searchproductpage.verifyDisplayStatusOfValidProduct();
	}

}
