package instances;



import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    //ThreadLocal used to manage the driver

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    //private constructor to prevent the creation of new instances of Driver
    private Driver() {
    }

    //method to get the driver instance using lazy initialization
    public static WebDriver getInstance() {
        if (driver.get() == null) {
            driver.set(new ChromeDriver());
        }
        return driver.get();
    }

    //set driver instance using lazy initialization
    public static void setInstance(WebDriver driver) {
        Driver.driver.set(driver);
    }

    public static WebElement findElementById(String element) {
        //Implementation for finding elements based on element
        // Example: driver.findElement(By.id(element));
        return Driver.getInstance().findElement(By.id(element));
    }

    public static WebElement findElementByXpath(String element) {
        //Implementation for finding elements based on element
        // Example: driver.findElement(By.xpath(element));
        return Driver.getInstance().findElement(By.xpath(element));
    }

    public static WebElement findElementByName(String element) {
        //Implementation for finding elements based on element
        // Example: driver.findElement(By.name(element));
        return Driver.getInstance().findElement(By.name(element));
    }
}