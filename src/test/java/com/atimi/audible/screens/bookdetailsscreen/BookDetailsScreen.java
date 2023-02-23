package com.atimi.audible.screens.bookdetailsscreen;

import com.atimi.audible.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.util.HashMap;

/**
 * This is 'BookDetailsScreen' class.
 */
public class BookDetailsScreen extends BaseScreen {

    private final BookDetailsScreenObject bookDetailsScreenObject;

    public BookDetailsScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
        bookDetailsScreenObject = new BookDetailsScreenObject(driver);
    }

    /**
     * Waits for screen to load.
     */
    @Override
    public void waitForScreenToLoad() {
        waitForElementToDisplay(bookDetailsScreenObject.getBookDetailsScreen());
    }

    /**
     * Gets the book title.
     *
     * @return book title
     */
    public String getBookTitle() {
        return bookDetailsScreenObject.getBookTitle().getText();
    }

    /**
     * Gets book subtitle.
     *
     * @return subtitle
     */
    public String getBookSubtitle() {
        return bookDetailsScreenObject.getSubTitle().getText();
    }

    /**
     * Gets the author name.
     *
     * @return author name
     */
    public String getAuthorName() {
        return bookDetailsScreenObject.getAuthor().getText();
    }

    /**
     * Gets the book duration.
     *
     * @return book duration
     */
    public String getBookDuration() {
        return bookDetailsScreenObject.getAudioBookDuration().getText();
    }

    /**
     * Gets the book details.
     *
     * @return book details
     */
    public HashMap<String,String> getBookDetails() {
        HashMap<String,String> details = new HashMap<>();
        details.put("BookTitle ", getBookTitle());
        details.put("BookSubtitle ", getBookSubtitle());
        details.put("Author name ", getAuthorName());
        details.put("Book duration ", getBookDuration());
        return details;
    }

    /**
     * Checks the book details are contains subtitle.
     *
     * @return true / false
     */
    public boolean isBookDetailsContainsSubtitle() {
        return getBookDetails().containsValue(getBookSubtitle());
    }

    /**
     * Taps on download button.
     */
    public void tapDownloadButton() {
        bookDetailsScreenObject.getDownloadButton().click();
    }

    /**
     * Waits for remove from device button to load.
     */
    public void waitForRemoveFromDeviceButtonToLoad() {
        waitForElementToDisplay(bookDetailsScreenObject.getRemoveFromDevice());
    }

    /**
     * Checks the remove from device button is displayed or not.
     *
     * @return true / false
     */
    public boolean isRemoveFromDeviceButtonDisplayed() {
        return isDisplayed(bookDetailsScreenObject.getRemoveFromDevice());
    }

    /**
     * Taps on play button.
     */
    public void tapPlayButton() {
        bookDetailsScreenObject.getPlayButton().click();
    }

    /**
     * Waits for pause button to display.
     */
    public void waitForPauseButton() {
        waitForElementToDisplay(bookDetailsScreenObject.getPauseButton());
    }

    /**
     * Checks the pause button is displayed or not.
     *
     * @return true / false
     */
    public boolean isPauseButtonDisplayed() {
        return isDisplayed(bookDetailsScreenObject.getPauseButton());
    }
}