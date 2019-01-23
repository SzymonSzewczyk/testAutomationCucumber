package test.automation.cucumber.page.login.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test.automation.cucumber.page.common.Component;
import test.automation.cucumber.page.flight.ChooseFlightPage;

public class HeaderComponent extends Component {
    @FindBy(css = "a.navbar-brand")
    WebElement blazeDemoLink;

    public HeaderComponent(WebDriver driver) {
        super(driver);
    }

    public ChooseFlightPage clickBlazeDemoLink() {
        blazeDemoLink.click();
        return new ChooseFlightPage(driver);
    }
}
