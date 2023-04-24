package com.atimi.audible.screens.searchscreen;

import com.atimi.audible.BaseScreen;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

/**
 * This is 'SearchScreenIOS' class.
 */
public class SearchScreenIOS extends BaseScreen {

    private final SearchScreenObject searchScreenObject;

    public SearchScreenIOS(final IOSDriver<IOSElement> driver) {
        super(driver);
        searchScreenObject = new SearchScreenObject(driver);
    }

    /**
     * Waits for element to display.
     */
    @Override
    public void waitForScreenToLoad() {
        waitForElementToDisplay(searchScreenObject.getStoryOfBuddha());
    }

    /**
     * Enters the search text.
     *
     * @param searchText search text
     */
    public void enterSearchText(final String searchText) {
        searchScreenObject.getSearchBox().sendKeys(searchText);
    }

    /**
     * Taps on audiobook.
     */
    public void tapBook() {
        searchScreenObject.getStoryOfBuddha().click();
    }
}
