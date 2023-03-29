package com.atimi.audible.screens.dataandstoragescreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

/**
 * This is 'DataAndStorageScreenObject' class.
 */
@Data
public class DataAndStorageScreenObject {

    private final AppiumDriver driver;

    @FindBy(id = "com.audible.application:id/radio_btn")
    private List<MobileElement> downloadQualityRadioButtons;

    @FindBy(id = "com.audible.application:id/preference_toggle_switch")
    private List<MobileElement> toggleSwitchButtons;

    @FindBy(id = "com.audible.application:id/radio_btn")
    private List<MobileElement> downloadByPartsRadioButtons;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='android:id/title']")
    private List<MobileElement> buttonsTitles;

    public DataAndStorageScreenObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}