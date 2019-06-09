package com.qa.test;

import com.qa.base.Base;
import com.qa.pages.HotelBookingHomePage;
import com.qa.pages.SearchHotelPage;
import com.sun.javafx.PlatformUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.qa.util.Utility.waitFor;


public class HotelBookingTest extends Base {

    HotelBookingHomePage hotelBookingHomePage;
    SearchHotelPage searchHotelPage;

    public HotelBookingTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        hotelBookingHomePage = new HotelBookingHomePage();
        searchHotelPage = new SearchHotelPage();
    }

    @Test
    public void shouldBeAbleToSearchForHotels() {
        hotelBookingHomePage.clickOnHotelBooking();
        searchHotelPage.sendWhereToGo("Indiranagar, Bangalore");
        waitFor(5000);
        searchHotelPage.selectSearchResult();
        searchHotelPage.clickOnSearchButton();
        Assert.assertTrue(searchHotelPage.placeName.isDisplayed(), "Place Name is not displaying");
    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }
}
