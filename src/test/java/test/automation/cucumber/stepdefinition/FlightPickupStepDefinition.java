package test.automation.cucumber.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import test.automation.cucumber.page.flight.ChooseFlightPage;
import test.automation.cucumber.stepdefinition.common.StepDefinition;

public class FlightPickupStepDefinition extends StepDefinition {

    @Given("Blazedemo choose flight page opened")
    public void chooseFlightPageOpened() {
        new ChooseFlightPage(driverHandler.getDriver(), "http://www.blazedemo.com");
    }

    @When("Flight picked up from {string} to {string}")
    public void pickFlight(String from, String to) {
        new ChooseFlightPage(driverHandler.getDriver())
            .selectDepartureCity(from)
            .selectDestinationCity(to)
            .clickFindFlights();
    }

    @Given("Flight picked from {string} to {string} with flight {int} selected")
    public void flightPickedFromToWithNumberOfRow(String from, String to, int numberOfRow) {
        new ChooseFlightPage(driverHandler.getDriver(), "http://www.blazedemo.com")
                .selectDepartureCity(from)
                .selectDestinationCity(to)
                .clickFindFlights()
                .clickFlightButton(numberOfRow);


    }
}
