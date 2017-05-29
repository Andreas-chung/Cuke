package pages;


import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected WebDriver webDriver;
    protected final String BASE_URL = "https://www.wire.travelex.co.uk";

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

}
