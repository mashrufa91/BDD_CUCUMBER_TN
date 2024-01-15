package com.tn.qa.Step_Definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.tn.qa.Pages.AccountPage;
import com.tn.qa.Pages.HomePage;
import com.tn.qa.Pages.LoginPage;
import com.tn.qa.driver_Factory.DriverFactory_Code;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
   

public WebDriver driver;

@Given("User navigates to LoginPage")
public void user_navigates_to_loginPage(){

        driver = DriverFactory_Code.getDriver();
        HomePage homepage = new HomePage(driver);
        homepage.clickOnMyAccount();
        LoginPage loginpage = new LoginPage(driver);
        loginpage = homepage.selectLoginOption();

    }


@When("User enters valid email {string}")
public void user_enters_valid_email(String emailText){
    LoginPage loginpage = new LoginPage(driver);
    loginpage.enterEmail(emailText);

}

@And("User enters valid password {string}")
    public void user_enters_valid_password( String passwordText){
    LoginPage loginpage = new LoginPage(driver);
    loginpage.enterPassword(passwordText);

    }
 @And("User clicks on Login Button")
public void user_clicks_on_login_button(){
     LoginPage loginpage = new LoginPage(driver);
     AccountPage accountpage = new AccountPage(driver);
     accountpage = loginpage.clickOnLoginButton();

 }

@Then("User is navigated to AccountPage")
     public void user_is_navigated_to_accountpage() {
    AccountPage accountpage = new AccountPage(driver);
    Assert.assertTrue(accountpage.getDisplayStatusOfEditAccountInfo());

}


}

  



