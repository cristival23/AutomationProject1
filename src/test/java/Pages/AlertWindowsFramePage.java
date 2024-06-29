package Pages;

import HelperMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertWindowsFramePage extends BasePages {
    //    private ElementMethods elementMethods;
//    private WebDriver webDriver;
//    public AlertWindowsFramePage (WebDriver webDriver) {
//        this.webDriver = webDriver;
//        elementMethods = new ElementMethods(webDriver);
//        PageFactory.initElements(webDriver, this);
//    }
    public AlertWindowsFramePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//span[text()='Alerts']")
    public WebElement framesField;


    public void navigateToAlertPage() {
        elementMethods.scrollElementByPixel(0, 450);
        elementMethods.clickElement(framesField);

    }

}
