package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is 'AudibleHomeScreenObject' class.
 */
@Data
public class AudibleHomeScreenObject {

    private final AppiumDriver driver;

    public AudibleHomeScreenObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "com.audible.application:id/logo_themed")
    private MobileElement audibleLogo;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Profile\"]/android.widget.ImageView")
    private MobileElement profile;
}