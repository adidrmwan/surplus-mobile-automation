package test.automation.stepdefinitions.android;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import test.automation.pages.android.HomeScreen;
import test.automation.pages.android.LoginScreen;
import test.automation.pages.android.WelcomeScreen;
import test.automation.properties.UserProperties;

public class LoginSteps {
    @Autowired
    LoginScreen login;

    @Autowired
    WelcomeScreen welcome;

    @Autowired
    HomeScreen homeScreen;

    @Autowired
    UserProperties userProperties;

    @Given("user on login screen")
    public void userOnLoginScreen() {
        welcome.isOnWelcomeScreen();
        welcome.closePromoBanner();
        welcome.tapLoginButton();
        login.isOnLoginScreen();
    }

    @When("user input valid email on email field")
    public void userInputNumberOnPhoneNumberField() {
        login.inputEmail(userProperties.getEmail());
    }

    @And("user input valid password on password field")
    public void userInputOnPasswordField() {
        login.inputPassword(userProperties.getPassword());
    }

    @And("user click submit button")
    public void userClickSubmitButton() {
        login.tapSubmitButton();
    }

    @Then("user on home screen")
    public void userOnHomeScreen() {
        homeScreen.closeJaminanBanner();
        homeScreen.isOnHomeScreen();
    }

    @Given("user success login")
    public void userSuccessLogin() {
        welcome.isOnWelcomeScreen();
        welcome.closePromoBanner();
        welcome.tapLoginButton();
        login.isOnLoginScreen();
        login.inputEmail(userProperties.getEmail());
        login.inputPassword(userProperties.getPassword());
        login.tapSubmitButton();
    }
}
