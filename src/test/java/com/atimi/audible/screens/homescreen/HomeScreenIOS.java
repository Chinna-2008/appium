package com.atimi.audible.screens.homescreen;

import com.atimi.audible.BaseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

/**
 * This is 'HomeScreenIOS' class.
 */
public class HomeScreenIOS extends BaseScreen {

    private final HomeScreenObject homeScreenObject;

    public HomeScreenIOS(final IOSDriver<IOSElement> driver) {
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