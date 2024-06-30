package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormsPage extends BasePage {
    public FormsPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(id = "//span[text()='Practice Form']")
    private WebElement firstNameField;

}
