package com.atimi.tests.android;

import com.atimi.tests.AndroidTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.*;

/**
 * This is 'LibraryScreenTest'
 */
public class LibraryScreenTest extends AndroidTestBase {

    /**
     * Tests the library tab.
     */
    @Test
    public void testLibrary() {
        getSignInScreen().login();
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().scrollUpToAudiobook("Just Do It");
        getLibraryScreen().tapAudiobookOverflowButton("Just Do It");
        List<String> moreOptionsList = Arrays.asList("Title details", "Donald Katz", "Download", "Share", "Mark as finished", "Rate & review", "Add to favourites", "Add to…", "Archive this title", "Remove from library");
        Assert.assertEquals(getLibraryScreen().getListOfOverflowMenuOptions(), moreOptionsList, "More options for audiobook is not matched.");
    }

    /**
     * Tests sorting audiobooks.
     */
    @Test
    public void testSortingAudiobooks() {
        getSignInScreen().login();
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().waitForScreenToLoad();
        List<String> beforeSortingAudiobookList = getLibraryScreen().getAudiobookTitles();
        getLibraryScreen().getSortOptions().tapSortingHeaderButton();
        getLibraryScreen().getSortOptions().tapSortOption("Title");
        List<String> afterSortingAudiobookList = getLibraryScreen().getAudiobookTitles();
        Assert.assertNotEquals(beforeSortingAudiobookList, afterSortingAudiobookList, "Audiobooks are not sorted.");
    }

    /**
     * Tests the visible audiobooks details in library.
     */
    @Test
    public void testVisibleAudiobooksDetailsInLibrary() {
        getSignInScreen().login();
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().waitForScreenToLoad();
        System.out.println(String.format("Audiobooks detail in library: %s", getLibraryScreen().getVisibleAudiobooksDetails()));
        List<String> expectedAudiobooksDetails = getLibraryScreen().getVisibleAudiobooksDetails();
        Assert.assertEquals(getLibraryScreen().getVisibleAudiobooksDetails(), expectedAudiobooksDetails,"Audiobooks details are not matched.");
    }

    /**
     * Tests the visible audiobook titles and author names in library screen.
     */
    @Test
    public void testVisibleAudiobookTitlesAndAuthorNamesInLibraryScreen() {
        getSignInScreen().login();
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().waitForScreenToLoad();
        List<String> expectedAudiobookTitles = Arrays.asList("Canada Is Awesome", "Tomato Can Blues", "FIRST THREE FREE CHAPTERS: Amok", "Christmas in the Kitchen", "Don Katz Interviews Jane Fonda", "The King of the Ferret Leggers and Other True Stories");
        Assert.assertEquals(getLibraryScreen().getAllVisibleAudiobookTitles(), expectedAudiobookTitles, "Audiobooks title are not matched.");
        List<String> expectedAudiobookAuthorNames = Arrays.asList("By Neil Pasricha", "By Mary Pilon", "By Sebastian Fitzek", "By Nalini Singh", "By Jane Fonda", "By Donald Katz");
        Assert.assertEquals(getLibraryScreen().getAllVisibleAudiobookAuthors(), expectedAudiobookAuthorNames, "Audiobooks author name are not matched.");
    }

    /**
     * Tests the count of all audiobook titles.
     */
    @Test
    public void testCountOfAllAudiobookTitles() {
        getSignInScreen().login();
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().waitForScreenToLoad();
        Assert.assertEquals(getLibraryScreen().getCountOfAudiobookTitles(), "9 titles", "Audiobook titles count is not matched.");
    }

    /**
     * Tests all the audiobooks authors.
     */
    @Test
    public void testAllAudiobooksAuthors() {
        getSignInScreen().login();
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().waitForScreenToLoad();
        List<String> visibleAudiobookAuthorsName = getLibraryScreen().getAllVisibleAudiobookAuthors();
        getLibraryScreen().scrollUpToAudiobook("Just Do It");
        getLibraryScreen().waitForScreenToLoad();
        List<String> visibleAudiobooksAuthorNamesAfterScroll = getLibraryScreen().getAllVisibleAudiobookAuthors();
        Set<String> allAudiobooksAuthors = new HashSet<>();
        allAudiobooksAuthors.addAll(visibleAudiobookAuthorsName);
        allAudiobooksAuthors.addAll(visibleAudiobooksAuthorNamesAfterScroll);
        List<String> expectedAudiobooksAuthorsName = Arrays.asList("By Mary Pilon", "By Neil Pasricha", "By Donald Katz", "By Nalini Singh", "By Jane Fonda", "By Kat Johnson", "By Sebastian Fitzek");
        Assert.assertEquals(allAudiobooksAuthors, expectedAudiobooksAuthorsName, "Audiobook authors names are not matched.");
    }

    /**
     * Tests all the audiobook titles.
     */
    @Test
    public void testAllAudiobookTitles() {
        getSignInScreen().login();
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().waitForScreenToLoad();
        List<String> visibleAudiobookTitles = getLibraryScreen().getAllVisibleAudiobookTitles();
        getLibraryScreen().scrollUpToAudiobook("Just Do It");
        getLibraryScreen().waitForScreenToLoad();
        List<String> visibleAudiobookTitlesAfterScroll = getLibraryScreen().getAllVisibleAudiobookTitles();
        Set<String> allAudiobooksNames = new HashSet<>();
        allAudiobooksNames.addAll(visibleAudiobookTitles);
        allAudiobooksNames.addAll(visibleAudiobookTitlesAfterScroll);
        List<String> expectedAllAudiobooksTitles = Arrays.asList("Canada Is Awesome", "Tomato Can Blues", "The Big Store", "Murder, We Spoke", "The King of the Ferret Leggers and Other True Stories", "FIRST THREE FREE CHAPTERS: Amok", "Don Katz Interviews Jane Fonda", "Just Do It", "Christmas in the Kitchen");
        Assert.assertEquals(allAudiobooksNames, expectedAllAudiobooksTitles, "Audiobooks titles are not matched.");
    }

    /**
     * Tests in progress audiobooks.
     */
    @Test
    public void testInProgressAudioBooks() {
        getSignInScreen().login();
        getHomeScreen().waitForScreenToLoad();
        getHomeScreen().tapMenuTab(MenuTabs.LIBRARY.getTabsValue());
        getLibraryScreen().waitForScreenToLoad();
        getLibraryScreen().tapInProgressTab();
        Assert.assertEquals(getLibraryScreen().getInProgressAudiobookTitle(), "Don Katz Interviews Jane Fonda", "In progress audiobook title is not matched.");
    }
}