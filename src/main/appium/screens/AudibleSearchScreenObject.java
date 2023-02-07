package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *  This is 'AudibleSearchScreenObject' class.
 */
@Data
public class AudibleSearchScreenObject {

    private final AppiumDriver driver;

    public AudibleSearchScreenObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "com.audible.application:id/search_src_text")
    private MobileElement searchBox;

    @FindBy(id = "com.audible.application:id/title")
    private MobileElement storyOfBuddha;
}