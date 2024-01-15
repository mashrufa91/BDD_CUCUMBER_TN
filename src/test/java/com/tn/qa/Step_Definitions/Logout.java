package com.tn.qa.Step_Definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.tn.qa.Pages.AccountPage;
import com.tn.qa.Pages.HomePage;
import com.tn.qa.Pages.LoginPage;
import com.tn.qa.Pages.LogoutPage;
import com.tn.qa.driver_Factory.DriverFactory_Code;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout {
	public WebDriver driver;
public  HomePage homepage;
public AccountPage accountpage;
public LoginPage loginpage;
public LogoutPage logoutpage;


@Given("User goes to LoginPage")
public void user_navigates_to_loginPage(){

        driver = DriverFactory_Code.getDriver();
        HomePage homepage = new HomePage(driver);
        homepage.clickOnMyAccount();
        LoginPage loginpage = new LoginPage(driver);
        loginpage = homepage.selectLoginOption();

    }


@When("User enters valid email address for logout {string}")
public void user_enters_valid_email(String emailText){
    LoginPage loginpage = new LoginPage(driver);
    loginpage.enterEmail(emailText);

}

@And("User enters a valid password for logout {string}")
    public void user_enters_valid_password( String passwordText){
    LoginPage loginpage = new LoginPage(driver);
    loginpage.enterPassword(passwordText);

    }
  @When("User clicks Login")
public void user_clicks_login(){
     LoginPage loginpage = new LoginPage(driver);
     AccountPage accountpage = new AccountPage(driver);
     accountpage = loginpage.clickOnLoginButton();

 }

@Then("User is directed to AccountPage")
     public void user_is_navigated_to_accountpage() {
    AccountPage accountpage = new AccountPage(driver);
    Assert.assertTrue(accountpage.getDisplayStatusOfEditAccountInfo());

}


	@When("User clicks on MyAccount")
	public void user_clicks_on_my_account() {
		accountpage= new AccountPage(driver);
		accountpage.clickOnMyAccount();
	    
	}

	@When("User clicks on LogOut Button")
	public void user_clicks_on_log_out_button() {
		accountpage= new AccountPage(driver);
		accountpage.clickOnLogout();
	      
	}

	@Then("User is navigated to logout page")
	public void user_is_navigated_to_logout_page() {
		logoutpage=new LogoutPage(driver);
	    logoutpage.getDisplayStatusOfAccountLogout();
	}

}
