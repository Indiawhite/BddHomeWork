package com.argos.driverfactory;

import com.argos.propertyreader.PropertyReader;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.logging.LogManager;

import static java.util.logging.LogManager.*;

public class ManageDriver {

    public static WebDriver driver;
    public String baseUrl = PropertyReader.getInstance().getProperty("baseUrl");
    // private static final ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    private static final Logger log = org.apache.log4j.LogManager.getLogger(ManageDriver.class.getName());

    public ManageDriver(){
        PageFactory.initElements(driver,this);
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/java/resources/propertiesfile");

    }

    public void selectBrowser(String browser){
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(baseUrl);
    }

    public void closeBrowser(){
        if (driver != null){
            driver.quit();
        }
    }


}
