package org.epam.onboarding.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SeleniumLocaters {

    WebDriver driver;
    SeleniumUtilClass seleniumUtilClass;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test(priority = 1)
    public void openUrl() {
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/elements");
    }

    @Test(priority = 2,dependsOnMethods = "openUrl")
    public void textBoxTests() {
        seleniumUtilClass = new SeleniumUtilClass();
        seleniumUtilClass.verifyTextBox(driver, LocatorClass.textLink);
        seleniumUtilClass.enterInput(driver,LocatorClass.fullNameText,"Sopan");
        seleniumUtilClass.enterInput(driver,LocatorClass.emailText,"Sopan@s.com");
        seleniumUtilClass.enterInput(driver,LocatorClass.currentAddressText,"Indore");
        seleniumUtilClass.enterInput(driver,LocatorClass.permAddressText,"Indore");
        seleniumUtilClass.implecitWait(driver,10);
        seleniumUtilClass.scrollToElementUp(driver);
        seleniumUtilClass.clickButton(driver,LocatorClass.textSubmit);
    }
    @Test(priority = 3,dependsOnMethods = "textBoxTests")
    public void checkBoxTest(){
        seleniumUtilClass.verifyCheckBox(driver,LocatorClass.checkbox);
        seleniumUtilClass.implecitWait(driver,10);
        seleniumUtilClass.clickElement(driver,LocatorClass.expandButton);
        seleniumUtilClass.clickElement(driver,LocatorClass.commandCheck);
        seleniumUtilClass.clickElement(driver,LocatorClass.reactCheck);
        seleniumUtilClass.clickElement(driver,LocatorClass.classifiedCheck);
    }

    @Test(priority = 4,dependsOnMethods = "checkBoxTest")
    public void radioButtonTest(){

    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
}
