package uk.co.library.runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import uk.co.library.utility.Utility;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/java/resources/featuresfile", // change your feature file path from package
            glue = "uk/co/library", // select step defination path from parent directory
            plugin = {"pretty",
                    "html:target/cucumber-report/cucumber.html",
                    "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html",
                    "json:target/RunCuke/cucumber.json"}
    )

    public class TestRunner  {

        @AfterClass
        public static void setUp() {
            String projectPath = System.getProperty("user.dir");
            String reportConfigPath = projectPath + "/src/test/java/resources/propertiesfile/confie.properties";
            Reporter.loadXMLConfig(reportConfigPath);
            Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
            Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
            Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
            Reporter.setSystemInfo("Selenium", "4.15");
            Reporter.setSystemInfo("Maven", "3.9");
            Reporter.setSystemInfo("Java Version", "17");
        }

    }
