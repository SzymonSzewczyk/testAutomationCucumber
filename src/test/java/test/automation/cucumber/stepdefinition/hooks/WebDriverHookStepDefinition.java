package test.automation.cucumber.stepdefinition.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import test.automation.cucumber.config.DriverType;
import test.automation.cucumber.config.LocalWebDriverFactory;
import test.automation.cucumber.config.RemoteWebDriverFactory;
import test.automation.cucumber.config.WebDriverFactory;
import test.automation.cucumber.stepdefinition.common.StepDefinition;

public class WebDriverHookStepDefinition extends StepDefinition {

    @Before(order = 0)
    public void testSetup() {
        driverHandler.setDriver(getWebDriverFactory().getDriver(
            DriverType.valueOf(System.getProperty("driver", "chrome").toUpperCase())));
    }

    @After(order = 0)
    public void testTearDown() {
        driverHandler.getDriver().quit();
    }

    private WebDriverFactory getWebDriverFactory() {
        boolean isRemote = Boolean.valueOf(System.getProperty("remote", "false"));
        return isRemote ? new RemoteWebDriverFactory() : new LocalWebDriverFactory();
    }
}
