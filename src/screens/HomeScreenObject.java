package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * This is 'HomeScreenObject' class.
 */
@Data
public class HomeScreenObject {

    private final AppiumDriver driver;

    public HomeScreenObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "com.audible.application:id/logo_themed")
    private MobileElement audibleLogo;

    @FindBy(id = "com.audible.application:id/ic_opaque")
    private MobileElement search;

    @FindBy(className = "android.widget.TextView")
    private List<MobileElement> menuTabs;
}