package pages;

import businessLogic.BaseClass;
import instances.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccordionPage {

    // Page Object Model for Accordion Page
    // Define the locators for the elements on the page
    // Implement methods to interact with these elements
    // For example, click(), type(), getTitle()

    // Locators for the elements on the page

    @FindBy(xpath = "//*[@id='post-1261']/div/div[1]/div/details/summary")
    public WebElement accordionTitle;


    public AccordionPage() {
        if(Driver.getInstance() == null){
            Driver.setInstance(Driver.getInstance());
            PageFactory.initElements(Driver.getInstance(), this) ;
        }
        else{
            PageFactory.initElements(Driver.getInstance(), this) ;
        }

    }


    public void clickAccordion()
    {
        accordionTitle.click();
        BaseClass.getLogger().info("Accordion clicked");
        // Other actions as per the requirement
    }
}
