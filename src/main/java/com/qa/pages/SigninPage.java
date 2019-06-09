package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {

    /**
     *
     * We use Page Factory pattern to initialize web elements which are defined in
     * Page Objects.
     */

    public SigninPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
