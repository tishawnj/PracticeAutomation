package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccordionPage;
import pages.HomePage;

public class AccordionPageSteps {

        AccordionPage accordionPage = new AccordionPage();
        HomePage homePage = new HomePage();




    @Then("I should see Accordion Test Text")
    public void i_should_see_accordion_test_text() {

        accordionPage.clickAccordion();


    }
}
