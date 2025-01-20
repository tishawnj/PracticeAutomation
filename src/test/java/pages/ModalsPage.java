package pages;

import businessLogic.BaseClass;
import instances.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class ModalsPage {

    String text = "";

    public ModalsPage() {

        PageFactory.initElements(Driver.getInstance(), this);
    }

    @FindBy(id = "simpleModal")
    public WebElement simpleModal;

    @FindBy(xpath = "//*[@id='popmake-1318']/div[2]/p")
    public WebElement popMakeText;

    @FindBy(xpath = "//*[@id='popmake-1318']/button")
    public WebElement closeButton;

    @FindBy(id = "formModal")
    public WebElement formModal;

    @FindBy(id = "g1051-name")
    public WebElement name;

    @FindBy(id = "g1051-email")
    public WebElement email;

    @FindBy(id = "contact-form-comment-g1051-message")
    public WebElement message;


    public void clickSimpleModal() {
        simpleModal.click();
        BaseClass.getLogger().info("Modal clicked");
    }

    public void clickFormModal() {
        formModal.click();
        BaseClass.getLogger().info("Form modal clicked");
    }

    public void fillForm(String username, String userEmail, String userMessage) throws InterruptedException, IOException {



        name.sendKeys(username);
        email.sendKeys(userEmail);
        message.sendKeys(userMessage);
        BaseClass.getLogger().info("Form filled with: " + username + ", " + userEmail + ", " + userMessage);
        Thread.sleep(3000);

    }

    public void verifySimpleModalText() {

        WebDriverWait wait = new WebDriverWait(Driver.getInstance(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(popMakeText));

        if (popMakeText.isDisplayed()) {
            text = popMakeText.getText();
            BaseClass.getLogger().info(text);
        } else {
            BaseClass.getLogger().info("Pop-up message not displayed");
        }
    }

    public void getPopMakeText(String message) throws IOException {
        BaseClass.getLogger().info("Verifying Text: " + message);
        if (text.equals(message)) {
            BaseClass.getLogger().info("Verified Text");
            closeButton.click();
            BaseClass.getLogger().info("Modal closed");
        } else {
            BaseClass.getLogger().info("Text does not match");
        }
    }

    //close button
    public void closeModal() {
        closeButton.click();
        BaseClass.getLogger().info("Modal Button closed");
    }

}

