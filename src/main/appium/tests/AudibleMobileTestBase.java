package tests;

import common.PageRegistry;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.BeforeClass;
import pages.BasePage;

/**
 * This is 'AudibleMobileTestBase' abstract class.
 */
public abstract class AudibleMobileTestBase<AD extends AppiumDriver<? extends MobileElement>> {

    private AD myDriver = null;

    private PageRegistry pageRegistry;

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
        pageRegistry = new PageRegistry();
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
     * Gets the page.
     *
     * @param pageClass of a page class
     * @param <T> type of class
     * @return page
     */
    protected <T extends BasePage> T getPage(Class<T> pageClass) {
        T page = pageRegistry.get(pageClass);
        return page;
    }
}