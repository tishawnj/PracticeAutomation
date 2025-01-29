package steps;

import businessLogic.BaseClass;
import instances.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.jsoup.Connection;
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
    public void i_am_on_home_page() throws IOException {
        BaseClass.getLogger().info("I am on Home page");
    }

    @When("I click Close Button")
    public void i_click_close_button() {

        Driver.getInstance().close();
        BaseClass.getLogger().info("Closing browser!");

        // Write code here that turns the phrase above into concrete actions
    }



    @When("I click Accordion Link")
    public void i_click_accordion_link() {
        homePage.openAccordionPage();
    }

    @Given("I click on FormFields Link")
    public void i_click_on_form_fields_link() throws InterruptedException {

        homePage.openFormFieldsPage();
    }
}
