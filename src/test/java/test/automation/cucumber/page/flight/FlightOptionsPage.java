package test.automation.cucumber.page.flight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test.automation.cucumber.assertion.flight.FlightOptionsAssertion;

import javax.swing.*;
import java.util.*;

public class FlightOptionsPage extends AbstractFlightsPage {

    @FindBy(xpath = "//tbody//td[2]")
    private List<WebElement> flights;

    @FindBy(xpath = "//tbody/tr")
    private List<WebElement> rows;

    @FindBy(css = ".btn-small")
    private List<WebElement> buttons;
    @FindBy (xpath = "//h3")
    private WebElement titleWithCitiesFromAndTo;
    private final static String XPATH_FOR_PRICE_PER_AIRLINE ="//tbody//td[6][..//td[contains(text(),'%s')]]";
    private final static String XPATH_FOR_AIRLINE_PER_FLIGHT_NO = "//tbody//td[3][..//td[contains(text(),'%s')]]";


    public FlightOptionsPage(WebDriver driver) {
        super(driver);
    }

    public TrawellerFormPage clickFlightButton(int rowNumber) {
        buttons.get(rowNumber).click();
        return new TrawellerFormPage(driver);
    }

    public List<WebElement> getFlights() {
        return flights;
    }

    public WebElement getActualPriceForAirline(String airline) {
        return driver.findElement(By.xpath(String.format(XPATH_FOR_PRICE_PER_AIRLINE, airline)));
    }

    public WebElement getTitleWithCitiesFromAndTo() {
        return titleWithCitiesFromAndTo;
    }

    public WebElement getAirline(String flightNo) {
        return driver.findElement(By.xpath(String.format(XPATH_FOR_AIRLINE_PER_FLIGHT_NO, flightNo)));
    }

}
