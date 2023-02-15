package screens;

import io.appium.java_client.MobileElement;
import java.util.ArrayList;
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
     * Taps on book kebab button.
     */
    public void tapBookKebabButton() {
        libraryScreenObject.getKebabButton().click();
    }

    /**
     * Gets the more options of book.
     *
     * @return list of options
     */
    public List<String> getListOfMoreOptions() {
        List<String> OptionsList = new ArrayList<>();
        for (final MobileElement option : libraryScreenObject.getShowMoreOptions()) {
            String optionText = option.getText();
            OptionsList.add(optionText);
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

    /**
     * Taps sorting header button.
     */
    public void tapSortingHeaderButton() {
        libraryScreenObject.getSortingHeaderButton().click();
    }

    /**
     * Taps sort option.
     *
     * @param sortOptionName sort option name
     */
    public void tapSortOption(final String sortOptionName) {
        for (final MobileElement option : libraryScreenObject.getSortOptions()) {
            String sortOption = option.getText();
            if(sortOption.equals(sortOptionName)) {
                option.click();
                break;
            }
        }
    }

    /**
     * Gets list of audiobooks.
     *
     * @return list of books
     */
    public List<String> getAudioBooks() {
        List<String> bookList = new ArrayList<>();
        for (final MobileElement book : libraryScreenObject.getAudioBooks()) {
            String bookName = book.getText();
            bookList.add(bookName);
        }
        return bookList;
    }
}