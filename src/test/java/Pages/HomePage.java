package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    //    private ElementMethods elementMethods;
//    private WebDriver webDriver;
//
//    public HomePage(WebDriver webDriver) {
//        this.webDriver = webDriver;
//        elementMethods = new ElementMethods(webDriver);
//        PageFactory.initElements(webDriver,this);
//    }
//    @FindBy(className = "fc-button-label")
//    private WebElement consentField;
    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement alertsField;
    @FindBy(xpath = "//h5[text()='Forms']")
    private WebElement formsField;


    public void navigateToAlertFrameWindowPage() {
        elementMethods.scrollElementByPixel(0, 450);
//        elementMethods.clickElement(consentField);
        elementMethods.clickElement(alertsField);
    }

    public void navigateToFormsPage() {
        elementMethods.scrollElementByPixel(0, 450);
        elementMethods.clickElement(formsField);

    }


}
