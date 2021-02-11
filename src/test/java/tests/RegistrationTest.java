package tests;

import config.TestConfig;
import org.junit.Test;
import pags.HomePage;

public class RegistrationTest extends TestConfig {
    @Test
    public void userShouldSuccessfullyRegister() {
        new HomePage()
                .openSignInPage()
                .submitCreateAccountFormWithValidEmail()
                .submitFormWithValidData()
                .userShouldBeSuccessfullyRegistered();
    }
    @Test
    public void registrationWithInvalidDataShouldFail() {
        new HomePage()
                .openSignInPage()
                .submitCreateAccountFormWithValidEmail()
                .submitFormWithInvalidData()
                .userShouldSeeRegistrationFormAlert();
    }
}
