package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
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
     * @param element web element
     */
    public void waitForMobileElement(final MobileElement element) {
        WebDriverWait wait = new WebDriverWait(appiumDriver, 20);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}