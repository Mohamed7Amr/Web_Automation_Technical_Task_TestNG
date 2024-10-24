package webpages.register_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webpages.Page_Base;

public class Register_WebElements extends Page_Base {

    /*****************************************CONSTRUCTORS*******************************************/
    public Register_WebElements(WebDriver driver) {
        super(driver);
    }

    /*****************************************WEB_ELEMENTS******************************************/
    @FindBy(id = "firstname")
    WebElement firstName_Txt;
    @FindBy(id = "middlename")
    WebElement middleName_Txt;
    @FindBy(id = "lastname")
    WebElement lastName_Txt;
    @FindBy(id = "email_address")
    WebElement email_Address_Txt;
    @FindBy(id = "password")
    WebElement password_Txt;
    @FindBy(id = "confirmation")
    WebElement confirm_Password_Txt;
    @FindBy(xpath = "//span[text()='Register']")
    WebElement registration_Btn;
    @FindBy(xpath = "//span[text()='Thank you for registering with Tealium Ecommerce.']")
    WebElement registration_Success_Msg;
}
