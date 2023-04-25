package com.atimi.audible.screens.bookdetailsscreen;

import com.atimi.audible.BaseScreen;
import io.appium.java_client.AppiumDriver;
import java.util.HashMap;

/**
 * This is 'BookDetailsScreenIOS' class.
 */
public class BookDetailsScreenIOS extends BaseScreen {

    private final BookDetailsScreenObject bookDetailsScreenObject;

    public BookDetailsScreenIOS(AppiumDriver driver) {
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
     * Gets book title.
     *
     * @return book title
     */
    public String getBookTitle() {
        return bookDetailsScreenObject.getBookTitle().getAttribute("value");
    }

    /**
     * Gets book subtitle.
     *
     * @return subtitle
     */
    public String getBookSubtitle() {
        return bookDetailsScreenObject.getSubTitle().getAttribute("value");
    }

    /**
     * Gets author name.
     *
     * @return author name
     */
    public String getAuthorName() {
        return bookDetailsScreenObject.getAuthor().getAttribute("label");
    }

    /**
     * Gets book duration.
     *
     * @return book duration
     */
    public String getBookDuration() {
        return bookDetailsScreenObject.getAudioBookDuration().getAttribute("value");
    }

    /**
     * Gets book details.
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
     * Checks book details are contains subtitle.
     *
     * @return true / false
     */
    public boolean isBookDetailsContainsSubtitle() {
        return getBookDetails().containsValue(getBookSubtitle());
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

    /**
     * Taps on download button.
     */
    public void tapDownloadButton() {
        try{
            bookDetailsScreenObject.getDownloadButton().click();
        } catch (final Exception exception) {
            System.out.println(exception.getMessage());
            System.out.println("Audiobook already downloaded.");
        }
    }

    /**
     * Checks cancel download button is displayed or not.
     *
     * @return true / false
     */
    public boolean isCancelDownloadButtonDisplayed() {
        return isDisplayed(bookDetailsScreenObject.getCancelDownload());
    }
}
