package com.atimi.audible.screens.signinscreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Data;
import org.openqa.selenium.support.PageFactory;

/**
 * This is 'AudibleSignInScreenObject' class.
 */
@Data
public class SignInScreenObject {

    private final AppiumDriver driver;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sign in using your Amazon Account']")
    @iOSXCUITFindBy(accessibility = "Sign in to Audible using your Amazon account")
    private MobileElement signInScreen;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='ap_email']")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"Email or phone number\"`]")
    private MobileElement enterEmailID;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='ap_password']")
    @iOSXCUITFindBy(accessibility = "Amazon password")
    private MobileElement enterPassword;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='signInSubmit']")
    @iOSXCUITFindBy(accessibility = "Continue")
    private MobileElement signInButton;

    public SignInScreenObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}