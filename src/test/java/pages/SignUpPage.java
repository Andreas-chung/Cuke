package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignUpPage extends BasePage{
    private By firstnameTextbox = By.id("firstName");
    private By lastnameTextbox = By.id("lastName");
    private By birthdateTextbox = By.id("birthdate");
    private By emailTextbox = By.id("email");
    private By mobileTextbox = By.id("mobile");
    private By passwordTextbox = By.id("password");
    private By confirmPasswordTextbox = By.id("confirmPassword");

    public SignUpPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void setFirstnameTextbox(String firstname) {
        wait.until(ExpectedConditions.elementToBeClickable(firstnameTextbox));
        webDriver.findElement(firstnameTextbox).sendKeys(firstname);
    }

    public void setLastnameTextbox(String lastname) {
        webDriver.findElement(lastnameTextbox).sendKeys(lastname);
    }


}
