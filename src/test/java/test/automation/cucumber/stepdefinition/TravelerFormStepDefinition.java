package test.automation.cucumber.stepdefinition;

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

}
