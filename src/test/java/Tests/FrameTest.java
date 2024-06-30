package Tests;

import HelperMethods.ElementMethods;
import HelperMethods.FrameMethods;
import Pages.AlertWindowsFramePage;
import Pages.FramePage;
import Pages.HomePage;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;

public class FrameTest extends SharedData {


    @Test
    public void windowTest() {
//        ElementMethods elementMethods = new ElementMethods(getWebDriver());
//        FrameMethods frameMethods = new FrameMethods(getWebDriver());


//        webDriver = new ChromeDriver();
//        //accesam un URL
//        webDriver.get("https://demoqa.com/");
//        //maximizarea ferestrei
//        webDriver.manage().window().maximize();
//        //facem un scroll la pagina
//        JavascriptExecutor js = (JavascriptExecutor) webDriver;
//        js.executeScript("window.scrollBy(0,450)", "");
//        elementMethods.scrollElementByPixel(0,450);

//        WebElement windowField = getWebDriver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
////        windowField.click();
//        elementMethods.clickElement(windowField);
        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowsFramePage alertWindowsFramePage = new AlertWindowsFramePage(getWebDriver());
        alertWindowsFramePage.navigateToFramePage();

        FramePage framePage = new FramePage(getWebDriver());
        framePage.dealWithIFrame();

////        js.executeScript("window.scrollBy(0,450)", "");
//        elementMethods.scrollElementByPixel(0,450);
//        WebElement framesField = getWebDriver().findElement(By.xpath("//span[text()='Frames']"));
////        framesField.click();
//        elementMethods.clickElement(framesField);
//
//
//        //interactionam cu un iframe
////        webDriver.switchTo().frame("frame1");
//        frameMethods.switchSpecificIframe("frame1");
//        WebElement frameElement = getWebDriver().findElement(By.id("sampleHeading"));
////        System.out.println(frameElement.getText());
//        elementMethods.printElementText(frameElement);
//
//        //specificam sa revina la frameul curent
////        webDriver.switchTo().parentFrame();
//        frameMethods.switchParentFrame();
//
////        webDriver.switchTo().frame("frame2");
//        frameMethods.switchSpecificIframe("frame2");
//        WebElement frame2Element = getWebDriver().findElement(By.id("sampleHeading"));
////        System.out.println(frame2Element.getText());
//        elementMethods.printElementText(frame2Element);

    }
}
