package screens;

import io.appium.java_client.MobileElement;

import java.util.ArrayList; // TODO : Remove extra space.
import java.util.List;

/**
 * This is 'LibraryScreen' class.
 */
public class LibraryScreen extends BaseScreen {

    private final LibraryScreenObject libraryScreenObject;

    public LibraryScreen() {
        libraryScreenObject = new LibraryScreenObject(appiumDriver);
    }

    @Override
    public void waitForScreenToLoad() {
    }

    /**
     * Taps on book show more button.
     */
    public void tapBookShowMoreButton() {
        libraryScreenObject.getBookShowMore().click();
    }

    /**
     * Gets the more options of book.
     *
     * @return list of options
     */
    public List<String> getListOfMoreOptions() {
        List<String> OptionsList = new ArrayList<>();
        for (final MobileElement list : libraryScreenObject.getShowMoreOptions()) {
            String actualList = list.getText();
            OptionsList.add(actualList);
        }
        return OptionsList;
    }

    /**
     * Taps on option.
     *
     * @param optionName option name
     */
    public void tapOption(final String optionName) {
        for (final MobileElement oneOption : libraryScreenObject.getShowMoreOptions()) {
            String option = oneOption.getText();
            if (option.equals(optionName)) {
                oneOption.click();
                break;
            }
        }
    }
}