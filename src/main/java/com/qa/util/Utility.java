package com.qa.util;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Utility {

    private static WebDriver driver;

    /*
     * custom clickOn method: click on element on the basis of some
     * ExpectedConditions to avoid StaleElementReferenceException
     */
    public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
        new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.elementToBeClickable(locator));
        locator.click();
    }

    /*
     * custom sendKeyValue method: enter value in element on the basis of some
     * ExpectedConditions to avoid StaleElementReferenceException
     */
    public static void sendKeyValue(WebDriver driver, WebElement locator, int timeout, String value) {
        new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.elementToBeClickable(locator));
        locator.sendKeys(value);

    }

    /*
     * custom getWebElement method: get the WebElement on the basis of some
     * ExpectedConditions to avoid StaleElementReferenceException
     */
    public static WebElement getWebElement(WebDriver driver, WebElement locator, int timeout) {
        new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.elementToBeClickable(locator));
        return locator;
    }

    /*
     * custom getWebElements method: get similar WebElements on the basis of some
     * ExpectedConditions to avoid StaleElementReferenceException
     */
    public static List<WebElement> getWebElements(WebDriver driver, WebElement locator, int timeout) {
        new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.elementToBeClickable(locator));
        return driver.findElements((By) locator);
    }

    public static void waitFor(int durationInMilliSeconds) {
        try {
            Thread.sleep(durationInMilliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }


    public static boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
