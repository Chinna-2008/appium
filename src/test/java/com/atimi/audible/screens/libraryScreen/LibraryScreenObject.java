package com.atimi.audible.screens.libraryScreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
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

    @AndroidFindBy(id = "com.audible.application:id/overflow_btn")
    @iOSXCUITFindBy(accessibility = "pilter_button_All_Titles_isSelected")
    private MobileElement overflowButton;

    @AndroidFindBy(id = "com.audible.application:id/action_text")
    private List<MobileElement> overflowMenuOptions;

    @AndroidFindBy(id = "com.audible.application:id/title")
    private List<MobileElement> audioBooks;

    @AndroidFindBy(id = "com.audible.application:id/owned_title_item")
    private List<MobileElement> audiobookCells;

    @AndroidFindBy(id = "com.audible.application:id/header_text")
    private MobileElement numberOfTitles;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"In Progress\")")
    private MobileElement inProgressTab;

    @AndroidFindBy(id = "com.audible.application:id/title")
    private MobileElement inProgressBook;

    public LibraryScreenObject(final AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}