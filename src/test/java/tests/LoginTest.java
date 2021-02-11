package tests;

import config.TestConfig;
import org.junit.Test;
import pags.SignIn;

public class LoginTest extends TestConfig {

    @Test
    public void userShouldNotLoginAndSeeAlertDialog() {
        SignIn signIn = new SignIn();
        signIn.submitLoginWithNotValidDate();
            signIn.userShouldSeeLoginFormAlert();
    }
}
