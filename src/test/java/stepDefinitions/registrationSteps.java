package stepDefinitions;


import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SignUpPage;

import java.util.List;


public class registrationSteps {
    HomePage homePage;
    SignUpPage signupPage;
    WebDriver driver;

    public registrationSteps() {
        this.driver = Hooks.driver;
        this.homePage = new HomePage(driver);
        this.signupPage = new SignUpPage(driver);
    }



    @Given("^Bob is at the website on the browser$")
    public void bobIsAtTheWebsiteOnTheBrowser() throws Throwable {
        homePage.navigateTo();

    }


    @Then("^Bob should be able to register$")
    public void bobShouldBeAbleToRegister() throws Throwable {
        System.out.print("skdsg");

    }

    @When("^Bob click on Sign up and enter his details$")
    public void bobClickOnSignUpAndEnterHisDetails(DataTable dataTable) throws Throwable {
        homePage.signUpButtonIsClicked();
        List<List<String>> data = dataTable.raw();
        signupPage.setFirstnameTextbox(data.get(0).get(0));
        signupPage.setLastnameTextbox(data.get(0).get(1));
        throw new PendingException();
    }
}
