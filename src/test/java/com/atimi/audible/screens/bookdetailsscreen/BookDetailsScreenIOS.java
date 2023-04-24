package com.atimi.audible.screens.bookdetailsscreen;

import com.atimi.audible.BaseScreen;
import io.appium.java_client.AppiumDriver;

/**
 * This is 'BookDetailsScreenIOS' class.
 */
public class BookDetailsScreenIOS extends BaseScreen {

    private final BookDetailsScreenObject bookDetailsScreenObject;

    public BookDetailsScreenIOS(AppiumDriver driver) {
        super(driver);
        bookDetailsScreenObject = new BookDetailsScreenObject(driver);
    }

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
        return bookDetailsScreenObject.getBookTitle().getAttribute("value");
    }
}
