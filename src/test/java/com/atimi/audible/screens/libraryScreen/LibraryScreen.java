package com.atimi.audible.screens.libraryScreen;

import com.atimi.audible.BaseScreen;
import com.atimi.audible.screens.widgets.SortOptions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This is 'LibraryScreen' class.
 */
public class LibraryScreen extends BaseScreen {

    private final LibraryScreenObject libraryScreenObject;

    public LibraryScreen(final AndroidDriver<AndroidElement> driver) {
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
     * Taps on overflow button.
     *
     * @param audiobookName audiobook name
     */
    public void tapAudiobookOverflowButton(final String audiobookName) {
        for (final MobileElement audiobookCell : libraryScreenObject.getAudiobookCells()) {
            try {
                MobileElement bookTitles = audiobookCell.findElement(By.id("com.audible.application:id/title"));
                String bookTitle = bookTitles.getText();
                if (bookTitle.equals(audiobookName)) {
                    MobileElement overflow = audiobookCell.findElement(By.id("com.audible.application:id/overflow_btn"));
                    overflow.click();
                    break;
                }
            } catch (final NoSuchElementException exception) {
                exception.getMessage();
            }
        }
    }

    /**
     * Gets list of overflow menu options.
     *
     * @return list of overflow menu options
     */
    public List<String> getListOfOverflowMenuOptions() {
        return libraryScreenObject.getOverflowMenuOptions().stream().map(option -> option.getText()).collect(Collectors.toList());
    }

    /**
     * Taps audiobook overflow menu option.
     *
     * @param overflowMenuOptionName overflow menu option name
     */
    public void tapAudiobookOverflowMenuOption(final String overflowMenuOptionName) {
        List<MobileElement> overflowMenuOptions = libraryScreenObject.getOverflowMenuOptions().stream().collect(Collectors.toList());
        List<MobileElement> optionList = overflowMenuOptions.stream().filter(option -> option.getText().equals(overflowMenuOptionName)).collect(Collectors.toList());
        optionList.forEach(option -> option.click());
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
     * Gets all visible audiobook titles.
     *
     * @return visible audiobook titles
     */
    public List<String> getAllVisibleAudiobookTitles() {
        ArrayList<String> visibleAudiobookTitles = new ArrayList<>();
        for (final MobileElement audiobookCell : libraryScreenObject.getAudiobookCells()) {
            try {
                MobileElement bookTitles = audiobookCell.findElement(By.id("com.audible.application:id/title"));
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
        for (final MobileElement mobileElement : libraryScreenObject.getAudiobookCells()) {
            MobileElement author = mobileElement.findElement(By.id("com.audible.application:id/author_text_view"));
            String authorName = author.getText();
            visibleAudiobookAuthorNames.add(authorName);
        }
        return visibleAudiobookAuthorNames;
    }

    /**
     * Gets visible audiobooks details.
     *
     * @return visible audiobooks details
     */
    public List<String> getVisibleAudiobooksDetails() {
        ArrayList<String> visibleAudiobooksDetails = new ArrayList<>();
        for (final MobileElement mobileElement : libraryScreenObject.getAudiobookCells()) {
            MobileElement bookTitles = mobileElement.findElement(By.id("com.audible.application:id/title"));
            String bookTitle = bookTitles.getText();
            MobileElement author = mobileElement.findElement(By.id("com.audible.application:id/author_text_view"));
            String authorName = author.getText();
            visibleAudiobooksDetails.add(String.format("\nBook title: %s, Author: %s", bookTitle, authorName));
        }
        return visibleAudiobooksDetails;
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
     * Scroll up to audiobook.
     */
    public void scrollUpToAudiobook(final String audiobook) {
        scrollToText((AndroidDriver<MobileElement>) driver, audiobook);
    }

    /**
     * Taps in progress tab.
     */
    public void tapInProgressTab() {
        libraryScreenObject.getInProgressTab().click();
    }

    /**
     * Gets the in progress book title.
     *
     * @return in progress book title
     */
    public String getInProgressAudiobookTitle() {
        return libraryScreenObject.getInProgressBook().getText();
    }

    /**
     * Gets the sort options.
     *
     * @return sort options object
     */
    public SortOptions getSortOptions() {
        return new SortOptions((AndroidDriver<AndroidElement>) driver);
    }
}