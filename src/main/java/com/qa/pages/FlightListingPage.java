package com.qa.pages;

import com.qa.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightListingPage extends Base {

    @FindBy(xpath = "//*[@id=\"ResultContainer_1_1\"]/section[2]/section/aside[1]/div/div[1]/form/div/div[5]/h5")
    public WebElement bookBtn;

    /**
     *
     * We use Page Factory pattern to initialize web elements which are defined in
     * Page Objects.
     */

    public FlightListingPage() {
        PageFactory.initElements(driver, this);
    }
}
