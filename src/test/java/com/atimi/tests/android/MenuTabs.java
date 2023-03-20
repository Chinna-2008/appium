package com.atimi.tests.android;

/**
 * This is 'MenuTabs' enum.
 */
public enum MenuTabs {

    HOME("Home"), LIBRARY("Library"), DISCOVER("Discover"), PROFILE("Profile"), DEBUG_PANEL("Debug panel");

    private final String tabs;

    MenuTabs(final String tabs) {
        this.tabs = tabs;
    }

    /**
     * Gets tabs.
     *
     * @return tabs
     */
    public String getTabsValue() {
        return tabs;
    }
}