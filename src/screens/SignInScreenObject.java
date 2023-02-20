package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is 'AudibleSignInScreenObject' class.
 */
@Data
public class SignInScreenObject {

    private final AppiumDriver driver;

    public SignInScreenObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Sign in using your Amazon Account']")
    private MobileElement signInScreen;

    @FindBy(xpath = "//android.widget.EditText[@resource-id='ap_email']")
    private MobileElement enterEmailID;

    @FindBy(xpath = "//android.widget.EditText[@resource-id='ap_password']")
    private MobileElement enterPassword;

    @FindBy(xpath = "//android.widget.Button[@resource-id='signInSubmit']")
    private MobileElement signInButton;

    @FindBy(xpath = "//android.view.View[@text='Your password is incorrect']")
    private MobileElement errorMessage;
}