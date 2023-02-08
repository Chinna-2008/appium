package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

/**
 * This is 'LibraryScreenObject' clas.
 */
@Data
public class LibraryScreenObject {

    private final AppiumDriver driver;

    public LibraryScreenObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "com.audible.application:id/overflow_btn")
    private MobileElement bookShowMore;

    @FindBy(id = "com.audible.application:id/action_text")
    private List<MobileElement> showMoreOptions;

}