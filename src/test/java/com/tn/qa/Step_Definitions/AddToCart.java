package com.tn.qa.Step_Definitions;

import org.openqa.selenium.WebDriver;
import com.tn.qa.Pages.AddToCartPage;
import com.tn.qa.Pages.HomePage;
import com.tn.qa.Pages.SearchProductPage;
import com.tn.qa.driver_Factory.DriverFactory_Code;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddToCart {

public WebDriver driver;
public HomePage homepage;
public SearchProductPage searchproductpage;
public AddToCartPage addtocartpage;


	@Given("User opens the application for add to cart")
	public void user_opens_the_application() {
		  driver = DriverFactory_Code.getDriver();
	}
	@When("User enters valid product in the search box {string}")
	public void user_enters_valid_product_in_the_search_box(String validProductText) {
		homepage = new HomePage(driver);
        homepage.enterValidProduct(validProductText);
	}
	@And("User clicks on the search button for add to cart")
	public void user_clicks_on_search_button() {
			 searchproductpage = homepage.clickOnSearchIcon();
		}
	
	@Then ("User gets valid product info displayed")
	public void user_gets_valid_product_info_displayed() {
		searchproductpage= new SearchProductPage(driver);
		 searchproductpage.verifyDisplayStatusOfValidProduct();
	}
	@When("User clicks on Add to Cart Button")
	public void user_clicks_on_add_to_cart_button() throws Exception {
		searchproductpage= new SearchProductPage(driver);
		Thread.sleep(2000);
		searchproductpage.clickOnAddtoCart();   
	}

	@When("User clicks on Add to Cart button for checkout")
	public void user_clicks_on_add_to_cart_button_for_checkout() {
		addtocartpage= new AddToCartPage(driver);
	    addtocartpage.clickOnAddForCheckout();
	}

	@Then("product gets added to the cart")
	public void product_gets_added_to_the_cart() {
		addtocartpage= new AddToCartPage(driver);
	 String ActualMessage= addtocartpage.varifyMessageofProductAddedtext();
	 String ExpectedMessage= "Success: You have added HP LP3065 to your shopping cart!";
	 Assert.assertTrue(ActualMessage.contains(ExpectedMessage));


	}
}
