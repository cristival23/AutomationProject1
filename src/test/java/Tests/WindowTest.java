package Tests;

import HelperMethods.ElementMethods;
import HelperMethods.WindowMethods;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WindowTest extends SharedData {


    @Test
    public void windowTest() {
        ElementMethods elementMethods = new ElementMethods(getWebDriver());
        WindowMethods windowMethods = new WindowMethods(getWebDriver());

//        webDriver = new ChromeDriver();
//        //accesam un URL
//        webDriver.get("https://demoqa.com/");
//        //maximizarea ferestrei
//        webDriver.manage().window().maximize();
//        //facem un scroll la pagina
//        JavascriptExecutor js = (JavascriptExecutor) webDriver;
//        js.executeScript("window.scrollBy(0,450)", "");
        elementMethods.scrollElementByPixel(0,450);

        WebElement windowField= getWebDriver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//        windowField.click();
        elementMethods.clickElement(windowField);

//        js.executeScript("window.scrollBy(0,450)", "");
        elementMethods.scrollElementByPixel(0,450);

        WebElement browserWindowField= getWebDriver().findElement(By.xpath("//span[text()='Browser Windows']"));
//        browserWindowField.click();
        elementMethods.clickElement(browserWindowField);

        WebElement newTabButton= getWebDriver().findElement(By.id("tabButton"));
//        newTabButton.click();
        elementMethods.clickElement(newTabButton);

        //trebuie sa indentificam numarul de taburi deschise
//        List<String> tabsOpened= new ArrayList<>(webDriver.getWindowHandles());
//        System.out.println("Tabul curent are URL-ul "+ webDriver.getCurrentUrl());
//        webDriver.switchTo().window(tabsOpened.get(1));
//        System.out.println("Tabul curent are URL-ul "+ webDriver.getCurrentUrl());
        windowMethods.switchSpecificTabWindow(1);

        //inchidem tabul curent  = close
        //inchidem browserul = quit
        windowMethods.closeCurentTabWindow();
        windowMethods.switchSpecificTabWindow(0);

//        webDriver.close();
//        webDriver.switchTo().window(tabsOpened.get(0));
//        System.out.println("Tabul curent are URL-ul "+ webDriver.getCurrentUrl());

        WebElement newWindowButton= getWebDriver().findElement(By.id("windowButton"));
//        newWindowButton.click();
        elementMethods.clickElement(newWindowButton);

//        List<String> windowsOpened= new ArrayList<>(webDriver.getWindowHandles());
//        System.out.println("Windowul curent are URL-ul "+ webDriver.getCurrentUrl());
//        webDriver.switchTo().window(windowsOpened.get(1));
//        System.out.println("Windowul curent are URL-ul "+ webDriver.getCurrentUrl());
        windowMethods.switchSpecificTabWindow(1);
        windowMethods.closeCurentTabWindow();
        windowMethods.switchSpecificTabWindow(0);



//        webDriver.close();
//        webDriver.switchTo().window(windowsOpened.get(0));
//        System.out.println("Windowul curent are URL-ul "+ webDriver.getCurrentUrl());
//
//        webDriver.quit();
    }

}
