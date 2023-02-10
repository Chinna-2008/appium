package screens;

import java.util.HashMap;

/**
 * This is 'BookDetailsScreen' class.
 */
public class BookDetailsScreen extends BaseScreen {

    private final BookDetailsScreenObject bookDetailsScreenObject;

    public BookDetailsScreen() {
        bookDetailsScreenObject = new BookDetailsScreenObject(appiumDriver);
    }

    @Override
    public void waitForScreenToLoad() {
        waitForMobileElement(bookDetailsScreenObject.getBookDetailsScreen());
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
        return bookDetailsScreenObject.getDuration().getText();
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
        waitForMobileElement(bookDetailsScreenObject.getRemoveFromDevice());
    }

    /**
     * Checks the remove from device button is displayed or not.
     *
     * @return true / false
     */
    public boolean isRemoveFromDeviceButtonDisplayed() {
        return bookDetailsScreenObject.getRemoveFromDevice().isDisplayed();
    }
}