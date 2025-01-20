package hooks;

import businessLogic.BaseClass;
import instances.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.testng.annotations.AfterSuite;

import java.io.IOException;

public class Hooks {




    @AfterAll
    public static void beforeAll_or_AfterAll(){
        Driver.getInstance().quit();
        BaseClass.getLogger().info("Browser closed successfully!");
    }


}
