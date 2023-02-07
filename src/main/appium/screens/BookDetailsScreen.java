package screens;

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
    }

    public boolean isBookImageDisplayed() {
        return bookDetailsScreenObject.getLeftImage().isDisplayed();
    }
}