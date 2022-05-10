package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @FindBy(id = "Email")
    WebElement emailField;
    @FindBy(name = "Password")
    WebElement passwordField;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;



    public String getWelcomeText() {
        Reporter.log("getWelcomeText " + welcomeText.toString());

        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email) {
        Reporter.log("enterEmailId " + emailField.toString());

        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        Reporter.log("enterPassword " + passwordField.toString());

        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        Reporter.log("clickOnLoginButton " + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        Reporter.log("getErrorMessage " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }
}
