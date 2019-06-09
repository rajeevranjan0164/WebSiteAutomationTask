package com.qa.pages;

import com.qa.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage extends Base {

    @FindBy(id = "signInButton")
    private WebElement loginButton;

    @FindBy(id = "errors1")
    private WebElement errorMessage;

    @FindBy(linkText = "Hotels")
    private WebElement hotelLink;

    /**
     *
     * We use Page Factory pattern to initialize web elements which are defined in
     * Page Objects.
     */

    public SigninPage() {
        PageFactory.initElements(driver, this);
    }

    public SigninPage clickOnLoginButton() {
        driver.switchTo().frame("modal_window");
        loginButton.click();
        return this;
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }
}


