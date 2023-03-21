package com.atimi.tests.android;

/**
 * This is 'AppSettingsOptions' enum.
 */
public enum AppSettingsOptions {

    DATA_AND_STORAGE("Data & Storage"), PLAYER("Player"), THEME("Theme"), CONNECT_TO_OTHER_APPS("Connect to other Apps");

    private final String appSettingsOptions;

    AppSettingsOptions(final String appSettingsOptions) {
        this.appSettingsOptions = appSettingsOptions;
    }

    /**
     * Gets app settings options value.
     *
     * @return app settings options value
     */
    public String getAppSettingsOptionsValue() {
        return appSettingsOptions;
    }
}