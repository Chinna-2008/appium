package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.BeforeClass;

/**
 * This is 'AudibleMobileTestBase' abstract class.
 */
public abstract class AudibleMobileTestBase<AD extends AppiumDriver<? extends MobileElement>> {

    private AD driver = null;

    protected abstract AD createDriver();

    /**
     * Gets the driver.
     *
     * @return driver
     */
    public AD getDriver() {
        return driver;
    }

    /**
     * Set up the session before class.
     */
    @BeforeClass
    public final void setUpSessionBeforeClass() {
        setUpDriver();
    }

    /**
     * Set up the driver.
     */
    private void setUpDriver() {
        try {
            if (driver != null) {
                driver.quit();
            } else {
                driver = createDriver();
            }
        } catch (final Exception ex) {
            throw ex;
        }
    }
}