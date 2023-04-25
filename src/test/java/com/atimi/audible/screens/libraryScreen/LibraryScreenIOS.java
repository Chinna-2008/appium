package com.atimi.audible.screens.libraryScreen;

import com.atimi.audible.BaseScreen;
import com.atimi.audible.screens.widgets.LibrarySortIOS;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.NoSuchElementException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.atimi.audible.utils.IOS.scrollToTextInIOS;

/**
 * This is 'LibraryScreenIOS' class.
 */
public class LibraryScreenIOS extends BaseScreen {

    private final LibraryScreenObject libraryScreenObject;

    public LibraryScreenIOS(final IOSDriver<IOSElement> driver) {
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

    /**
     * Scroll up to audiobook.
     */
    public void scrollUpToAudiobook(final String audiobook) {
        scrollToTextInIOS((IOSDriver<MobileElement>) driver, audiobook);
    }

    /**
     * Taps on overflow button.
     *
     * @param audiobookName audiobook name
     */
    public void tapAudiobookOverflowButton(final String audiobookName) {
        for (final MobileElement audiobookCell : libraryScreenObject.getAudiobookCells()) {
            try {
                MobileElement bookTitles = audiobookCell.findElement(MobileBy.iOSNsPredicateString("name == \"metadata_titlegroup\""));
                String bookTitle = bookTitles.getText();
                if (bookTitle.equals(audiobookName)) {
                    MobileElement overflow = audiobookCell.findElement(MobileBy.iOSNsPredicateString("name CONTAINS \"accessory_button_detail_\""));
                    overflow.click();
                    break;
                }
            } catch (final NoSuchElementException exception) {
                exception.getMessage();
            }
        }
    }

    /**
     * Waits for overflow tab to load.
     */
    public void waitForOverflowTabToLoad() {
        waitForElementToDisplay(libraryScreenObject.getOverflowOptionTab());
    }

    /**
     * Gets list of overflow menu options.
     *
     * @return list of overflow menu options
     */
    public List<String> getListOfOverflowMenuOptions() {
        ArrayList<String> audiobookOverflowMenuOptions = new ArrayList<>();
        for(final MobileElement option : libraryScreenObject.getOverflowMenuOptions()) {
            String optionName = option.getAttribute("name");
            audiobookOverflowMenuOptions.add(optionName);
        }
        return audiobookOverflowMenuOptions;
    }

    /**
     * Gets list of audiobook titles.
     *
     * @return list of audiobook titles
     */
    public List<String> getAudiobookTitles() {
        return libraryScreenObject.getAudioBooks().stream().map(book -> book.getText()).collect(Collectors.toList());
    }


    /**
     * Gets visible audiobooks details.
     *
     * @return visible audiobooks details
     */
    public Set<String> getVisibleAudiobooksDetails() {
        Set<String> visibleAudiobooksDetails = new HashSet<>();
        for (final MobileElement audiobookCell : libraryScreenObject.getAudiobookCells()) {
            MobileElement bookTitles = audiobookCell.findElement(MobileBy.iOSNsPredicateString("name == \"metadata_titlegroup\""));
            String bookTitle = bookTitles.getText();
            MobileElement author = audiobookCell.findElement(MobileBy.iOSNsPredicateString("name == \"metadata_author\""));
            String authorName = author.getText();
            visibleAudiobooksDetails.add(String.format("\nBook title: %s, Author: %s.", bookTitle, authorName));
        }
        return visibleAudiobooksDetails;
    }

    /**
     * Gets all visible audiobook titles.
     *
     * @return visible audiobook titles
     */
    public List<String> getAllVisibleAudiobookTitles() {
        ArrayList<String> visibleAudiobookTitles = new ArrayList<>();
        for (final MobileElement audiobookCell : libraryScreenObject.getAudiobookCells()) {
            try {
                MobileElement bookTitles = audiobookCell.findElement(MobileBy.iOSNsPredicateString("name == \"metadata_titlegroup\""));
                String bookTitle = bookTitles.getText();
                visibleAudiobookTitles.add(bookTitle);
            } catch (final NoSuchElementException exception) {
                exception.getMessage();
            }
        }
        return visibleAudiobookTitles;
    }

    /**
     * Gets all visible audiobook author names.
     *
     * @return visible audiobook author names
     */
    public List<String> getAllVisibleAudiobookAuthors() {
        ArrayList<String> visibleAudiobookAuthorNames = new ArrayList<>();
        for (final MobileElement audiobookCell : libraryScreenObject.getAudiobookCells()) {
            MobileElement author = audiobookCell.findElement(MobileBy.iOSNsPredicateString("name == \"metadata_author\""));
            String authorName = author.getText();
            visibleAudiobookAuthorNames.add(authorName);
        }
        return visibleAudiobookAuthorNames;
    }

    /**
     * Gets count of audiobook titles.
     *
     * @return audiobook titles count with text
     */
    public String getCountOfAudiobookTitles() {
        return libraryScreenObject.getNumberOfTitles().getText();
    }

    /**
     * Gets the count of audiobooks.
     *
     * @return count
     */
    public int getCountOfAudioBooks() {
        String numWithString = libraryScreenObject.getNumberOfTitles().getText();
        String digits = numWithString.replaceAll("[^0-9]", "");
        final int count = Integer.parseInt(digits);
        return count;
    }

    /**
     * Gets the library sort.
     *
     * @return library sort object
     */
    public LibrarySortIOS getSort() {
        return new LibrarySortIOS((IOSDriver<IOSElement>) driver);
    }

    /**
     * Taps audiobook overflow menu option.
     *
     * @param overflowMenuOptionText overflow menu option text
     */
    public void tapAudiobookOverflowMenuOption(final String overflowMenuOptionText) {
        for (final MobileElement option : libraryScreenObject.getOverflowMenuOptions()) {
            String optionName = option.getAttribute("value");
            if (optionName.equals(overflowMenuOptionText)) {
                option.click();
                break;
            }
        }
    }
}
