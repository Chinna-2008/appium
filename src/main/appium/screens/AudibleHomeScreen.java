package screens;

import io.appium.java_client.MobileElement;

/**
 * This is 'AudibleHomeScreen' class.
 */
public class AudibleHomeScreen extends BaseScreen {

    private final AudibleHomeScreenObject audibleHomeScreenObject;

    public AudibleHomeScreen() {
        audibleHomeScreenObject = new AudibleHomeScreenObject(appiumDriver);
    }

    /**
     * Waits for screen to load.
     */
    @Override
    public void waitForScreenToLoad() {
        waitForElementToDisplay(audibleHomeScreenObject.getAudibleLogo());
    }

    /**
     * Taps on the search button.
     */
    public void tapSearchButton() {
        audibleHomeScreenObject.getSearch().click();
    }

    /**
     * Checks is audible logo displayed or not.
     *
     * @return true / false
     */
    public boolean isAudibleLogoDisplayed() {
        return isDisplayed(audibleHomeScreenObject.getAudibleLogo());
    }

    /**
     * Taps menu tab.
     *
     * @param tabName tab name
     */
    public void tapMenuTab(final String tabName) {
        for (final MobileElement tab : audibleHomeScreenObject.getMenuTabs()) {
            String nameOfTab = tab.getText();
            if (nameOfTab.equals(tabName)) {
                tab.click();
                break;
            }
        }
    }
}