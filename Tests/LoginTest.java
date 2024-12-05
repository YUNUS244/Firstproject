package FrameworkPrep.Tests;

import FrameworkPrep.Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest
{
    @Test
    public void actions()
    {
        LoginPage lp=new LoginPage(driver);
        lp.signupPage();
    }
}
