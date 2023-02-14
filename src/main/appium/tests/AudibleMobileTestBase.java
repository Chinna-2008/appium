package tests;

import common.ScreenRegistry;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.BeforeClass;
import screens.BaseScreen;

/**
 * This is 'AudibleMobileTestBase' abstract class.
 */
public abstract class AudibleMobileTestBase<AD extends AppiumDriver<? extends MobileElement>> {

    private AD myDriver = null;

    private ScreenRegistry screenRegistry;

    public static AppiumDriver driver;

    protected abstract AD createDriver();

    /**
     * Gets the driver.
     *
     * @return driver
     */
    public AD getDriver() {
        return myDriver;
    }

    /**
     * Set up the session before class.
     */
    @BeforeClass
    public final void setUpSessionBeforeClass() {
        setUpDriver();
        driver = getDriver();
        screenRegistry = new ScreenRegistry();
    }

    /**
     * Set up the driver.
     */
    private void setUpDriver() {
        try {
            if (myDriver != null) {
                myDriver.quit();
            } else {
                myDriver = createDriver();
            }
        } catch (final Exception ex) {
            throw ex;
        }
    }

    /**
     * Gets the screen.
     *
     * @param screenClass screen class
     * @param <T> type of class
     * @return screen
     */
    protected <T extends BaseScreen> T getScreen(Class<T> screenClass) {
        T screen = screenRegistry.get(screenClass);
        return screen;
    }
}