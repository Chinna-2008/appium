package com.atimi.tests.ios;

import com.atimi.tests.IOSTestBase;
import org.testng.annotations.Test;

/**
 * This is 'DataAndStorageScreenTest' class.
 */
public class DataAndStorageScreenTest extends IOSTestBase {

    @Test
    public void testSettingsButton() {
        getSignInScreen().login("reddeppapc1@gmail.com", "Reddeppa@3");
    }
}