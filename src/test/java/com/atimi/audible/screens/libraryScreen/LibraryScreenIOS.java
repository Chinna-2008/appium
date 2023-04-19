package com.atimi.audible.screens.libraryScreen;

import com.atimi.audible.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * This is 'LibraryScreenIOS' class.
 */
public class LibraryScreenIOS extends BaseScreen {

    private final LibraryScreenObject libraryScreenObject;

    public LibraryScreenIOS(final AndroidDriver<AndroidElement> driver) {
        super(driver);
        libraryScreenObject = new LibraryScreenObject(driver);
    }

    /**
     * Waits for screen to load.
     */
    @Override
    public void waitForScreenToLoad() {
        waitForElementToDisplay(libraryScreenObject.getOverflowButton());
    }
}