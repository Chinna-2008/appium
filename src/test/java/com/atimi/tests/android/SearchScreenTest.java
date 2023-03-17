package com.atimi.tests.android;

import com.atimi.tests.AndroidTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This is 'SearchScreenTest' class.
 */
public class SearchScreenTest extends AndroidTestBase {

    /**
     * Test the search book.
     */
    @Test
    public void testSearchBook() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().enterEmailId("reddeppapc1@gmail.com");
        getSignInScreen().enterPassword("Reddeppa@3");
        getSignInScreen().tapSignInButton();
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapSearchButton();
        getSearchScreen().enterSearchText("Story of Buddha");
        getSearchScreen().tapBook();
        Assert.assertEquals(getBookDetailsScreen().getBookTitle(), "Story of Buddha", "Book title is not matched.");
    }
}