package com.qa.pages;

import com.qa.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightBookingHomePage extends Base {

    @FindBy(id = "OneWay")
    private WebElement oneWay;

    @FindBy(id = "FromTag")
    private WebElement from;

    @FindBy(id = "ToTag")
    private WebElement too;

    @FindBy(xpath = "//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a")
    private WebElement datePicker;

    @FindBy(id = "SearchBtn")
    private WebElement searchbtn;

    /**
     *
     * We use Page Factory pattern to initialize web elements which are defined in
     * Page Objects.
     */

    public FlightBookingHomePage() {
        PageFactory.initElements(driver, this);
    }

    public FlightBookingHomePage clickOnOneWay() {
        oneWay.click();
        return this;
    }

    public FlightBookingHomePage sendInFrom(String initial) {
        from.clear();
        from.sendKeys(initial);
        return this;
    }

    public FlightBookingHomePage sendInTo(String fin) {
        too.clear();
        too.sendKeys(fin);
        return this;
    }

    public FlightBookingHomePage pickDate() {
        datePicker.click();
        return this;
    }

    public FlightListingPage clickOnSearchBtn() {
        searchbtn.click();
        return new FlightListingPage();
    }
}
