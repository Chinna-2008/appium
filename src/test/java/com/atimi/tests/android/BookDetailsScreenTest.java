package com.atimi.tests.android;

import com.atimi.tests.AndroidTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This is 'BookDetailsScreenTest' class.
 */
public class BookDetailsScreenTest extends AndroidTestBase {

    /**
     * Tests the book title.
     */
    @Test
    public void testBookTitle() {
        getSignInScreen().login();
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().scrollUpToAudiobook("Just Do It");
        getLibraryScreen().tapAudiobookOverflowButton("Just Do It");
        getLibraryScreen().tapAudiobookOverflowMenuOption("Title details");
        getBookDetailsScreen().waitForScreenToLoad();
        Assert.assertEquals(getBookDetailsScreen().getBookTitle(), "Just Do It", "Book title is not matched.");
    }

    /**
     * Tests the book details.
     */
    @Test
    public void testBookDetails() {
        getSignInScreen().login();
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().scrollUpToAudiobook("Just Do It");
        getLibraryScreen().tapAudiobookOverflowButton("Just Do It");
        getLibraryScreen().tapAudiobookOverflowMenuOption("Title details");
        getBookDetailsScreen().waitForScreenToLoad();
        System.out.println(String.format("Book details are: \n %s.", getBookDetailsScreen().getBookDetails()));
        Assert.assertTrue(getBookDetailsScreen().isBookDetailsContainsSubtitle(), "Book details is not contain subtitle.");
    }

    /**
     * Tests the download book option.
     */
    @Test
    public void testDownloadBook() {
        getSignInScreen().login();
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().tapAudiobookOverflowButton("Just Do It");
        getLibraryScreen().tapAudiobookOverflowMenuOption("Title details");
        getBookDetailsScreen().waitForScreenToLoad();
        getBookDetailsScreen().tapDownloadButton();
        getBookDetailsScreen().waitForRemoveFromDeviceButtonToLoad();
        Assert.assertTrue(getBookDetailsScreen().isRemoveFromDeviceButtonDisplayed(), "Book is not downloaded.");
    }

    /**
     * Tests the play book.
     */
    @Test
    public void testPlayBook() {
        getSignInScreen().login();
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().tapAudiobookOverflowButton("Don Katz Interviews Jane Fonda");
        getLibraryScreen().tapAudiobookOverflowMenuOption("Title details");
        getBookDetailsScreen().waitForScreenToLoad();
        getBookDetailsScreen().tapPlayButton();
        getBookDetailsScreen().waitForPauseButton();
        Assert.assertTrue(getBookDetailsScreen().isPauseButtonDisplayed(), "Pause button is not displayed.");
    }
}