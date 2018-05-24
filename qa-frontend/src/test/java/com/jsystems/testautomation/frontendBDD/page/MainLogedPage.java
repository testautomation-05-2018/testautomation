package com.jsystems.testautomation.frontendBDD.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainLogedPage extends BasePage {

    public MainLogedPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "svg.gridicon.gridicons-user-circle")
    public WebElement avatarIcon;

    public boolean isContentPresent(){
        assertTrue(avatarIcon.isDisplayed());
        return true;
    }
}
