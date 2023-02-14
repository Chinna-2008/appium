package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static tests.AudibleMobileTestBase.driver;

/**
 * This is 'BaseScreen' class.
 */
public abstract class BaseScreen {

    public AppiumDriver appiumDriver;

    public BaseScreen() {
        this.appiumDriver = driver;
    }

    /**
     * Waits for screen to load.
     */
    public abstract void waitForScreenToLoad();

    /**
     * Waits for element to load.
     *
     * @param element mobile element
     */
    public void waitForMobileElement(final MobileElement element) {
        WebDriverWait wait = new WebDriverWait(appiumDriver, 50);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Checks element is displayed or not.
     *
     * @param mobileElement mobile element
     * @return true / false
     */
    public boolean isDisplayed(final MobileElement mobileElement) {
        try {
            return mobileElement.isDisplayed();
        } catch (final NotFoundException ex) {
            return false;
        }
    }

    /**
     * Waits for until element to display.
     *
     * @param element element
     */
    public void waitForElementToDisplay(final WebElement element) {
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