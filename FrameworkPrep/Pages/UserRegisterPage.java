package FrameworkPrep.Pages;

import FrameworkPrep.Utility.SeleniumUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UserRegisterPage
{
    WebDriver driver;
    JavascriptExecutor js;

    By days= By.id("days");
    By months = By.id("months");
    By years = By.id("years");
    By name = By.name("name");
    public UserRegisterPage(WebDriver driver)
    {
        this.driver=driver;
        this.js=(JavascriptExecutor) driver;
    }
    public void regUser()
    {
        WebElement newUser=driver.findElement(By.xpath("//input[@data-qa=\"signup-name\"]"));
        js.executeScript("arguments[0].value='Yunus'",newUser);
        WebElement nameEel=driver.findElement(By.xpath("//form[@action=\"/signup\"]//input[@name=\"email\"]"));
       // WebElement nameEel=driver.findElement(By.xpath("//form[@action=\"/signup\"]//input[@name=\"email\"]"));
        js.executeScript("arguments[0].value='byunus9101@gmail.com'",nameEel);
        WebElement signupEle=driver.findElement(By.xpath("//form[@action=\"/signup\"]//button[@type=\"submit\"]"));
        SeleniumUtil.clickOnElement(driver,By.xpath("//button[@data-qa=\"signup-button\"]"));



        SeleniumUtil.clickOnElement(driver,By.id("id_gender1"));

        WebElement password=driver.findElement(By.id("password"));
        js.executeScript("arguments[0].value='yunus1111'",password);
        SeleniumUtil.selectDropDown(days,"23",driver);
        SeleniumUtil.selectDropDown(months,"March",driver);
        SeleniumUtil.selectDropDown(years,"1999",driver);

        SeleniumUtil.clickOnElement(driver,By.id("newsletter"));


        SeleniumUtil.clickOnElement(driver,By.id("optin"));

        WebElement firstName=driver.findElement(By.id("first_name"));

        js.executeScript("arguments[0].value='shaikh'",firstName);
        WebElement lastName=driver.findElement(By.id("last_name"));

        js.executeScript("arguments[0].value='basheer'",lastName);
        WebElement company=driver.findElement(By.id("company"));
        js.executeScript("arguments[0].value='techinfo'",company);
        WebElement Ads1=driver.findElement(By.id("address1"));
        js.executeScript("arguments[0].value='singar'",Ads1);
        WebElement Ads2=driver.findElement(By.id("address2"));

        js.executeScript("arguments[0].value='atp'",Ads2);
        WebElement state=driver.findElement(By.id("state"));

        js.executeScript("arguments[0].value='AP'",state);
        WebElement city=driver.findElement(By.id("city"));

        js.executeScript("arguments[0].value='Anantapur'",city);
        WebElement zipcode=driver.findElement(By.id("zipcode"));

        js.executeScript("arguments[0].value='516888'",zipcode);
        WebElement mobile=driver.findElement(By.id("mobile_number"));

        js.executeScript("arguments[0].value='9099090999'",mobile);

        SeleniumUtil.clickOnElement(driver,By.xpath("//button[@data-qa=\"create-account\"]"));

        SeleniumUtil.clickOnElement(driver,By.xpath("//a[@data-qa=\"continue-button\"]"));
    }
}
