package com.atimi.audible.screens.widgets;

import com.atimi.audible.BaseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This is 'LibrarySortIOS' class.
 */
public class LibrarySortIOS extends BaseScreen {

    private final LibrarySortObject librarySortObject;

    public LibrarySortIOS(final IOSDriver<IOSElement> driver) {
        super(driver);
        librarySortObject = new LibrarySortObject(driver);
    }

    @Override
    public void waitForScreenToLoad() {
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
}
