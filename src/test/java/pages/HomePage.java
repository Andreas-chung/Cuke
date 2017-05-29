package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By signUpButton =By.id("");

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }


    public void signUpButtonIsClicked() {

    }

    public void navigateTo() {
        webDriver.navigate().to(BASE_URL);
    }

}
