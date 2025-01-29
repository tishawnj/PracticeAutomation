package hooks;

import businessLogic.BaseClass;
import instances.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class Hooks {




    @Before
    //initialize the webdriver and navigate to url
    public static void before() throws IOException {
        BaseClass.initializeBrowser();
        BaseClass.getLogger().info("Navigated to the URL: " + BaseClass.getProperties().getProperty("url"));
    }


    @AfterAll
    public static void beforeAll_or_AfterAll(){
        Driver.getInstance().quit();
        BaseClass.getLogger().info("Browser closed successfully!");
    }

    @AfterStep
    public void addScreenshot(Scenario scenario) {

        // this is for cucumber junit report
        if(scenario.isFailed()) {

            TakesScreenshot ts=(TakesScreenshot) Driver.getInstance();
            byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png",scenario.getName());

        }

    }


}
