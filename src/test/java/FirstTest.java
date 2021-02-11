import com.google.common.annotations.VisibleForTesting;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class FirstTest {

   public static WebDriver webDriver;

   @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "D:\\github\\seleniutest\\chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //open the web app
        webDriver.navigate().to("http://automationpractice.com/index.php");
        webDriver.manage().window().maximize();


    }

    @Test
    public void checkIsEqualsTitle(){
        String title = webDriver.getTitle();
        Assert.assertEquals(title, "My Store");
    }

    @Test
    public void userRegistrationWithValidDate() throws InterruptedException {
       webDriver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        Thread.sleep(5000);
        webDriver.findElement(By.id("email_create")).sendKeys("random@gmail.com");
        webDriver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(5000);
        webDriver.findElement(By.id("id_gender2")).click();
        webDriver.findElement(By.id("customer_firstname")).sendKeys("Random Name");
        webDriver.findElement(By.id("customer_lastname")).sendKeys("Farndom");
        webDriver.findElement(By.id("submitAccount")).click();
        Thread.sleep(5000);

        boolean isAlertDisplay = webDriver.findElement(By.className("alert")).isDisplayed();
        Assert.assertTrue(isAlertDisplay);
    }
}
