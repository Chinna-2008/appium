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

    /**
     * Waits for screen to load.
     */
    @Override
    public void waitForScreenToLoad() {
        waitForElementToDisplay(libraryScreenObject.getKebabButton());
    }

    /**
     * Taps on book kebab button.
     */
    public void tapBookKebabButton() {
        libraryScreenObject.getKebabButton().click();
    }

    /**
     * Gets the kebab options of book.
     *
     * @return list of kebab options
     */
    public List<String> getListOfKebabOptions() {
        List<String> kebabOptionsList = new ArrayList<>();
        for (final MobileElement option : libraryScreenObject.getKebabOptions()) {
            kebabOptionsList.add(option.getText());
        }
        return kebabOptionsList;
    }

    /**
     * Taps audiobook kebab option.
     *
     * @param kebabOptionName option name
     */
    public void tapAudiobookKebabOption(final String kebabOptionName) {
        for (final MobileElement kebabOption : libraryScreenObject.getKebabOptions()) {
            String optionName = kebabOption.getText();
            if (optionName.equals(kebabOptionName)) {
                kebabOption.click();
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
    public List<String> getAudiobooks() {
        List<String> audioBookList = new ArrayList<>();
        for (final MobileElement book : libraryScreenObject.getAudioBooks()) {
            String bookName = book.getText();
            audioBookList.add(bookName);
        }
        System.out.println(String.format("Audiobook list: %s", audioBookList));
        return audioBookList;
    }
}