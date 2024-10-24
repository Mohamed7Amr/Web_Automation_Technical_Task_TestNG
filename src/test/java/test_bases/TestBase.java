package test_bases;

import dataReader.Load_Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestBase {

    /************************************OBJECTS_DECLARATIONS/INSTANTIATIONS*****************************/
    protected WebDriver driver;

    /**************************************GLOBAL_VARIABLES***********************************************/
    private final String url = Load_Properties.environment_Data.getProperty("url");
    private final String browser = Load_Properties.environment_Data.getProperty("browser");

    /******************************************METHODS**************************************************/

    @Parameters({"browser"})
    @BeforeMethod
    public void setUp_Environment()
    {
        switch (browser)
        {
            case "chrome" : driver = new ChromeDriver();break;
            case "firefox" : driver = new FirefoxDriver();break;
            case "edge" : driver = new EdgeDriver();break;
            case "ChromeHeadless" : ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                driver = new ChromeDriver(options);break;
            default : driver = new ChromeDriver();break;
        }
        driver.get(url);
        driver.manage().window().maximize();
    }
}
