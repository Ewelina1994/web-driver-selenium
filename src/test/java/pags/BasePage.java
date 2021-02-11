package pags;

import config.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
    static final int WAIT_TIMEOUT = 10;
    private static WebDriverWait wait = new WebDriverWait(WebDriverSingleton.getInstance(), WAIT_TIMEOUT);
    public BasePage() {
        PageFactory.initElements(WebDriverSingleton.getInstance(), this);
        wait.until(ExpectedConditions.visibilityOf(pageContent));

    }

    @FindBy(id = "columns")
    private WebElement pageContent;
}
