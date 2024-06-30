package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PracticeFormsPage extends BasePage {
    public PracticeFormsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "firstName")
    private WebElement firstNameField;
    @FindBy(css = "input[placeholder='Last Name']")
    private WebElement lastNameField;
    @FindBy(id = "userEmail")
    private WebElement userEmailField;
    @FindBy(css = "input[placeholder='Mobile Number']")
    private WebElement userMobileNumberField;
    @FindBy(css = ".react-datepicker__input-container")
    private WebElement dateOfBirthField;
    @FindBy(css = ".react-datepicker__month-select")
    private WebElement monthDateOfBirthField;
    @FindBy(css = ".react-datepicker__year-select")
    private WebElement yearDateOfBirthField;
    @FindBy(xpath = "//div[not(contains(@class,'outside-month')) " +
            "and contains(@class, 'react-datepicker__day react-datepicker__day')]")
    private List<WebElement> dayDateOfBirthField;
    @FindBy(css = "label[for='gender-radio-1']")
    private WebElement userGender;
    @FindBy(xpath = "//div[@id='hobbiesWrapper']//label[@class='custom-control-label']")
    private WebElement HobbysList;
    @FindBy(id = "subjectsInput")
    private WebElement subjectFiled;
    @FindBy(id = "uploadPicture")
    private WebElement pictureField;
    @FindBy(css = "textarea[placeholder='Current Address']")
    private WebElement addressField;
    @FindBy(xpath = "//div[text()='Select State']")
    private WebElement subjectField;
    @FindBy(id = "react-select-3-input")
    private WebElement stateInputField;
    @FindBy(xpath = "//div[text()='Select City']")
    private WebElement cityField;
    @FindBy(id = "react-select-4-input")
    private WebElement cityInputField;
    @FindBy(id = "submit")
    private WebElement submit;
    @FindBy(xpath = "//table/tbody/tr/td[1]")
    private List<WebElement> labelFields;
    @FindBy(xpath = "//table/tbody/tr/td[2]")
    private List<WebElement> valueFields;

    public void fillFirstName(String firstNameValue) {
        elementMethods.fillElement(firstNameField, firstNameValue);
        elementMethods.scrollElementByPixel(0, 450);
    }

    public void fillLastName(String lastNameFieldValue) {
        elementMethods.fillElement(lastNameField,lastNameFieldValue);
    }
    public void userEmailField(String userEmailValue){
        elementMethods.fillElement(userEmailField,userEmailValue);
    }
    public void userMobileNumberField(String userMobileNumberValue){
        elementMethods.fillElement(userMobileNumberField,userMobileNumberValue);
    }
    public void pickBirthDate(String dayValue,String monthDateOfBirthValue,String yearDateOfBirthValue){
        elementMethods.clickElement(dateOfBirthField);
        elementMethods.selectTextElement(monthDateOfBirthField,monthDateOfBirthValue);
        elementMethods.selectValueElement(yearDateOfBirthField,yearDateOfBirthValue);
        for (Integer i=0; i <dayDateOfBirthField.size(); i++){
            if (dayDateOfBirthField.get(i).getText().equals(dayValue)){
                dayDateOfBirthField.get(i).click();
                break;
            }
        }
    }
    public void pickGender(String genderValue){
        userGender.click();
    }
    public void pickHobbies(List<String>Hobbies) {
        for (Integer index = 0; index < HobbysList.size(); index++) {
            String curentElementText = HobbysList.get(index).getText();
            if (Hobbies.contains(curentElementText)) {
//                HobbysList.get(index).click();
                elementMethods.clickElementForce(HobbysList.get(index));
            }
        }
    }

}

