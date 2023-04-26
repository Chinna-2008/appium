package com.atimi.audible.screens.widgets;

import com.atimi.audible.BaseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This is 'LibrarySortAndroid' class.
 */
public class LibrarySortAndroid extends BaseScreen {

    private final LibrarySortObject librarySortObject;

    public LibrarySortAndroid(final AndroidDriver<AndroidElement> driver) {
        super(driver);
        librarySortObject = new LibrarySortObject(driver);
    }

    /**
     * Taps sorting header button.
     */
    public void tapSortingHeaderButton() {
        librarySortObject.getSortingHeaderButton().click();
    }

    /**
     * Taps sort option.
     *
     * @param sortOptionName sort option name
     */
    public void tapSortOption(final String sortOptionName) {
        List<MobileElement> shortOptions = librarySortObject.getSortOptions().stream().collect(Collectors.toList());
        List<MobileElement> shortOptionList = shortOptions.stream().filter(option -> option.getText().equals(sortOptionName)).collect(Collectors.toList());
        shortOptionList.forEach(option -> option.click());
    }

    @Override
    public void waitForScreenToLoad() {
    }
}
