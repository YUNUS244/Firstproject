package FrameworkPrep.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest
{
    WebDriver driver;
    @BeforeMethod
    public void openBrowser()
    {
        driver=new ChromeDriver();
        driver.get("https://automationexercise.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void closeBrowser()
    {
        driver.close();
    }
}
