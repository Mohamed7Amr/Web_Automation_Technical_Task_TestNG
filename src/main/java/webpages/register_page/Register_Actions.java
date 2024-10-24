package webpages.register_page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class Register_Actions extends Register_WebElements {

    /*****************************************CONSTRUCTORS*******************************************/
    public Register_Actions(WebDriver driver) {
        super(driver);
    }

    /*****************************************ACTIONS***********************************************/
    @Step("Inserts \"First Name\"")
    public void insert_FirstName(String firstName) {
        writeText(firstName_Txt, firstName);
    }

    @Step("Inserts middle name")
    public void insert_Middle_Name(String middle_Name) {
        writeText(middleName_Txt, middle_Name);
    }

    @Step("Inserts last name")
    public void insert_Last_Name(String lastName) {
        writeText(lastName_Txt, lastName);
    }

    @Step("Inserts email address")
    public void insert_Email_Address(String email_Address) {
        writeText(email_Address_Txt, email_Address);
    }

    @Step("Inserts password")
    public void insert_Password(String password) {
        writeText(password_Txt, password);
    }

    @Step("Inserts \"Confirm Password\"")
    public void insert_Confirm_Password(String confirm_Password) {
        writeText(confirm_Password_Txt, confirm_Password);
    }

    @Step("Clicks \"REGISTER\" button")
    public void click_Register_Btn() {
        clickWebElement(registration_Btn);
    }

    /******************************************ASSERTIONS*********************************************/
    public void validate_Successful_Registration() {
        assert_WebElement_Is_Displayed(registration_Success_Msg, "Registration success message is displayed Validation");
    }
}
