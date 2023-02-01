package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is 'AudibleWelcomePageObject' class.
 */
@Data
public class AudibleWelcomePageObject {

    private final AppiumDriver driver;

    public AudibleWelcomePageObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "com.audible.application:id/get_started_button")
    private MobileElement getStartedButton;

    @FindBy(id = "com.audible.application:id/logo_themed")
    private MobileElement audibleLogo;
}