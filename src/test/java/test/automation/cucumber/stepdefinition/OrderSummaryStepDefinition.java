package test.automation.cucumber.stepdefinition;

import cucumber.api.java.en.Then;
import test.automation.cucumber.assertion.flight.OrderSummaryAssertion;
import test.automation.cucumber.page.flight.OrderSummaryPage;
import test.automation.cucumber.stepdefinition.common.StepDefinition;

public class OrderSummaryStepDefinition extends StepDefinition {

    @Then("Text is displayed: {string}")
    public void textIsDisplayed(String expectedText) {
        new OrderSummaryPage(driverHandler.getDriver())
            .check(new OrderSummaryAssertion())
            .verifyTextIsPresent(expectedText);
    }
}
