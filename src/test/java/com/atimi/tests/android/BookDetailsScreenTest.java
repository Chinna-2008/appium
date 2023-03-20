package com.atimi.tests.android;

import com.atimi.tests.AndroidTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This is 'BookDetailsScreenTest' class.
 */
public class BookDetailsScreenTest extends AndroidTestBase {

    /**
     * Test the book title.
     */
    @Test
    public void testBookTitle() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().signIn("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().tapAudiobookHamburgerButton("Just Do It");
        getLibraryScreen().tapAudiobookHamburgerOption("Title details");
        getBookDetailsScreen().waitForScreenToLoad();
        Assert.assertEquals(getBookDetailsScreen().getBookTitle(), "Just Do It", "Book title is not matched.");
    }

    /**
     * Test the book details.
     */
    @Test
    public void testBookDetails() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().signIn("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().tapAudiobookHamburgerButton("Just Do It");
        getLibraryScreen().tapAudiobookHamburgerOption("Title details");
        getBookDetailsScreen().waitForScreenToLoad();
        System.out.println(String.format("Book details are: \n %s.", getBookDetailsScreen().getBookDetails()));
        Assert.assertTrue(getBookDetailsScreen().isBookDetailsContainsSubtitle(), "Book details is not contain subtitle.");
    }

    /**
     * Test the download book option.
     */
    @Test
    public void testDownloadBook() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().signIn("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().tapAudiobookHamburgerButton("Just Do It");
        getLibraryScreen().tapAudiobookHamburgerOption("Title details");
        getBookDetailsScreen().waitForScreenToLoad();
        getBookDetailsScreen().tapDownloadButton();
        getBookDetailsScreen().waitForRemoveFromDeviceButtonToLoad();
        Assert.assertTrue(getBookDetailsScreen().isRemoveFromDeviceButtonDisplayed(), "Book is not downloaded.");
    }

    /**
     * Test the play book.
     */
    @Test
    public void testPlayBook() {
        getWelcomeScreen().waitForScreenToLoad();
        getWelcomeScreen().tapSignIn();
        getSignInScreen().waitForScreenToLoad();
        getSignInScreen().signIn("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().tapAudiobookHamburgerButton("Don Katz Interviews Jane Fonda");
        getLibraryScreen().tapAudiobookHamburgerOption("Title details");
        getBookDetailsScreen().waitForScreenToLoad();
        getBookDetailsScreen().tapPlayButton();
        getBookDetailsScreen().waitForPauseButton();
        Assert.assertTrue(getBookDetailsScreen().isPauseButtonDisplayed(), "Pause button is not displayed.");
    }
}