package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HotelBookingHomePage {

    /**
     *
     * We use Page Factory pattern to initialize web elements which are defined in
     * Page Objects.
     */

    public HotelBookingHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
