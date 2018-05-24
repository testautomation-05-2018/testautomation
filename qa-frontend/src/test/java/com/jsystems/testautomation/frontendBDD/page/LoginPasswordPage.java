package com.jsystems.testautomation.frontendBDD.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPasswordPage extends BasePage  {

    public LoginPasswordPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "password")
    public WebElement password;

    @FindBy(css = "button.button.form-button.is-primary")
    public WebElement logInButton;


}
