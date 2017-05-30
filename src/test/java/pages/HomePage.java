package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {


    private By signUpButton = By.cssSelector("body > app > ui-view > tvx-landing > div > header > div > div.button-wrap > button.account-action.sign-up");

    private By firstnameTextbox = By.id("firstname");

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }


    public void signUpButtonIsClicked() {
        wait.until(ExpectedConditions.elementToBeClickable(signUpButton));
        webDriver.findElement(signUpButton).click();

    }

    public void setFirstnameTextbox(String firstname) {
        wait.until(ExpectedConditions.elementToBeClickable(firstnameTextbox));
        webDriver.findElement(firstnameTextbox).sendKeys(firstname);
    }

    public void navigateTo() {
        webDriver.navigate().to(BASE_URL);
    }

}
