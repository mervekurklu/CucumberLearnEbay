package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @Before
    public void setup(Scenario scenario){
        System.out.println(scenario.getName()+" isimli Senaryo Çalıştı");
    }

   // @Before("@FirstHooks")
   // public void setUp() {
   //     LoginStep ls = new LoginStep(Driver.getDriver());
   //     ls.driverGet(ConfigReader.getProperty("url"));
   //     ls.clickLogin();
   //     String email = ConfigReader.getProperty("email").replaceAll(" ","");
   //     String password = ConfigReader.getProperty("password").replaceAll(" ","");
   //     ls.typeUsername(email);
   //     ls.typePassword(password);
   //     ls.clickSubBtn();
   //     ls.clickprofile();
   //     ls.clickAccount_mng();
   // }

    @After
    public void tearDownScenario(Scenario scenario) {

        //scenario.isFailed()-->if scenario fails this method will return TRUE boolean value
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        //BrowserUtils.sleep(3);
        Driver.closeDriver();

        //System.out.println("====Closing browser using cucumber @After");
        //System.out.println("====Scenario ended/ Take screenshot if ");
    }

    //@BeforeStep
    public void setupStep() {
        System.out.println("------> applying setup using @BeforeStep");
    }

    //@AfterStep
    public void afterSetup() {
        System.out.println("------> applying tearDown using @AfterStep");
    }
}
