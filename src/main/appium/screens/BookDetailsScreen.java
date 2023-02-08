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

    /**
     * Gets the book title.
     *
     * @return book title
     */
    public String getBookTitle() {
        return bookDetailsScreenObject.getBookTitle().getText();
    }
}