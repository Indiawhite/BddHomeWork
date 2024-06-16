package uk.co.library.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchTest {
     HomePage homePage = new HomePage();
     ResultPage resultPage = new ResultPage();

    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {

    }
    @When("^I click on cookie$")
    public void iClickOnCookie() {
        homePage.handelCookiesInFrame();
    }

    @And("^enter job title 'Tester'$")
    public void enterJobTitleTester(String jobTitle ) {
        homePage.enterJobTitle(jobTitle);

    }

    @And("^enter Location 'Harrow'$")
    public void enterLocationHarrow(String loction) {
        homePage.enterLocation(loction);
    }

    @And("^select distance 'up to (\\d+) miles'$")
    public void selectDistanceUpToMiles(String distance) {
        homePage.selectDistance(distance);
    }

    @And("^click on moreSearchOptionsLink$")
    public void clickOnMoreSearchOptionsLink() {
        homePage.moreSearchOptionsLink();
    }

    @And("^enter salaryMin '(\\d+)'$")
    public void enterSalaryMin(String minSalary) {
        homePage.enterMinSalary(minSalary);
    }

    @And("^enter salaryMax '(\\d+)'$")
    public void enterSalaryMax(String maxSalary) {
    homePage.enterMaxSalary(maxSalary);
    }

    @And("^select salaryType 'Per annum'$")
    public void selectSalaryTypePerAnnum(String salaryType) {
        homePage.selectSalaryType(salaryType);
    }

    @And("^select jobType 'Permanent'$")
    public void selectJobTypePermanent(String jobType) {
        homePage.selectJobType(jobType);
    }

    @And("^click on 'Find Jobs' button$")
    public void clickOnFindJobsButton() {
        homePage.clickOnFindJobsButton();
    }

    @Then("^verify the result 'result'$")
    public void verifyTheResultResult() {
    }


}
