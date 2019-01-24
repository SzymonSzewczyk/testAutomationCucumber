package test.automation.cucumber.assertion.flight;

import org.openqa.selenium.WebElement;
import test.automation.cucumber.assertion.common.Assertion;
import test.automation.cucumber.page.flight.FlightOptionsPage;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class FlightOptionsAssertion extends Assertion<FlightOptionsPage> {

    public FlightOptionsAssertion verifyFlightNumberOrder(List<String> expectedFlights) {
        List<String> actualFlights = page.getFlights().stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        assertEquals("Flights are not in expected order", expectedFlights, actualFlights);
        return this;
    }

    public FlightOptionsAssertion verifyFlightNumbersUnordered(Set<String> expectedFlights) {
        Set<String> actualFlights = page.getFlights().stream()
                .map(WebElement::getText)
                .collect(Collectors.toSet());
        assertEquals("Flights are not in expected order", expectedFlights, actualFlights);
        return this;
    }

    public FlightOptionsAssertion verifyWaitUntilCanBeUsed() {
        assertTrue(page.waitUntil(condition -> !page.getFlights().isEmpty()), "Flights table is empty!");
        return this;
    }

    public FlightOptionsAssertion verifyPriceForAirline(String airline, String price) {
        assertEquals("There is no price "+price+" for "+airline +".", page.getActualPriceForAirline(airline).getText(), price);
        return this;
    }

    public FlightOptionsAssertion verifyFromToCities(String fromCity, String toCity) {
        assertEquals("Displayed cities From ("+fromCity+")or To ("+toCity+") are different than actual.",
                page.getTitleWithCitiesFromAndTo().getText(), "Flights from "+fromCity+" to "+toCity+":");

        return this;
    }

    public FlightOptionsAssertion verifyAirlineForFlightNo(String airline, String flightNo) {
        assertEquals("flight number \""+flightNo+"\" is not proper for airline: "+airline, page.getAirline(flightNo).getText(), airline);
        return this;
    }
}
