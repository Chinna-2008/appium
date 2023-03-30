package com.atimi.audible.screens.libraryScreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

/**
 * This is 'LibraryScreenObject' clas.
 */
@Data
public class LibraryScreenObject {

    private final AppiumDriver driver;

    @FindBy(id = "com.audible.application:id/overflow_btn")
    private MobileElement hamburgerButton;

    @FindBy(id = "com.audible.application:id/action_text")
    private List<MobileElement> hamburgerOptions;

    @FindBy(id = "com.audible.application:id/header_button")
    private MobileElement sortingHeaderButton;

    @FindBy(className = "android.widget.TextView")
    public List<MobileElement> sortOptions;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.audible.application:id/title']")
    private List<MobileElement> audioBooks;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id= 'com.audible.application:id/metadata_view']")
    private List<MobileElement> audiobookCells;

    @FindBy(id = "com.audible.application:id/header_text")
    private MobileElement titles; // TODO : Update it as numberOfTitles.

    @FindBy(xpath = "//android.widget.RadioButton[@content-desc='Titles in progress']")
    private MobileElement inProgressButton;

    @FindBy(id = "com.audible.application:id/title")
    private MobileElement inProgressBook;

    public LibraryScreenObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}