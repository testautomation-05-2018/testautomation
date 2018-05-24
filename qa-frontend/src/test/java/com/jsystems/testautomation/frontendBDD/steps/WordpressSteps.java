package com.jsystems.testautomation.frontendBDD.steps;

import com.jsystems.testautomation.Configuration;
import com.jsystems.testautomation.frontendBDD.page.LoginPageEmail;
import com.jsystems.testautomation.frontendBDD.page.LoginPasswordPage;
import com.jsystems.testautomation.frontendBDD.page.MainLogedPage;
import com.jsystems.testautomation.frontendBDD.page.MainPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordpressSteps extends BaseSteps {

    MainPage mainPage;
    LoginPageEmail loginPageEmail;
    LoginPasswordPage loginPasswordPage;
    MainLogedPage mainLogedPage;

    public WordpressSteps(StepsConfig config) {

        super(config);
        try {
            driver = config.setUp();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(config.id);
        }
    }

    @Given("^User is on wordpress website \"(.*)\"$")
    public void userIsOnWordpressWebsite(String website) {
        driver.get(Configuration.WORLDPRESS_BASE_URL);
        mainPage = new MainPage(driver);
    }

    @When("^User clicks to login button$")
    public void userClicksToLoginButton() throws Throwable {
        mainPage.loginButton.click();
    }

    @Then("^Email login page is displayed$")
    public void emailLoginPageIsDisplayed() throws Throwable {
        loginPageEmail = new LoginPageEmail(driver);
        loginPageEmail.emailField.isDisplayed();
    }

    @When("^User enters email and clicks continue button$")
    public void userEntersEmailAndClicksContinueButton() throws Throwable {
        loginPageEmail.emailField.sendKeys(Configuration.WORDPRESS_EMAIL);
        loginPageEmail.continueButton.click();
    }

    @Then("^Password login page is displayed$")
    public void passwordLoginPageIsDisplayed() throws Throwable {
        loginPasswordPage = new LoginPasswordPage(driver);
        assertTrue(loginPasswordPage.password.isDisplayed());
    }

    @When("^User enters password and press LogIn button$")
    public void userEntersPasswordAndPressLogInButton() throws Throwable {
        loginPasswordPage.password.sendKeys(Configuration.WORDPRESS_PASSWORD);
        loginPasswordPage.logInButton.click();
    }

    @Then("^Main loged page is displayed$")
    public void mainLogedPageIsDisplayed() throws Throwable {
        mainLogedPage = new MainLogedPage(driver);
        mainLogedPage.avatarIcon.isDisplayed();
    }
}
