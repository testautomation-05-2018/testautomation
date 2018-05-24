package com.jsystems.testautomation.frontendFactory.tests;

import com.jsystems.testautomation.Configuration;
import com.jsystems.testautomation.frontendFactory.FrontendConfig;
import com.jsystems.testautomation.frontendFactory.pages.LoginPageEmail;
import com.jsystems.testautomation.frontendFactory.pages.LoginPasswordPage;
import com.jsystems.testautomation.frontendFactory.pages.MainLogedPage;
import com.jsystems.testautomation.frontendFactory.pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FrontentMainPageTest extends FrontendConfig {

    MainPage mainPage;
    LoginPageEmail loginPageEmail;

    @Test
    @DisplayName("Test of main page content")
    public void contentMainPageTest(){
        driver.get("https://wordpress.com/");
        mainPage = new MainPage(driver);
//        mainPage.loginButton = driver.findElement(By.id("navbar-login-link"));
        mainPage.isContentPresent();
    }

    @Test
    @DisplayName("Login test")
    public void loginTest(){
        driver.get(Configuration.WORLDPRESS_BASE_URL);
        mainPage = new MainPage(driver);
        mainPage.loginButton.click();
        loginPageEmail = new LoginPageEmail(driver);
        loginPageEmail.emailField.sendKeys(Configuration.WORDPRESS_EMAIL);
        loginPageEmail.waitForElementToBeClickable(loginPageEmail.continueButton, 15);
        loginPageEmail.continueButton.click();
        LoginPasswordPage loginPasswordPage = new LoginPasswordPage(driver);
        loginPasswordPage.password.sendKeys(Configuration.WORDPRESS_PASSWORD);
        loginPasswordPage.logInButton.click();
        MainLogedPage mainLogedPage = new MainLogedPage(driver);
        mainLogedPage.waitForVisibilityOfElement(mainLogedPage.avatarIcon, 15);
        mainLogedPage.isContentPresent();
    }


}
