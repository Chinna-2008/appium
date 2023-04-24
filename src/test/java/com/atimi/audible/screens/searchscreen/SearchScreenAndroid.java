package com.atimi.audible.screens.searchscreen;

import com.atimi.audible.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * This is 'SearchScreenAndroid' class.
 */
public class SearchScreenAndroid extends BaseScreen {
    private final SearchScreenObject searchScreenObject;

    public SearchScreenAndroid(final AndroidDriver<AndroidElement> driver) {
        super(driver);
        searchScreenObject = new SearchScreenObject(driver);
    }

    @Override
    public void waitForScreenToLoad() {
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
