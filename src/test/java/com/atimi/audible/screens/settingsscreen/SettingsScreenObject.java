package com.atimi.audible.screens.settingsscreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is 'SettingsScreenObject' class.
 */
@Data
public class SettingsScreenObject {

    private final AppiumDriver driver;

    @FindBy(id = "com.audible.application:id/top_bar_title")
    private MobileElement settingsScreen;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Data & Storage\")")
    private MobileElement dataAndStorageOption;

    public SettingsScreenObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}