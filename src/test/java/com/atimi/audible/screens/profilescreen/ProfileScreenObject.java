package com.atimi.audible.screens.profilescreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
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

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Settings\")")
    private MobileElement settings;

    public ProfileScreenObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}