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
        BaseClass.movetoElement(modalsLink);
        BaseClass.getLogger().info("Modals link found and clicked!");

    }
    
    public void openAccordionPage() {
        BaseClass.getLogger().info("Scrolling to bottom of Page...");
        BaseClass.movetoElement(accordionLink);
        BaseClass.getLogger().info("Form Fields link found and clicked!");
    }

    public void openFormFieldsPage() throws InterruptedException {
        //BaseClass.getLogger().info("Scrolling to top of Page...");
        formFieldsLink.click();
        BaseClass.getLogger().info("Form Field link found and clicked!");
        Thread.sleep(5000);
    }




}
