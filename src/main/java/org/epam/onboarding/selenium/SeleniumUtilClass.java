package org.epam.onboarding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SeleniumUtilClass {
    public void verifyTextBox(WebDriver driver, String locator) {
        WebElement element = driver.findElement(By.xpath(locator));
        element.click();
    }
    public void clickElement(WebDriver driver, String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    public void clickButton(WebDriver driver, String locator) {
        driver.findElement(By.id(locator)).click();
    }

    public void enterInput(WebDriver driver, String locator, String text) {
        driver.findElement(By.id(locator)).sendKeys(text);
    }

    public void verifyCheckBox(WebDriver driver, String locator) {
        WebElement element = driver.findElement(By.xpath(locator));
        element.click();
    }

    public void verifyRadioButton(WebDriver driver, String locator) {
        driver.findElement(By.id(locator)).click();
    }

    public void implecitWait(WebDriver driver, int timeout) {
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);

    }

    public void scrollToElementUp(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
    }

    public void scrollToElementDown(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-300)");
    }
}
