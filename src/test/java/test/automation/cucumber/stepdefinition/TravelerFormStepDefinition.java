package test.automation.cucumber.stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.automation.cucumber.page.flight.TrawellerFormPage;
import test.automation.cucumber.stepdefinition.common.StepDefinition;

public class TravelerFormStepDefinition extends StepDefinition {

    @When("Purchase form is submitted using name {string}")
    public void purchaseFormIsSubmittedUsingName(String name) {
        new TrawellerFormPage(driverHandler.getDriver())
                .setUserName(name)
                .clickPurchaseFlight();
    }

    @When("Submit without filling the form")
    public void submitWithoutFillingTheForm() {
        new TrawellerFormPage(driverHandler.getDriver())
                .clickPurchaseFlightNoRedirect();
    }

    @Then("Form not filled text is displayed")
    public void formNotFilledTextIsDisplayed() {
        //assertion for validation that needs to be implemented on the page
    }

    @When("Purchase form is submitted using {string} {string} {string} {string}")
    public void purchaseFormIsSubmittedUsing(String name, String address, String city, String state) {
        new TrawellerFormPage(driverHandler.getDriver())
                .setUserName(name)
                .setAddress(address)
                .setCity(city)
                .setState(state)
                .clickPurchaseFlight();
    }

    @Then("Form is submitted for the correct data {string} {string} {string} {string}")
    public void formIsSubmittedForTheCorrectData(String name, String address, String city, String state) {
        //assertion for summary that needs to be implemented on the page
    }
}
