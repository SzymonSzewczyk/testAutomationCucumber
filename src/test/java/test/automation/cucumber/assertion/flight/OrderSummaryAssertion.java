package test.automation.cucumber.assertion.flight;

import test.automation.cucumber.assertion.common.Assertion;
import test.automation.cucumber.page.flight.OrderSummaryPage;

import static org.testng.Assert.assertTrue;

public class OrderSummaryAssertion extends Assertion<OrderSummaryPage> {
    public OrderSummaryAssertion verifyTextIsPresent(String text) {
        assertTrue(page.getLabelThankYou().getText().contains(text), "There is no text "+text);
        return this;
    }
}
