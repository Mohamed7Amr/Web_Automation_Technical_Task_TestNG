package webpages.home_page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class Home_Actions extends Home_WebElements{

    /*****************************************CONSTRUCTORS*******************************************/
    public Home_Actions(WebDriver driver) {
        super(driver);
    }

    /******************************************ACTIONS**********************************************/
    @Step("Clicks \"Account\"")
    public void click_Account()
    {
        clickWebElement(account_DDL);
    }
    @Step("Clicks \"Register\" list item")
    public void click_Register_Li()
    {
        clickWebElement(register_Li);
    }

}
