package stepDefinition;

import Util.PropertyLoader;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class AbstractStepDef {
    protected static WebDriver driver;
  //  public LoginPage stepDefinition.LoginFunctionality = new LoginPage(driver);
//    public HomePage homePage = new HomePage(driver);
  //  public AdminPage adminPage = new AdminPage(driver);
    //  public AutoItPage autoItPage = new AutoItPage(driver);
    protected static String chromeDriver = PropertyLoader.loadProperty("chromeDriver");
    protected static String loginPageUrl = PropertyLoader.loadProperty("loginPageUrl");
    public static String excelFilePath = PropertyLoader.loadProperty("excelFilePath");
    public static String excelSheet = PropertyLoader.loadProperty("excelSheet");
    public static String autoItUploadFileSite = PropertyLoader.loadProperty("autoItUploadFileSite");
    public static String restAssuredBaseUrl = PropertyLoader.loadProperty("restAssuredBaseUrl");
//    public Logger log = logManager.getLogger();

}
