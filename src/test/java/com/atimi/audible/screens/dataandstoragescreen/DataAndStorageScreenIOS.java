package com.atimi.audible.screens.dataandstoragescreen;

import com.atimi.audible.BaseScreen;
import io.appium.java_client.AppiumDriver;

/**
 * This is 'DataAndStorageScreenIOS' class.
 */
public class DataAndStorageScreenIOS extends BaseScreen {

    private final DataAndStorageScreenObject dataAndStorageScreenObject;

    public DataAndStorageScreenIOS(AppiumDriver driver) {
        super(driver);
        dataAndStorageScreenObject = new DataAndStorageScreenObject(driver);
    }

    @Override
    public void waitForScreenToLoad() {
    }
}