package com.atimi.tests.ios;

import com.atimi.tests.IOSTestBase;
import com.atimi.tests.android.MenuTabs;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This is 'BookDetailsScreenTest' class.
 */
public class BookDetailsScreenTest extends IOSTestBase {

    /**
     * Tests book title.
     */
    @Test
    public void testBookTitle() {
        getSignInScreen().login("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().scrollUpToAudiobook("Just Do It");
        getLibraryScreen().tapAudiobookOverflowButton("Just Do It");
        getLibraryScreen().tapAudiobookOverflowMenuOption("Title Details");
        getBookDetailsScreen().waitForScreenToLoad();
        Assert.assertEquals(getBookDetailsScreen().getBookTitle(), "Just Do It", "Book title is not matched.");
    }

    /**
     * Tests book details.
     */
    @Test
    public void testBookDetails() {
        getSignInScreen().login("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().tapAudiobookOverflowButton("Canada Is Awesome");
        getLibraryScreen().waitForOverflowTabToLoad();
        getLibraryScreen().tapAudiobookOverflowMenuOption("Title Details");
        getBookDetailsScreen().waitForScreenToLoad();
        System.out.println(String.format("Book details are: \n %s.", getBookDetailsScreen().getBookDetails()));
        Assert.assertTrue(getBookDetailsScreen().isBookDetailsContainsSubtitle(), "Book details is not contain subtitle.");
    }

    /**
     * Tests play book.
     */
    @Test
    public void testPlayBook() {
        getSignInScreen().login("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().tapAudiobookOverflowButton("Canada Is Awesome");
        getLibraryScreen().tapAudiobookOverflowMenuOption("Title Details");
        getBookDetailsScreen().waitForScreenToLoad();
        getBookDetailsScreen().tapPlayButton();
        getBookDetailsScreen().waitForPauseButton();
        Assert.assertTrue(getBookDetailsScreen().isPauseButtonDisplayed(), "Pause button is not displayed.");
    }

    /**
     * Tests download book option.
     */
    @Test
    public void testDownloadBook() {
        getSignInScreen().login("reddeppapc1@gmail.com", "Reddeppa@3");
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().tapAudiobookOverflowButton("Canada Is Awesome");
        getLibraryScreen().tapAudiobookOverflowMenuOption("Title Details");
        getBookDetailsScreen().waitForScreenToLoad();
        getBookDetailsScreen().tapDownloadButton();
        Assert.assertTrue(getBookDetailsScreen().isCancelDownloadButtonDisplayed(), "Audiobook is downloading.");
    }
}
