package com.qa.test;

import com.qa.base.Base;
import com.qa.pages.HotelBookingHomePage;
import com.qa.pages.SearchHotelPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


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
        searchHotelPage.selectSearchResult();
        searchHotelPage.clickOnSearchButton();
        Assert.assertTrue(searchHotelPage.placeName.isDisplayed(), "Place Name is not displaying");
    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }
}
