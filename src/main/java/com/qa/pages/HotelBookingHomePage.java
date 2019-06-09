package com.qa.pages;

import com.qa.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBookingHomePage extends Base {

    /**
     *
     * We use Page Factory pattern to initialize web elements which are defined in
     * Page Objects.
     */

    public HotelBookingHomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Hotels")
    public WebElement hotelLink;

    public SearchHotelPage clickOnHotelBooking() {
        hotelLink.click();
        return new SearchHotelPage();
    }
}