package screens;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

/**
 * This is 'LibraryScreen' class.
 */
public class LibraryScreen extends BaseScreen {

    private final LibraryScreenObject libraryScreenObject;

    public LibraryScreen() {
        libraryScreenObject = new LibraryScreenObject(driver);
    }

    /**
     * Waits for screen to load.
     */
    @Override
    public void waitForScreenToLoad() {
        waitForElementToDisplay(libraryScreenObject.getHamburgerButton());
    }

    /**
     * Taps on hamburger button.
     *
     * @param audiobookName audiobook name
     */
    public void tapAudiobookHamburgerButton(final String audiobookName) {
        for (final MobileElement book : libraryScreenObject.getAudioBooks()) {
            String bookName = book.getText();
            if (bookName.equals(audiobookName)) {
                By hamburgerButton = By.xpath(String.format("//android.widget.TextView[@text= '%s']/../../../../../../following-sibling::android.view.ViewGroup/android.view.ViewGroup/android.widget.Button", audiobookName));
                driver.findElement(hamburgerButton).click();
                break;
            }
        }
    }

    /**
     * Gets the hamburger options of book.
     *
     * @return list of hamburger options
     */
    public List<String> getListOfHamburgerOptions() {
        List<String> hamburgerOptionsList = new ArrayList<>();
        for (final MobileElement option : libraryScreenObject.getHamburgerOptions()) {
            hamburgerOptionsList.add(option.getText());
        }
        return hamburgerOptionsList;
    }

    /**
     * Taps audiobook hamburger option.
     *
     * @param hamburgerOptionName hamburger option name
     */
    public void tapAudiobookHamburgerOption(final String hamburgerOptionName) {
        for (final MobileElement hamburgerOption : libraryScreenObject.getHamburgerOptions()) {
            String optionName = hamburgerOption.getText();
            if (optionName.equals(hamburgerOptionName)) {
                hamburgerOption.click();
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