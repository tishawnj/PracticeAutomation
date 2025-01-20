package hooks;

import businessLogic.BaseClass;
import instances.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterSuite;

import java.io.IOException;

public class Hooks {




    @AfterAll
    public static void afterAll(){
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
