package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * This is 'HomeScreen' class.
 */
public class HomeScreen extends BaseScreen {

    private final HomeScreenObject homeScreenObject;

    public HomeScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
        homeScreenObject = new HomeScreenObject(driver);
    }

    /**
     * Waits for screen to load.
     */
    @Override
    public void waitForScreenToLoad() {
        waitForElementToDisplay(homeScreenObject.getAudibleLogo());
    }

    /**
     * Taps on the search button.
     */
    public void tapSearchButton() {
        homeScreenObject.getSearch().click();
    }

    /**
     * Checks is audible logo displayed or not.
     *
     * @return true / false
     */
    public boolean isAudibleLogoDisplayed() {
        return isDisplayed(homeScreenObject.getAudibleLogo());
    }

    /**
     * Taps menu tab.
     *
     * @param tabName tab name
     */
    public void tapMenuTab(final String tabName) {
        for (final MobileElement tab : homeScreenObject.getMenuTabs()) {
            String nameOfTab = tab.getText();
            if (nameOfTab.equals(tabName)) {
                tab.click();
                break;
            }
        }
    }
}