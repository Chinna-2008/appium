package src.main.appium.tests;

import io.appium.java_client.android.AndroidDriver;

/**
 * This is 'AudibleMobileTestBase' abstract class.
 */
public abstract class AudibleMobileTestBase {

    public abstract AndroidDriver createDriver();

    public abstract AndroidDriver getDriver();
}