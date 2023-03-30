package com.atimi.tests.android;

/**
 * This is 'MenuTabs' enum.
 */
public enum MenuTabs {

    HOME("Home"), LIBRARY("Library"), DISCOVER("Discover"), PROFILE("Profile"), DEBUG_PANEL("Debug panel");

    private final String tab;

    MenuTabs(final String tab) {
        this.tab = tab;
    }

    /**
     * Gets tabs value.
     *
     * @return tab
     */
    public String getTabsValue() {
        return tab;
    }
}