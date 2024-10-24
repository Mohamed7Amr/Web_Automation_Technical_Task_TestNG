package tests.register_tests;

import com.github.javafaker.Faker;
import io.qameta.allure.Owner;
import listeners.ITestListener_Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import test_bases.TestBase;
import webpages.home_page.Home_Actions;
import webpages.register_page.Register_Actions;

@Listeners(ITestListener_Listener.class)
public class Register_Test extends TestBase{

    /******************************************DECLARATIONS/INSTANTIATIONS********************************************/
    private Home_Actions ha;
    private Register_Actions ra;
    private Faker fake_Data = new Faker();

    /***********************************************TEST_DATA**********************************************************/
    private final String firstName = fake_Data.harryPotter().spell();
    private final String middleName = fake_Data.harryPotter().spell();
    private final String lastName = fake_Data.harryPotter().spell();
    private final String email_Address = String.valueOf(fake_Data.internet().emailAddress());
    private final String password = fake_Data.numerify("#######");


    /************************************************TEST_CASES********************************************************/
    @Owner("Mohamed Amr")
    @Test(groups = {"regression"})
    public void user_Registration_With_Valid_Data()
    {
        ha = new Home_Actions(driver);
        ra = new Register_Actions(driver);
        ITestListener_Listener.driver = driver;

        ha.click_Account();
        ha.click_Register_Li();
        ra.insert_FirstName(firstName);
        ra.insert_Middle_Name(middleName);
        ra.insert_Last_Name(lastName);
        ra.insert_Email_Address(email_Address);
        ra.insert_Password(password);
        ra.insert_Confirm_Password(password);
        ra.click_Register_Btn();
        ra.validate_Successful_Registration();
    }

}
