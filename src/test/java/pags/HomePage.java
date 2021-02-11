package pags;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import static utility.ScreenShoot.captureScreenshot;

public class HomePage extends BasePage {
    public HomePage() {
        super();
    }

    @FindBy(css = "[title=\"Log in to your customer account\"]")
    WebElement loginButton;

    @Step
    public SignIn openSignInPage() {
        loginButton.click();
        captureScreenshot();
        return new SignIn();
    }
}
