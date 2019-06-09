package com.qa.test;

import com.qa.base.Base;
import com.qa.pages.HotelBookingHomePage;
import com.qa.pages.SigninPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInTest extends Base {

    HotelBookingHomePage hotelBookingHomePage;
    SigninPage signinPage;

    public SignInTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        hotelBookingHomePage = new HotelBookingHomePage();
        signinPage = new SigninPage();
    }

    @Test
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() {
        hotelBookingHomePage.clickonLoginOnHomePage();
        signinPage.clickOnLoginButton();
        String errorMeeage = signinPage.getErrorMessage();
        Assert.assertTrue(errorMeeage.contains("There were errors in your submission"), "Error Message is not Showing");
    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }
}
