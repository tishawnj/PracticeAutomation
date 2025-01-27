package businessLogic;


//import logger 4j

import instances.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

    static Logger logger;
    // public static final String propertyFilePath = "src/test/resources/config.properties";
     static Properties properties;


     public static void initializeBrowser(WebDriver driver) throws IOException {

         properties = getProperties();
         BaseClass.getLogger().info("Initializing browser and navigating to the application");
         Driver.getInstance().get(properties.getProperty("Url"));
         Driver.getInstance().manage().window().maximize();
         Driver.getInstance().manage().deleteAllCookies();
         BaseClass.getLogger().info("Driver Set Up Successfully!");
     }

    public BaseClass() {
        logger.info("BaseClass constructor called");
    }

    public void baseMethod() {
        logger.info("BaseClass baseMethod called");
    }

    public static Logger getLogger() {
        logger = LogManager.getLogger(); //Log4j
        return logger;
    }

    public static Properties getProperties() throws IOException
    {
        FileReader file=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
        properties=new Properties();
        properties.load(file);
        return properties;
    }

    public static void movetoElement(WebElement element) {



    }


}

