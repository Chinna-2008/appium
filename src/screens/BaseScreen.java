package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This is 'BaseScreen' class.
 */
public abstract class BaseScreen {

    public AppiumDriver driver;

    public BaseScreen(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    /**
     * Waits for screen to load.
     */
    public abstract void waitForScreenToLoad();

    /**
     * Checks element is displayed or not.
     *
     * @param mobileElement mobile element
     * @return true / false
     */
    public boolean isDisplayed(final MobileElement mobileElement) {
        try {
            return mobileElement.isDisplayed();
        } catch (final NotFoundException exception) {
            return false;
        }
    }

    /**
     * Waits for until element to display.
     *
     * @param element element
     */
    public void waitForElementToDisplay(final MobileElement element) {
        getWait().until(driver -> element.isDisplayed());
    }

    /**
     * Gets wait.
     *
     * @return duration in seconds
     */
    public WebDriverWait getWait() {
        return new WebDriverWait(driver, 40);
    }
}