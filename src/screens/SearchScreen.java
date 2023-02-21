package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * This is 'SearchScreen' class.
 */
public class SearchScreen extends BaseScreen {

    private final SearchScreenObject searchScreenObject;

    public SearchScreen(AndroidDriver<AndroidElement> driver) {
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