package Tests;

import HelperMethods.ElementMethods;
import SharedData.SharedData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class PracticeFormTest extends SharedData {


    @Test
    public void metodaTest() {

        ElementMethods elementMethods = new ElementMethods(getWebDriver());
        elementMethods.scrollElementByPixel(0,450);

//        //deschidem un browser de Chrome
//        webDriver = new ChromeDriver();
//        //accesam un URL
//        webDriver.get("https://demoqa.com/");
//        //maximizarea ferestrei
//        webDriver.manage().window().maximize();
//        //facem un scroll la pagina
//        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();

//        js.executeScript("window.scrollBy(0,450)", "");
//        WebElement consentField= webDriver.findElement(By.className("fc-button-label"));
////        consentField.click();

        WebElement formsField= getWebDriver().findElement(By.xpath("//h5[text()='Forms']"));
//        formsField.click();
        elementMethods.clickElement(formsField);

        elementMethods.scrollElementByPixel(0,450);
//        js.executeScript("window.scrollBy(0,450)", "");
        WebElement webFormsField= getWebDriver().findElement(By.xpath("//span[text()='Practice Form']"));
//        webFormsField.click();
        elementMethods.clickElement(webFormsField);


        WebElement firstNameField= getWebDriver().findElement(By.id("firstName"));
        String firstNameValue= "Cristian";
        elementMethods.fillElement(firstNameField,firstNameValue);
//        firstName.sendKeys(firstNameValue);

        WebElement lastNameField= getWebDriver().findElement(By.cssSelector("input[placeholder='Last Name']"));
        String lastNameValue= "Voicu";
//        lastNameField.sendKeys(lastNameValue);
        elementMethods.fillElement(lastNameField,lastNameValue);

        WebElement userEmailField= getWebDriver().findElement(By.id("userEmail"));
        String userEmailValue= "voicucristianvalentin1993@gmail.com";
//        userEmailField.sendKeys(userEmailValue);
        elementMethods.fillElement(userEmailField,userEmailValue);

        WebElement userMobileNumberField= getWebDriver().findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        String userMobileNumberValue= "0123456789";
//        userMobileNumberField.sendKeys(userMobileNumberValue);
        elementMethods.fillElement(userMobileNumberField,userMobileNumberValue);

        String genderValue="Male";
        genderField(genderValue);

        WebElement dateOfBirthField= getWebDriver().findElement(By.cssSelector(".react-datepicker__input-container"));
//        dateOfBirthField.click();
        elementMethods.clickElement(dateOfBirthField);

        WebElement monthDateOfBirthField= getWebDriver().findElement(By.cssSelector(".react-datepicker__month-select"));
//        Select monthSelect= new Select(monthDateOfBirthField);
//        monthSelect.selectByVisibleText("September");
        String monthDateOfBirthValue = "September";
        elementMethods.selectTextElement(monthDateOfBirthField,monthDateOfBirthValue);

        WebElement yearDateOfBirthField= getWebDriver().findElement(By.cssSelector(".react-datepicker__year-select"));
//        Select yearSelect= new Select(yearDateOfBirthField);
//        yearSelect.selectByValue("1993");
        String yearDateOfBirthValue = "1993";
        elementMethods.selectValueElement(yearDateOfBirthField,yearDateOfBirthValue);

        List<WebElement> dayDateOfBirthField= getWebDriver().findElements(By.xpath("//div[not(contains(@class,'outside-month')) " +
                "and contains(@class, 'react-datepicker__day react-datepicker__day')]"));
        String dayValue= "23";
        for (Integer i=0; i <dayDateOfBirthField.size(); i++){
            if (dayDateOfBirthField.get(i).getText().equals(dayValue)){
                dayDateOfBirthField.get(i).click();
                break;
            }
        }



//        WebElement userGender= webDriver.findElement(By.cssSelector("label[for='gender-radio-1']"));
//        userGender.click();


        //facem un algoritm care sa imi selecteze valorile pe care i le specific
        List<String>Hobbies= Arrays.asList("Sports","Music","Reading");
        List<WebElement>HobbysList= getWebDriver().findElements(By.xpath("//div[@id='hobbiesWrapper']//label[@class='custom-control-label']"));
        for (Integer index= 0; index< HobbysList.size();index++){
            String curentElementText= HobbysList.get(index).getText();
            if(Hobbies.contains(curentElementText)){
                HobbysList.get(index).click();
            }
        }

//        WebElement userHobby= webDriver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
//        userHobby.click();
        String subjectFieldValue="Economics";
        WebElement subjectFiled= getWebDriver().findElement(By.id("subjectsInput"));
//        subjectFiled.sendKeys("Economics");
//        subjectFiled.sendKeys(Keys.ENTER);
        elementMethods.fillPressElement(subjectFiled,subjectFieldValue,Keys.ENTER);

        WebElement pictureField= getWebDriver().findElement(By.id("uploadPicture"));
        String filePath="src/test/resources/3d render.jpg";
//        pictureField.sendKeys(new File("src/test/resources/3d render.jpg").getAbsolutePath());
        elementMethods.fillElement(pictureField,new File("src/test/resources/3d render.jpg").getAbsolutePath());

        WebElement addressField= getWebDriver().findElement(By.cssSelector("textarea[placeholder='Current Address']"));
        String addressValue="Str 1";
//        addressField.sendKeys(addressValue);
        elementMethods.fillElement(addressField,addressValue);

        elementMethods.scrollElementByPixel(0,450);
//        js.executeScript("window.scrollBy(0,450)", "");
        WebElement subjectField= getWebDriver().findElement(By.xpath("//div[text()='Select State']"));
//        js.executeScript("arguments[0].click();", subjectField);
        elementMethods.clickElement(subjectField);


        String stateInputValue="NCR";
        WebElement stateInputField= getWebDriver().findElement(By.id("react-select-3-input"));
//        stateInputField.sendKeys("NCR");
//        stateInputField.sendKeys(Keys.ENTER);
        elementMethods.fillPressElement(stateInputField,stateInputValue,Keys.ENTER);

        WebElement cityField= getWebDriver().findElement(By.xpath("//div[text()='Select City']"));
//        js.executeScript("arguments[0].click();", cityField);
        elementMethods.scrollElementByPixel(0,450);
        elementMethods.clickElement(cityField);



        WebElement cityInputField= getWebDriver().findElement(By.id("react-select-4-input"));
        String cityInputValue = "Delhi";
//        cityInputField.sendKeys("Delhi");
//        cityInputField.sendKeys(Keys.ENTER);
        elementMethods.fillPressElement(cityInputField,cityInputValue,Keys.ENTER);

        WebElement submitButton= getWebDriver().findElement(By.id("submit"));
//        js.executeScript("arguments[0].click();", submitButton);
//        elementMethods.clickElementForce(submitButton);
        elementMethods.scrollElementByPixel(0,450);
        elementMethods.clickElement(submitButton);


        //validam tabelul cu valori
        List<WebElement> labelFields= getWebDriver().findElements(By.xpath("//table/tbody/tr/td[1]"));
        List<WebElement> valueFields= getWebDriver().findElements(By.xpath("//table/tbody/tr/td[2]"));

        Assert.assertEquals(labelFields.get(0).getText(),"Student Name");
        Assert.assertEquals(valueFields.get(0).getText(),firstNameValue + " " +lastNameValue);

        Assert.assertEquals(labelFields.get(1).getText(),"Student Email");
        Assert.assertEquals(valueFields.get(1).getText(),userEmailValue );

        Assert.assertEquals(labelFields.get(2).getText(),"Gender");
        Assert.assertEquals(valueFields.get(2).getText(),genderValue);

        Assert.assertEquals(labelFields.get(3).getText(),"Mobile");
        Assert.assertEquals(valueFields.get(3).getText(),userMobileNumberValue);

        Assert.assertEquals(labelFields.get(4).getText(),"Date of Birth");
//        Assert.assertEquals(valueFields.get(4).getText(),userMobileNumberValue);

        Assert.assertEquals(labelFields.get(5).getText(),"Subjects");
        Assert.assertEquals(valueFields.get(5).getText(),subjectFieldValue);

        Assert.assertEquals(labelFields.get(6).getText(),"Hobbies");
        for (Integer index= 0; index < Hobbies.size();index++) {
            Assert.assertTrue(valueFields.get(6).getText().contains(Hobbies.get(index)));
        }

        Assert.assertEquals(labelFields.get(7).getText(),"Picture");
        String[] arrayFile= filePath.split("/");
        Integer desiredIndex= arrayFile.length -1;
        Assert.assertEquals(valueFields.get(7).getText(),arrayFile[desiredIndex]);







//        WebElement closeButton= webDriver.findElement(By.id("closeLargeModal"));
//        js.executeScript("arguments[0].click();", closeButton);
    }

    public void genderField(String gender){
        if (gender == "Male"){
            WebElement genderField= getWebDriver().findElement(By.cssSelector("label[for='gender-radio-1']"));
            genderField.click();
        } else if (gender == "Female") {
            WebElement genderField= getWebDriver().findElement(By.cssSelector("label[for='gender-radio-2']"));
        }else {
            WebElement genderField=getWebDriver().findElement(By.cssSelector("label[for='gender-radio-3']"));
            genderField.click();
        }
    }
}
