package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    public ComputerPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(tagName = "h1")
    WebElement computerTextField;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement desktopField;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")
    WebElement notebookField;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]/img[1]")
    WebElement softwareField;





    public String computerText(){
        Reporter.log("computerText " + computerTextField.toString());
        return getTextFromElement(computerTextField);
    }
    public void clickOnDesktop(){
        Reporter.log("clickOnDesktop " + desktopField.toString());
        clickOnElement(desktopField);
    }
    public void clickOnNotebook(){
        Reporter.log("clickOnNotebook " + notebookField.toString());
        clickOnElement(notebookField);
    }
    public void clickOnSoftware(){
        Reporter.log("clickOnSoftware " + softwareField.toString());
        clickOnElement(softwareField);
    }

}
