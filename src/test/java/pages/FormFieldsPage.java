package pages;

import businessLogic.BaseClass;
import instances.Driver;
import org.junit.Assert;
import org.junit.internal.runners.statements.Fail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class FormFieldsPage {


    public FormFieldsPage() {
        PageFactory.initElements(Driver.getInstance(), this);

    }

    @FindBy(xpath = "//*[@id='name-input']")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;


    @FindBy(id = "automation")
    public WebElement automationCheckbox;



    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(id = "message")
    public WebElement messageInput;


    //implementation for onlu selecting one element at a time

    //enter name
    public void enterName(String name) {
        BaseClass.getLogger().info("Entering name: " + name);
        nameInput.sendKeys(name);
    }

    //enter password
    public void enterPassword(String password) {
        BaseClass.getLogger().info("Entering password: " + password);
        passwordInput.sendKeys(password);
    }



    public void selectFavoriteDrink(String drink) {

        switch (drink.toLowerCase()) {
            case "water":
                BaseClass.getLogger().info("Selected water as the favorite drink");
                Driver.getInstance().findElement(By.id("drink1")).click();
                break;
            case "milk":
                BaseClass.getLogger().info("Selected milk as the favorite drink");
                Driver.getInstance().findElement(By.id("drink2")).click();
                break;
            case "coffee":
                BaseClass.getLogger().info("Selected coffee as the favorite drink");
                Driver.getInstance().findElement(By.id("drink3")).click();
                break;
            case "wine":
                BaseClass.getLogger().info("Selected wine as the favorite drink");
                Driver.getInstance().findElement(By.id("drink4")).click();
                break;
            case "Ctrl-Alt-Delight":
                BaseClass.getLogger().info("Selected Ctrl-Alt-Delight as the favorite drink");
                Driver.getInstance().findElement(By.id("drink5")).click();
                break;

            default:
                BaseClass.getLogger().error("Invalid drink selection");
                Assert.fail("Invalid Drink Selection!");

        }
    }

    public void selectFavoriteColor(String color) {
        switch (color.toLowerCase()) {

            case "red":
                BaseClass.getLogger().info("Selected red as the favorite color");
                Driver.getInstance().findElement(By.id("color1")).click();
                break;
            case "blue":
                BaseClass.getLogger().info("Selected blue as the favorite color");
                Driver.getInstance().findElement(By.id("color2")).click();
                break;
            case "yellow":
                BaseClass.getLogger().info("Selected green as the favorite color");
                Driver.getInstance().findElement(By.id("color3")).click();
                break;
            case "green":
                BaseClass.getLogger().info("Selected yellow as the favorite color");
                Driver.getInstance().findElement(By.id("color4")).click();
                break;
            case "#FFC0CB":
                    BaseClass.getLogger().info("Selected #FFC0CB as the favorite color");
                    Driver.getInstance().findElement(By.id("color5")).click();
                break;
                default:
                    BaseClass.getLogger().error("Invalid color selection");
                    Assert.fail("Invalid Color Selection!");
        }
    }

    //select dropdown color
    public void selectIfYouLikeAutomationn(String answer) {
        Select dropDown = new Select(automationCheckbox);
        dropDown.selectByVisibleText(answer);
        BaseClass.getLogger().info("Selected " + answer + " from dropdown");
    }

        //enter email
    public void enterEmail(String email) {
        BaseClass.getLogger().info("Entering email: " + email);
        emailInput.sendKeys(email);
    }

    //enter message
    public void enterMessage(String message) {
        BaseClass.getLogger().info("Entering message: " + message);
        messageInput.sendKeys(message);
    }

}
