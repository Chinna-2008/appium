package tests;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 * This is 'AudibleMobileTestBase' abstract class.
 */
public abstract class AudibleMobileTestBase {

    private AppiumDriver driver = null;

    protected abstract AppiumDriver createDriver();

    /**
     * Gets the driver.
     *
     * @return driver
     */
    public AppiumDriver getDriver() {
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
     * Set up the session before method.
     */
    @BeforeMethod
    public final void setUpSessionBeforeMethod() {
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