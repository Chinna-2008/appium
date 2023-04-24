package com.atimi.tests.ios;

import com.atimi.tests.IOSTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This is 'SearchScreenTest' class.
 */
public class SearchScreenTest extends IOSTestBase {

    /**
     * Tests search book.
     */
    @Test
    public void testSearchBook() {
        getSignInScreen().login("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapSearchButton();
        getSearchScreen().enterSearchText("Story of Buddha");
        getSearchScreen().waitForScreenToLoad();
        getSearchScreen().tapBook();
        Assert.assertEquals(getBookDetailsScreen().getBookTitle(), "Story of Buddha", "Book title is not matched.");
    }
}
