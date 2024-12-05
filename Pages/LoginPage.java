package FrameworkPrep.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage
{
    WebDriver driver;
    Actions act2;
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        this.act2=new Actions(driver);
    }

    public void signupPage()
    {
        WebElement emailele = driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
        WebElement pwd = driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
        WebElement loginele = driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));

        //performing actions
        act2.sendKeys(emailele, "byunus9911@automation.com").perform();
        act2.sendKeys(pwd, "67676767").perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try
        {
            act2.click(loginele).perform();
        } catch (StaleElementReferenceException e)
        {
            loginele=wait.until(ExpectedConditions.visibilityOf(loginele));
            loginele.click();
        }



    }
}
