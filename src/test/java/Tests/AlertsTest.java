package Tests;

import HelperMethods.AlertMethods;
import HelperMethods.ElementMethods;
import Pages.AlertPage;
import Pages.AlertWindowsFramePage;
import Pages.HomePage;
import SharedData.SharedData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertsTest extends SharedData {


    @Test
    public void alertTest() {
//        ElementMethods elementMethods = new ElementMethods(getWebDriver());
//        AlertMethods alertMethods = new AlertMethods(getWebDriver());

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        //facem un scroll la pagina
//        JavascriptExecutor js = (JavascriptExecutor) webDriver;
//        js.executeScript("window.scrollBy(0,450)", "");

//        elementMethods.scrollElementByPixel(0, 450);
//        WebElement consentField= getWebDriver().findElement(By.className("fc-button-label"));
//        elementMethods.clickElement(consentField);

//        WebElement formsField = getWebDriver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
////        windowField.click();
//        elementMethods.clickElement(formsField);
//
////        js.executeScript("window.scrollBy(0,450)", "");
//        elementMethods.scrollElementByPixel(0, 450);
//        WebElement framesField = getWebDriver().findElement(By.xpath("//span[text()='Alerts']"));
////        framesField.click();
//        elementMethods.clickElement(framesField);
        AlertWindowsFramePage alertWindowsFramePage = new AlertWindowsFramePage(getWebDriver());
        alertWindowsFramePage.navigateToAlertPage();


//        WebElement alertOK = getWebDriver().findElement(By.id("alertButton"));
//        alertOK.click();
//        elementMethods.clickElement(alertOK);
//        WebDriverWait wait = new WebDriverWait(webDriver,Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());
        AlertPage alertPage = new AlertPage(getWebDriver());
        alertPage.dealWithAcceptAlert();
        alertPage.dealWithDelayAlert();
        alertPage.dealWithPromptButton("test");
        alertPage.dealWithCancelButton();

////        Alert firstAlert = webDriver.switchTo().alert();
////        firstAlert.accept();
//        alertMethods.acceptAlert();
//
//        WebElement timerButton = getWebDriver().findElement(By.id("timerAlertButton"));
////        timerButton.click();
//        elementMethods.clickElement(timerButton);
//
//        //wait explicit
////        WebDriverWait wait = new WebDriverWait(webDriver,Duration.ofSeconds(10));
////        wait.until(ExpectedConditions.alertIsPresent());
////        Alert secondAlert = webDriver.switchTo().alert();
////        secondAlert.accept();
//        alertMethods.waitForAlert();
//        alertMethods.acceptAlert();
//
//        String cancelValue = "Cancel";
//        WebElement confirmButton = getWebDriver().findElement(By.id("confirmButton"));
////        confirmButton.click();
//        elementMethods.clickElement(confirmButton);
////        Alert thirdAlert = webDriver.switchTo().alert();
////        thirdAlert.dismiss();
//        alertMethods.cancelAlert();
//
//        WebElement promtButton = getWebDriver().findElement(By.id("promtButton"));
////        promptButton.click();
//        elementMethods.clickElement(promtButton);
//        String text = "Confirmare";
////        Alert forthAlert = webDriver.switchTo().alert();ds
////        forthAlert.sendKeys(text);
////        forthAlert.accept();
//        alertMethods.fillAlert(text);
//
//
////        //asserturile
//
//        WebElement confirmResult = getWebDriver().findElement(By.id("confirmResult"));
//        elementMethods.validateElementText(confirmResult, "You selected " + cancelValue);
////        System.out.println(confirmResult.getText());
////        Assert.assertEquals(confirmResult.getText(), "You selected " + cancelValue);
//
//        WebElement promptResult = getWebDriver().findElement(By.id("promptResult"));
//        elementMethods.validateElementText(promptResult, "You entered " + text);
////        System.out.println(promptResult.getText());
////        Assert.assertEquals(promptResult.getText(), "You entered " + text);
//
    }
}
