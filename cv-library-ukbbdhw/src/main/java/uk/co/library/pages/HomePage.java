package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "gdpr-consent-notice")
    WebElement cookieTframe;

    @CacheLookup
    @FindBy(xpath = "//*[@id='save']/span[1]/div/span")
    WebElement cookies;

    public void handelCookiesInFrame(){
        driver.switchTo().frame(cookieTframe);
        clickOnElement(cookies);
        driver.switchTo().defaultContent();

    }

    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitleField;

    public void enterJobTitle(String jobTitle) {
        sendTextToElement(jobTitleField, jobTitle);
    }

    @CacheLookup
    @FindBy(id = "location")
    WebElement locationField;

    public void enterLocation(String location) {
        sendTextToElement(locationField, location);

    }

    @CacheLookup
    @FindBy(id = "distance")
    WebElement distanceField;

    public void selectDistance(String distance) {
        sendTextToElement(distanceField, distance);
    }

    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;

    public void moreSearchOptionsLink(){
        clickOnElement(moreSearchOptionsLink);
    }

    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMinField;

    public void enterMinSalary(String minSalary){
        sendTextToElement(salaryMinField,minSalary);
    }

    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMaxField;

    public void enterMaxSalary(String maxSalary){
       sendTextToElement(salaryMaxField,maxSalary);
    }
  @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryTypeField;

    public void selectSalaryType(String salaryType) {
        sendTextToElement(salaryTypeField, salaryType);
    }
    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypeField;

    public void selectJobType(String jobType) {
        sendTextToElement(jobTypeField, jobType);
    }
    @CacheLookup
    @FindBy (id = "hp-search-btn")
    WebElement jobButton;

    public void clickOnFindJobsButton(){
        clickOnElement(jobButton);





    }
}