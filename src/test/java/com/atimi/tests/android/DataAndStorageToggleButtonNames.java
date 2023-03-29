package com.atimi.tests.android;

/**
 * This is 'DataAndStorageToggleButtonNames' enum.
 */
public enum DataAndStorageToggleButtonNames {

    STREAM_DOWNLOAD_ON_WIFI_ONLY("Stream & download on Wi-Fi only"), AUTO_REMOVE("Auto-remove"), AUTO_DOWNLOAD("Auto-download");

    private final String toggleButton;

    DataAndStorageToggleButtonNames(final String toggleButton) {
        this.toggleButton = toggleButton;
    }

    /**
     * Gets toggle button value.
     *
     * @return toggle button
     */
    public String getToggleButtonValue() {
        return toggleButton;
    }
}