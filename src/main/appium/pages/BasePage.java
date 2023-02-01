package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static tests.AudibleMobileTestBase.driver;

/**
 * This is 'BasePage' class.
 */
public abstract class BasePage {

    public AppiumDriver appiumDriver;

    public BasePage() {
        this.appiumDriver = driver;
    }

    /**
     * Waits for page to load.
     */
    public abstract void waitForPageToLoad();

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