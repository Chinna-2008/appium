package com.atimi.audible.screens.libraryScreen;

import com.atimi.audible.BaseScreen;
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
        waitForElementToDisplay(libraryScreenObject.getMoreButton());
    }

    /**
     * Taps on see more button.
     *
     * @param audiobookName audiobook name
     */
    public void tapAudiobookMoreButton(final String audiobookName) {
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
     * Gets list of more options.
     *
     * @return list of more options
     */
    public List<String> getListOfMoreOptions() {
        List<String> moreOptions = libraryScreenObject.getMoreOptions().stream().map(option -> option.getText()).collect(Collectors.toList());
        return moreOptions;
    }

    /**
     * Taps audiobook more option.
     *
     * @param moreOptionName more option name
     */
   public void tapAudiobookMoreOption(final String moreOptionName) {
       List<MobileElement> moreOptions = libraryScreenObject.getMoreOptions().stream().collect(Collectors.toList());
       List<MobileElement> optionList = moreOptions.stream().filter(option -> option.getText().equals(moreOptionName)).collect(Collectors.toList());
       optionList.stream().forEach(option -> option.click());
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
        List<MobileElement> shortOptions = libraryScreenObject.getSortOptions().stream().collect(Collectors.toList());
        List<MobileElement> shortOptionList = shortOptions.stream().filter(option -> option.getText().equals(sortOptionName)).collect(Collectors.toList());
        shortOptionList.stream().forEach(option -> option.click());
    }
    /**
     * Gets list of audiobook titles.
     *
     * @return list of audiobook titles
     */
    public List<String> getAudiobookTitles() {
        List<String> audioBookTitles = libraryScreenObject.getAudioBooks().stream().map(book -> book.getText()).collect(Collectors.toList());
        return audioBookTitles;
    }

    /**
     * Gets all visible audiobook titles.
     *
     * @return visible audiobook titles
     */
    public List<String> getAllVisibleAudiobookTitles() {
        ArrayList<String> visibleAudiobookTitles = new ArrayList<>();
        for (final MobileElement audiobookCell : libraryScreenObject.getAudiobookCells()) {
            try{
                MobileElement bookTitles = audiobookCell.findElement(By.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[@resource-id = 'com.audible.application:id/title']"));
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
            MobileElement author = mobileElement.findElement(By.xpath("//android.widget.LinearLayout/android.widget.TextView[@resource-id = 'com.audible.application:id/author_text_view']"));
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
            MobileElement bookTitles = mobileElement.findElement(By.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[@resource-id='com.audible.application:id/title']"));
            String bookTitle = bookTitles.getText();
            MobileElement author = mobileElement.findElement(By.xpath("//android.widget.LinearLayout/android.widget.TextView[@resource-id = 'com.audible.application:id/author_text_view']"));
            String authorName = author.getText();
            visibleAudiobooksDetails.add(String.format("\nBook title: %s, Author: %s",  bookTitle, authorName));
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
}