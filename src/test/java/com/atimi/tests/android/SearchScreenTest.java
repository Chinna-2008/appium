package com.atimi.tests.android;

import com.atimi.tests.AndroidTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This is 'SearchScreenTest' class.
 */
public class SearchScreenTest extends AndroidTestBase {

    /**
     * Tests the search book.
     */
    @Test
    public void testSearchBook() {
        getSignInScreen().login();
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapSearchButton();
        getSearchScreen().enterSearchText("Story of Buddha");
        getSearchScreen().tapBook();
        Assert.assertEquals(getBookDetailsScreen().getBookTitle(), "Story of Buddha", "Book title is not matched.");
    }
}