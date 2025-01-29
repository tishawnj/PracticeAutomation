package pages;

import businessLogic.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import instances.Driver;


import java.io.IOException;

public class HomePage {


    public HomePage (){
        PageFactory.initElements(Driver.getInstance(), this);
    }

    @FindBy(xpath = "//*[@id='post-36']/div/div[2]/div/div[3]/div[2]/div/a")
    public WebElement modalsLink;


    @FindBy(xpath = "//*[@id='post-36']/div/div[2]/div/div[1]/div[7]/div/a")
    public WebElement accordionLink;

    @FindBy(xpath = "//*[@id='post-36']/div/div[2]/div/div[2]/div[1]/div/a")
    public WebElement formFieldsLink;

    public void openModalsPage() {
        BaseClass.getLogger().info("Scrolling down Page...");
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getInstance();
        executor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Actions actions = new Actions(Driver.getInstance());
        actions.moveToElement(modalsLink).click().perform();
        BaseClass.getLogger().info("Modals link found and clicked!");

    }
    
    public void openAccordionPage() {
        BaseClass.getLogger().info("Scrolling to bottom of Page...");
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getInstance();
        executor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Actions actions = new Actions(Driver.getInstance());
        actions.moveToElement(accordionLink).click().perform();
        BaseClass.getLogger().info("Form Fields link found and clicked!");
    }

    public void openFormFieldsPage() throws InterruptedException {
        BaseClass.getLogger().info("Scrolling to top of Page...");
        formFieldsLink.click();
        Thread.sleep(5000);
    }




}
