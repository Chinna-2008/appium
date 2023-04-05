package com.atimi.audible.screens.widgets;

import com.atimi.audible.BaseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This is 'SortOptions' class.
 */
public class SortOptions extends BaseScreen {

    private final SortOptionsObject sortOptionsObject;

    public SortOptions(final AndroidDriver<AndroidElement> driver) {
        super(driver);
        sortOptionsObject = new SortOptionsObject(driver);
    }

    /**
     * Taps sorting header button.
     */
    public void tapSortingHeaderButton() {
        sortOptionsObject.getSortingHeaderButton().click();
    }

    /**
     * Taps sort option.
     *
     * @param sortOptionName sort option name
     */
    public void tapSortOption(final String sortOptionName) {
        List<MobileElement> shortOptions = sortOptionsObject.getSortOptions().stream().collect(Collectors.toList());
        List<MobileElement> shortOptionList = shortOptions.stream().filter(option -> option.getText().equals(sortOptionName)).collect(Collectors.toList());
        shortOptionList.forEach(option -> option.click());
    }

    @Override
    public void waitForScreenToLoad() {
    }
}