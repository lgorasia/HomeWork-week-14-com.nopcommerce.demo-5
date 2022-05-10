package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {
    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputerField;
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorSelection;
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramSelection;
    @FindBy(css = "#product_attribute_3_6")
    WebElement hddRadioSelection1;
    @FindBy(css = "#product_attribute_3_7")
    WebElement hddRadioSelection2;
    @FindBy(css = "#product_attribute_4_8")
    WebElement osRadioSelection1;
    @FindBy(css = "#product_attribute_4_9")
    WebElement osRadioSelection2;
    @FindBy(id = "product_attribute_5_10")
    WebElement softwareSelection1;
    @FindBy(css = "#product_attribute_5_11")
    WebElement softwareSelection2;
    @FindBy(css = "#product_attribute_5_12")
    WebElement softwareSelection3;
    @FindBy(css = "#add-to-cart-button-1")
    WebElement addToCartField;
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement addToCartVerificationField;

    public void clickOnBuildYourComputer() {
        Reporter.log("clickOnBuildYourComputer " + buildYourOwnComputerField.toString());
        clickOnElement(buildYourOwnComputerField);
    }

    public void clickOnProcessor(String processor) {
        Reporter.log("clickOnProcessor " + processorSelection.toString());
        sendTextToElement(processorSelection, processor);
    }

    public void selecRamFromFromDropdown(String ram) {
        Reporter.log("selecRamFromFromDropdown " + ramSelection.toString());
        selectByVisibleTextFromDropDown(ramSelection, ram);
    }

    public void clickOnHddRadio(String hdd) {
        Reporter.log("clickOnHddRadio " + hddRadioSelection1.toString());
        if (hdd == "320 GB") {
            clickOnElement(hddRadioSelection1);
        } else {
            clickOnElement(hddRadioSelection2);
        }
    }

    public void osRadio(String os) {
        Reporter.log("osRadio " + osRadioSelection1.toString());
        if (os == "Vista Home [+$50.00] ") {
            clickOnElement(osRadioSelection1);
        } else {
            clickOnElement(osRadioSelection2);
        }
    }


    public void clickSoftware(String software ) {
        Reporter.log("clickSoftware " + softwareSelection1.toString());
        if (software == "Microsoft Office [+$50.00]") {

            clickOnElement(softwareSelection1);
        } else if (software == "Acrobat Reader [+$10.00]") {
            clickOnElement(softwareSelection2);
        } else {
            clickOnElement(softwareSelection3);
        }
    }
    public void clickOnSoftware(){
        Reporter.log("clickOnSoftware " + softwareSelection1.toString());
        clickOnElement(softwareSelection1);
    }

    public void addtocart(){
        Reporter.log("addtocart " + addToCartField.toString());
        clickOnElement(addToCartField);
    }
    public String addToCartVerification(){
        Reporter.log("addToCartVerification " + addToCartVerificationField.toString());
        return getTextFromElement(addToCartVerificationField);
    }

}
