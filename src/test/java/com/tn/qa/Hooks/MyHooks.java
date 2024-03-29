package com.tn.qa.Hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import com.tn.qa.driver_Factory.DriverFactory_Code;

import java.time.Duration;

public class MyHooks {
    public WebDriver driver;

    @Before
    public void setup(){
        DriverFactory_Code.initializeBrowser("chrome");
        driver = DriverFactory_Code.getDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo");


    }

    @After
    public void tearDown(){

        driver.quit();
    }


}