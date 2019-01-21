package test.automation.cucumber.stepdefinition.common;

import com.google.inject.Inject;
import test.automation.cucumber.config.WebDriverHandler;

public abstract class StepDefinition {
    @Inject
    protected WebDriverHandler driverHandler;
}
