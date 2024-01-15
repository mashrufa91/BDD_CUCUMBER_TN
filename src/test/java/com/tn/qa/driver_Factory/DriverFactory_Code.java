
package com.tn.qa.driver_Factory;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory_Code {

    public static WebDriver driver;
    public static ChromeOptions options;
    public static String browser;

    public static void initializeBrowser(String browser) {
        browser = browser;

       // if (browser == null) {
         //   browser = "chrome"; // Set a default browser
       // }

        if (browser.equals("chrome")) {
            options = new ChromeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.EAGER);
            options.addArguments("--start-maximized");
            options.addArguments("--incognito");
            driver = new ChromeDriver(options);
        } else if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equals("edge")) {
            driver = new EdgeDriver();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
