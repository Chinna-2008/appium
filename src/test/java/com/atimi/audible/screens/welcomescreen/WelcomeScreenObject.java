package com.atimi.audible.screens.welcomescreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Data;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is 'WelcomeScreenObject' class.
 */
@Data
public class WelcomeScreenObject {
    private final AppiumDriver driver;

    @AndroidBy(id = "com.audible.application:id/get_started_button")
    @iOSXCUITFindBy(accessibility = "Get Started")
    private MobileElement getStarted;

    @FindBy(id = "com.audible.application:id/sign_in_button")
    private MobileElement signIn;

    public WelcomeScreenObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}