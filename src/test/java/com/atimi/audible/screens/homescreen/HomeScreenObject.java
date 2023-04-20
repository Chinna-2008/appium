package com.atimi.audible.screens.homescreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Data;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

/**
 * This is 'HomeScreenObject' class.
 */
@Data
public class HomeScreenObject {

    private final AppiumDriver driver;

    @AndroidFindBy(id = "com.audible.application:id/logo_themed")
    @iOSXCUITFindBy(accessibility = "apphome_audible_logo_image")
    private MobileElement audibleLogo;

    @AndroidFindBy(id = "com.audible.application:id/ic_opaque")
    @iOSXCUITFindBy(accessibility = "Search Library and Audible Catalog")
    private MobileElement search;

    @AndroidFindBy(className = "android.widget.TextView")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTabBar[`label == \"Tab Bar\"`]/XCUIElementTypeButton")
    private List<MobileElement> menuTabs;

    public HomeScreenObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}