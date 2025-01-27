package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FormFieldsPage;

public class FormFieldsSteps {

    FormFieldsPage page = new FormFieldsPage();

    @When("I enter {string} in the name fields textbox")
    public void i_enter_in_the_name_fields_textbox(String name) {

        page.enterName(name);
    }
    @When("I enter {string} in the password fields textbox")
    public void i_enter_in_the_password_fields_textbox(String password) {

            page.enterPassword(password);
    }
    @When("then I answer what is my favorite {string} drink" )
    public void then_i_answer_what_is_my_favorite_drink(String drink) {
        page.selectFavoriteDrink(drink);

    }
    @When("I enter what is my favorite {string} color")
    public void i_enter_what_is_my_favorite_color(String color) {

        page.selectFavoriteColor(color);

    }
    @When("I answer do i like automation {string}")
    public void i_answer_do_i_like_automation(String answer) {

        page.selectIfYouLikeAutomationn(answer);

    }
    @When("I enter {string} in the email fields textbox")
    public void i_enter_in_the_email_fields_textbox(String email) {
       page.enterEmail(email);

    }
    @Then("I enter {string} in the message fields textbox")
    public void i_enter_in_the_message_fields_textbox(String message) {

        page.enterMessage(message);
        // Write code here that turns the phrase above into concrete actions

    }
}
