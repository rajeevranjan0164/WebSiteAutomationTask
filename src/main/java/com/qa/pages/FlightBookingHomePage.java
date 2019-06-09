package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FlightBookingHomePage {

    /**
     *
     * We use Page Factory pattern to initialize web elements which are defined in
     * Page Objects.
     */

    public FlightBookingHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
