package com.tn.qa.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        dryRun = true,
        monochrome = true,
        features = {"C:\\Users\\sajid\\IntelliJ workspace\\BDD_CUCUMBER_TN\\Features" },
        glue     = {"com.tn.qa.Step_Definitions", "com.tn.qa.Hooks"},
        tags = "@TutorialsNinjaLogin or @TutorialsNinjaRegistration or @TutorialsNinjaSearchProduct or @TutorialsNinjaAddToCart or @TutorialsNinjaLogout",
        plugin = {"pretty", "html:target/site/cucumber-html", "json:target/cucumber1.json"}

   )

public class Runner_TestNG extends AbstractTestNGCucumberTests{

}
