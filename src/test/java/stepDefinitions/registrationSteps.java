package stepDefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;


public class registrationSteps {
    HomePage homePage;
    WebDriver driver;

    public registrationSteps() {
        this.driver = Hooks.driver;
        this.homePage = new HomePage(driver);
    }



    @Given("^Bob is at the website on the browser$")
    public void bobIsAtTheWebsiteOnTheBrowser() throws Throwable {
        homePage.navigateTo();
        throw new PendingException();
    }


    @When("^Bob click on Sign up and enter his details$")
    public void bobClickOnSignUpAndEnterHisDetails() throws Throwable {

        throw new PendingException();
    }

    @Then("^Bob should be able to register$")
    public void bobShouldBeAbleToRegister() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
