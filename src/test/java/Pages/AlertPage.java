package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage {
    public AlertPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "alertButton")
    private WebElement buttonSimpleAlert;

    @FindBy(id = "timerAlertButton")
    private WebElement buttonSimpleWaitAlert;

    @FindBy(id = "promtButton")
    private WebElement buttonSimpleAlertComp;

    @FindBy(id = "confirmButton")
    private WebElement buttonOkCancel;

    @FindBy(id = "confirmResult")
    private WebElement confirmResult;

    @FindBy(id = "promptResult")
    private WebElement promptResult;

    public void dealWithAcceptAlert() {
        elementMethods.clickElement(buttonSimpleAlert);
        alertMethods.acceptAlert();
    }

    public void dealWithDelayAlert(){
        elementMethods.clickElement(buttonSimpleWaitAlert);
        alertMethods.waitForAlert();
        alertMethods.acceptAlert();
    }

    public void dealWithPromptButton(String text){
//        elementMethods.clickElement();
        buttonSimpleAlertComp.click();
        alertMethods.fillAlert(text);
        elementMethods.validateElementText(promptResult, "You entered " + text);
    }

    public void dealWithCancelButton(){
        elementMethods.clickElement(buttonOkCancel);
        alertMethods.cancelAlert();
        elementMethods.validateElementText(confirmResult, "You selected Cancel" );

    }


}
