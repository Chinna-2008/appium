package com.atimi.audible.screens.profilescreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is 'ProfileScreenObject' class.
 */
@Data
public class ProfileScreenObject {

    private final AppiumDriver driver;

    @FindBy(id = "com.audible.application:id/profileNameTextView")
    private MobileElement profileName;

    @FindBy(id = "com.audible.application:id/action_start_container")
    private MobileElement settingsButton;

    public ProfileScreenObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}