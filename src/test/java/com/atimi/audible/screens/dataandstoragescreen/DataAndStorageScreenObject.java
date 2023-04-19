package com.atimi.audible.screens.dataandstoragescreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

/**
 * This is 'DataAndStorageScreenObject' class.
 */
@Data
public class DataAndStorageScreenObject {

    private final AppiumDriver driver;

    @AndroidFindBy(id = "com.audible.application:id/radio_btn")
    private List<MobileElement> downloadQualityRadioButtons;

    @AndroidFindBy(id = "com.audible.application:id/preference_toggle_switch")
    private List<MobileElement> toggleButtons;

    @AndroidFindBy(id = "com.audible.application:id/radio_btn")
    private List<MobileElement> downloadByPartsRadioButtons;

    @AndroidFindBy(id = "android:id/title")
    private List<MobileElement> buttonsTitles;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Data & Storage\")")
    private MobileElement dataAndStorageTitle;

    public DataAndStorageScreenObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}