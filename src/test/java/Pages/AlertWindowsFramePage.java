package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertWindowsFramePage extends BasePage {
    //    private ElementMethods elementMethods;
//    private WebDriver webDriver;
//    public AlertWindowsFramePage (WebDriver webDriver) {
//        this.webDriver = webDriver;
//        elementMethods = new ElementMethods(webDriver);
//        PageFactory.initElements(webDriver, this);
//    }

    @FindBy(xpath = "//span[text()='Alerts']")
    private WebElement windowField;

    @FindBy(xpath = "//span[text()='Frames']")
    private WebElement framesField;

    public AlertWindowsFramePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void navigateToAlertPage() {
//        elementMethods.scrollElementByPixel(0, 450);
        elementMethods.clickElement(windowField);

    }
    public void navigateToFramePage(){
        elementMethods.clickElement(framesField);
    }

}
