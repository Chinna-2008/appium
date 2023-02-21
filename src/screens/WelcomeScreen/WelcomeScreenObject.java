package screens.WelcomeScreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is 'WelcomeScreenObject' class.
 */
@Data
public class WelcomeScreenObject {
    private final AppiumDriver driver;

    public WelcomeScreenObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "com.audible.application:id/get_started_button")
    private MobileElement getStarted;



    @FindBy(id = "com.audible.application:id/sign_in_button")
    private MobileElement signIn;
}