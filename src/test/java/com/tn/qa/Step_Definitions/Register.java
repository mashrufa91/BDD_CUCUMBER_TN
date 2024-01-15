package com.tn.qa.Step_Definitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.tn.qa.Pages.AccountSuccessPage;
import com.tn.qa.Pages.HomePage;
import com.tn.qa.Pages.RegisterPage;
import com.tn.qa.Utilities.Util;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	 public WebDriver driver;

	    @Given("User navigates to Register page")
	    public void user_navigates_to_register_page() {
	        driver = com.tn.qa.driver_Factory.DriverFactory_Code.getDriver();
	      HomePage homepage = new HomePage(driver);
	        homepage.clickOnMyAccount();
	        //driver.findElement(By.linkText("My Account")).click();
	        homepage.selectRegisterOption();
	        //driver.findElement(By.linkText("Register")).click();
	    }
	    @When("User enters below mandatory fields")
	    public void user_enters_below_mandatory_fields(io.cucumber.datatable.DataTable dataTable) {
	      Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
	      RegisterPage registerpage = new RegisterPage(driver);
	      registerpage.enterFirstName(dataMap.get("firstname"));
	      registerpage.enterLastName(dataMap.get("firstname"));
	      registerpage.enterEmail(Util.emailWithDateTimeStamp());
	      registerpage.enterTelephone(dataMap.get("telephone"));
	      registerpage.enterPassword(dataMap.get("password"));
	      registerpage.enterConfirmPassword(dataMap.get("confirmpassword"));
	      
	      
	      
	       // driver.findElement(By.id("input-firstname")).sendKeys(dataMap.get("firstname"));
	       // driver.findElement(By.id("input-lastname")).sendKeys(dataMap.get("lastname"));
	       // driver.findElement(By.id("input-email")).sendKeys(Util.emailWithDateTimeStamp());
	       // driver.findElement(By.id("input-telephone")).sendKeys(dataMap.get("telephone"));
	       // driver.findElement(By.id("input-password")).sendKeys(dataMap.get("password"));
	       // driver.findElement(By.id("input-confirm")).sendKeys(dataMap.get("confirmpassword"));
	    }
	    @And("User selects Privacy Policy checkbox")
        public void user_selects_privacy_policy_checkbox() {
                RegisterPage registerpage = new RegisterPage(driver);
                registerpage.selectPrivacyPolicyCheckBox();
        }

        @And("User clicks on Continue button")
        public void user_clicks_on_continue_button() {
                RegisterPage registerpage = new RegisterPage(driver);
                registerpage.clickContinueButton();
        }

        @Then("User account gets created successfully")
        public void user_account_gets_created_successfully() {
                AccountSuccessPage accountsuccesspage = new AccountSuccessPage(driver);
                Assert.assertTrue(accountsuccesspage.verifyDisplayStatusAccountSuccessMessage());
        }
}
