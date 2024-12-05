package FrameworkPrep.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtil
{
    public static void selectDropDown(By loc, String value,WebDriver driver)
    {
        WebElement ele =  driver.findElement(loc);
        Select s1=new Select(ele);
        s1.selectByVisibleText(value);
    }
    public static void clickOnElement(WebDriver driver,By loc)
    {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement newsletter=driver.findElement(loc);
        js.executeScript("arguments[0].click()",newsletter);
    }

}
