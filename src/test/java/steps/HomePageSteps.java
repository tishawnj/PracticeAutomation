package steps;

import businessLogic.BaseClass;
import instances.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

import java.io.IOException;

public class HomePageSteps {

    HomePage homePage = new HomePage();
    static WebDriver driver;



    @When("I click Modals Link")
    public void i_click_modals_link() throws IOException {
        homePage.openModalsPage();
    }

    @Given("I am on Home page")
    public void iAmOnHomePage() throws IOException {
        Driver.getInstance();
        BaseClass.initializeBrowser(Driver.getInstance());
    }

    @When("I click Close Button")
    public void i_click_close_button() {

        Driver.getInstance().close();
        BaseClass.getLogger().info("Closing browser!");

        // Write code here that turns the phrase above into concrete actions
    }
}
