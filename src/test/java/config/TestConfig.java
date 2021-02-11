package config;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static utility.ScreenShoot.captureScreenshot;

public class TestConfig {
    private WebDriver driver;

    @Before
    public void setUp() {
        String baseUrl = "http://automationpractice.com/index.php";

        driver = WebDriverSingleton.getInstance();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @After
    public void tearDown() {
        captureScreenshot();
        WebDriverSingleton.quit();
    }
}
