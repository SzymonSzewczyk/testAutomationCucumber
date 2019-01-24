package test.automation.cucumber.stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.automation.cucumber.assertion.flight.FlightOptionsAssertion;
import test.automation.cucumber.page.flight.FlightOptionsPage;
import test.automation.cucumber.stepdefinition.common.StepDefinition;

import java.util.List;

public class FlightOptionsStepDefinition extends StepDefinition {

    @Then("Displayed flights order is as follows:")
    public void verifyFlightOrder(List<String> flights) {
        new FlightOptionsPage(driverHandler.getDriver())
            .check(new FlightOptionsAssertion())
            .verifyFlightNumberOrder(flights);
    }

    @When("Flight {int} is selected")
    public void flightNumberIsSelected(int flightIndex) {
        new FlightOptionsPage(driverHandler.getDriver())
                .clickFlightButton(flightIndex);
    }

    @Then("Displayed price for {string} is {string}")
    public void displayedPriceForIs(String airline, String price) {
        new FlightOptionsPage(driverHandler.getDriver())
                .check(new FlightOptionsAssertion())
                .verifyPriceForAirline(airline,price);
    }

    @Then("Text is displayed: Flights from {string} to {string}")
    public void textIsDisplayedFlightsFromTo(String fromCity, String toCity) {
        new FlightOptionsPage((driverHandler.getDriver()))
                .check(new FlightOptionsAssertion())
                .verifyFromToCities(fromCity, toCity);
    }

    @Then("Displayed {string} for {string}")
    public void displayedFor(String airline, String flightNo) {
        new FlightOptionsPage((driverHandler.getDriver()))
                .check(new FlightOptionsAssertion())
                .verifyAirlineForFlightNo(airline, flightNo);
    }
}
