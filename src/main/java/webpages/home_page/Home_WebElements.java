package webpages.home_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webpages.Page_Base;

public class Home_WebElements extends Page_Base {

    /*****************************************CONSTRUCTORS*******************************************/
    public Home_WebElements(WebDriver driver) {
        super(driver);
    }

    /****************************************WEB_ELEMENTS********************************/
    /**
     * Names-Suffix Notes:
     * 1)Txt:TextBox; 2)Link:WebLink; 3)Btn:Button; 4)Li:ListItem;
     * 5)Msg:Message; 6)DDL:DropDownList; 7)Opt:Option; 8)Chbox:CheckBox;
     * 9)Rdo:RadioButton; 10)TxtArea:TextArea;
     */

    @FindBy(css = "a[href='https://ecommerce.tealiumdemo.com/customer/account/']")
    WebElement account_DDL;
    @FindBy(css = "a[href='https://ecommerce.tealiumdemo.com/customer/account/create/']")
    WebElement register_Li;

}
