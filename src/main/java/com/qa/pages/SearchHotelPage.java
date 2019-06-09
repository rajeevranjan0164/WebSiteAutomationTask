package com.qa.pages;

import com.qa.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends Base {

    @FindAll({
            @FindBy(id = "Tags"),
            @FindBy(name = "from")
    })
    private WebElement localityTextBox;

    @FindBy(xpath = "//a[text()='Indiranagar, Bangalore, Karnataka, India']")
    private WebElement selectFirst;

    @FindBy(id = "SearchHotelsButton")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id='Home']//section//div//div//div[1]//h1")
    private WebElement header;

    @FindBy(xpath = "//a[text()='Check availability']")
    public WebElement placeName;

    public SearchHotelPage() {
        PageFactory.initElements(driver, this);
    }

    public SearchHotelPage sendWhereToGo(String place) {
        localityTextBox.sendKeys(place);
        return this;
    }

    public SearchHotelPage selectSearchResult() {
        selectFirst.click();
        return this;
    }

    public SearchHotelPage clickOnSearchButton() {
        header.click();
        searchButton.click();
        return this;
    }
}
