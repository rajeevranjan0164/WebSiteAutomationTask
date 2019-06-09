package com.qa.test;

import com.qa.base.Base;
import com.qa.pages.FlightBookingHomePage;
import com.qa.pages.FlightListingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class FlightBookingTest extends Base {

    FlightBookingHomePage flightBookingHomePage;
    FlightListingPage flightListingPage;

    public FlightBookingTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        flightBookingHomePage = new FlightBookingHomePage();
        flightListingPage = new FlightListingPage();
    }
    @Test
    public void testThatResultsAppearForAOneWayJourney() {
       flightBookingHomePage.clickOnOneWay();
       flightBookingHomePage.sendInFrom("bangalore");
        List<WebElement> originOptions = driver.findElement(By.id("ui-id-1")).findElements(By.tagName("li"));
        originOptions.get(0).click();

        flightBookingHomePage.sendInTo("Delhi");

        //select the first item from the destination auto complete list
        List<WebElement> destinationOptions = driver.findElement(By.id("ui-id-2")).findElements(By.tagName("li"));
        destinationOptions.get(0).click();
        flightBookingHomePage.pickDate();
        flightBookingHomePage.clickOnSearchBtn();

        //verify that result appears for the provided journey search
        Assert.assertTrue(flightListingPage.bookBtn.isDisplayed(), "Book Options is not there");
    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }
}
