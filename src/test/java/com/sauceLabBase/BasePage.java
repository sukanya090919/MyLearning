package com.sauceLabBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BasePage {
   public WebDriver driver;
    @BeforeSuite
        public void initalizeReportAndWebDriver()
        {
            System.out.println("Report is Initalized");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    @BeforeMethod
    public void launchUrl()
    {
        driver.get("https://www.saucedemo.com/");

    }
   @AfterTest
      public void killSession()
       {
            driver.quit();
        }
    }

