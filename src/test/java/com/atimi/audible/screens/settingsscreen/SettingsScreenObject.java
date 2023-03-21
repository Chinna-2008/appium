package com.atimi.audible.screens.settingsscreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

/**
 * This is 'SettingsScreenObject' class.
 */
@Data
public class SettingsScreenObject {

    private final AppiumDriver driver;

    @FindBy(id = "com.audible.application:id/top_bar_title")
    private MobileElement settingsScreen;

    @FindBy(id = "com.audible.application:id/row_label")
    private List<MobileElement> appSettingsOptions;

    @FindBy(id = "com.audible.application:id/top_bar_title")
    private MobileElement storageAndStorageScreen;

    public SettingsScreenObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}