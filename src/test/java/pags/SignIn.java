package pags;

import org.hamcrest.core.IsCollectionContaining;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import utility.DataFaker;

import java.util.List;

import static org.hamcrest.core.IsCollectionContaining.*;
import static utility.ScreenShoot.captureScreenshot;

public class SignIn extends BasePage{
    private DataFaker faker = new DataFaker();

    public SignIn() {
        super();
    }
    @FindBy(id = "email_create")
    WebElement emailField;

    @FindBy(id = "SubmitCreate")
    WebElement createdAccountButton;

    @FindBy(id = "email")
    WebElement emailFieldLogin;

    @FindBy(id = "passwd")
    WebElement passwordField;

    @FindBy(id="SubmitLogin")
    WebElement loginButton;

    @FindBy(className = "alert")
    private WebElement alertMessage;

    @Step
    public SignUp submitCreateAccountFormWithValidEmail() {
        emailField.sendKeys(faker.getFakeEmail());
        captureScreenshot();
        createdAccountButton.click();
        return new SignUp();
    }

    @Step
    public void submitLoginWithNotValidDate() {
        emailFieldLogin.sendKeys(faker.getFakeEmail());
        captureScreenshot();
        passwordField.sendKeys(faker.getFakePassword());
        loginButton.click();
    }
    @Step
    public void userShouldSeeLoginFormAlert() {
        String EXPECTED_MESSAGE = "Invalid email address.";
        Assert.assertEquals(alertMessage.getText(), EXPECTED_MESSAGE);
    }
}
