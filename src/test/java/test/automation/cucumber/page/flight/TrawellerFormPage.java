package test.automation.cucumber.page.flight;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class TrawellerFormPage extends AbstractFlightsPage {

    @FindBy(id = "inputName")
    private WebElement nameField;

    @FindBy(xpath = "//input[@value='Purchase Flight']")
    private WebElement purchaseFlightButton;
    @FindBy (id = "address")
    private WebElement addressField;
    @FindBy (id = "city")
    private WebElement cityField;
    @FindBy (id = "state")
    private WebElement stateField;

    public TrawellerFormPage(WebDriver driver) {
        super(driver);
    }


    public OrderSummaryPage clickPurchaseFlight() {
        purchaseFlightButton.click();
        return new OrderSummaryPage(driver);
    }

    public TrawellerFormPage clickPurchaseFlightNoRedirect() {
        purchaseFlightButton.click();
        return this;
    }

    public TrawellerFormPage setUserName(String textName) {
        nameField.sendKeys(textName);
        return this;
    }

    public TrawellerFormPage setAddress(String address) {
        addressField.sendKeys(address);
        return this;
    }

    public TrawellerFormPage setCity(String city) {
        cityField.sendKeys(city);
        return this;
    }

    public TrawellerFormPage setState(String state) {
        stateField.sendKeys(state);
        return this;
    }
}
