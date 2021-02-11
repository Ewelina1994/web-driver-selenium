package utility;

import config.WebDriverSingleton;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;

public class ScreenShoot {
    @Attachment(value="Screenshot", type="image/png")
    public static byte[] captureScreenshot() {
        return ((TakesScreenshot) WebDriverSingleton.getInstance()).getScreenshotAs(OutputType.BYTES);
    }
}
