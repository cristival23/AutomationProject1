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

public class WebTableTest extends SharedData {

    ElementMethods elementMethods = new ElementMethods(getWebDriver());

    @Test
    public void metodaTest(){

//        //deschidem un browser de Chrome
//        webDriver= new ChromeDriver();
//        //accesam un URL
//        webDriver.get("https://demoqa.com/");
//        //maximizarea ferestrei
//        webDriver.manage().window().maximize();
        //facem un scroll la pagina
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("window.scrollBy(0,450)", "");

        //identificam un element
//        WebElement consentField= webDriver.findElement(By.className("fc-button-label"));
//        consentField.click();

        WebElement elementsField= getWebDriver().findElement(By.xpath("//h5[text()='Elements']"));
//        elementsField.click();
        elementMethods.clickElement(elementsField);

        js.executeScript("window.scrollBy(0,450)", "");
        WebElement webTablesField= getWebDriver().findElement(By.xpath("//span[text()='Web Tables']"));
//        webTablesField.click();
        elementMethods.clickElement(webTablesField);

        WebElement addField= getWebDriver().findElement(By.id("addNewRecordButton"));
//        addField.click();
        elementMethods.clickElement(addField);


        WebElement firstNameField= getWebDriver().findElement(By.id("firstName"));
        String firstNameValue= "Voicu";
//        firstNameField.sendKeys(firstNameValue);
        elementMethods.fillElement(firstNameField,firstNameValue);

        WebElement lastNameField= getWebDriver().findElement(By.id("lastName"));
        String lastnameValue= "Cristian";
//        lastNameField.sendKeys(lastnameValue);
        elementMethods.fillElement(lastNameField,lastnameValue);

        WebElement emailField= getWebDriver().findElement(By.id("userEmail"));
        String emailValue= "voicucristianvalentin@gmail.com";
//        emailField.sendKeys(emailValue);
        elementMethods.fillElement(emailField,emailValue);

        WebElement ageField= getWebDriver().findElement(By.id("age"));
        String ageValue= "30";
//        ageField.sendKeys(ageValue);
        elementMethods.fillElement(ageField,ageValue);

        WebElement salaryField= getWebDriver().findElement(By.id("salary"));
        String salaryValue= "4000";
//        salaryField.sendKeys(salaryValue);
        elementMethods.fillElement(salaryField,salaryValue);

        WebElement departmentField= getWebDriver().findElement(By.id("department"));
        String departmentValue= "Testing";
//        departmentField.sendKeys(departmentValue);
        elementMethods.fillElement(departmentField,departmentValue);

        WebElement submitButtonField= getWebDriver().findElement(By.id("submit"));
//        submitButtonField.click();
        elementMethods.clickElement(submitButtonField);

        // modificam entry-ul adaugat mai sus

        WebElement editField= getWebDriver().findElement(By.id("edit-record-4"));
//        editField.click();
        elementMethods.clickElement(editField);

        WebElement firstNameModifyField= getWebDriver().findElement(By.id("firstName"));
        String firstNameModifyValue= "Popescu";
        elementMethods.refillElement(firstNameModifyField,firstNameModifyValue);
//        firstNameModifyField.clear();
//        firstNameModifyField.sendKeys(firstNameModifyValue);

        WebElement ageModifyField= getWebDriver().findElement(By.id("age"));
        String ageModifyValue= "3";
        elementMethods.refillElement(ageModifyField,ageModifyValue);
//        ageModifyField.clear();
//        ageModifyField.sendKeys(ageModifyValue);

        WebElement submitButtonModifyField= getWebDriver().findElement(By.id("submit"));
//        submitButtonModifyField.click();
        elementMethods.clickElement(submitButtonModifyField);

        //stergem noul entry
        WebElement deleteButton= getWebDriver().findElement(By.id("delete-record-4"));
//        deleteButton.click();
        elementMethods.clickElement(deleteButton);

        //inchidem un browser=quit()
        //inchidem un tab= close()

//        getWebDriver().quit();











    }
}
