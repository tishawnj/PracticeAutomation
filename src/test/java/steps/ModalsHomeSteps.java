package steps;

import businessLogic.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ModalsPage;

import java.io.IOException;

public class ModalsHomeSteps {

    ModalsPage modalsPage = new ModalsPage();



    public ModalsHomeSteps()  {
    }


    @When("I click Simple Modal Link")
    public void i_click_simple_modal_link() {
        modalsPage.clickSimpleModal();
    }
    @When("I should see Simple Modal Text")
    public void i_should_see_simple_modal_text() {
        modalsPage.verifySimpleModalText();
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("I verify text {string} in the modal")
    public void i_verify_text_in_the_modal(String message) throws IOException {

        modalsPage.getPopMakeText(message);
    }

    @When("I click Form Field Modal Link")
    public void i_click_form_field_modal_link() {

        modalsPage.clickFormModal();
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("i fill in the form with name {string} and email {string} and message {string} in the modal")
    public void i_fill_in_the_form_with_name_and_email_and_message_in_the_modal(String username, String userEmail, String userMessage) throws InterruptedException, IOException {

        modalsPage.fillForm(username, userEmail, userMessage);
        Thread.sleep(5000);
    }

    @Then("I close the modal")
    public void i_close_the_modal() {
        modalsPage.closeModal();
    }


}
