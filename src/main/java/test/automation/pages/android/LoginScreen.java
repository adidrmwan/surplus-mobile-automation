package test.automation.pages.android;

import io.appium.java_client.MobileBy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;
import test.automation.pageobject.AndroidPageObject;

@Component("test.automation.pages.android.LoginScreen")
public class LoginScreen extends AndroidPageObject {

    private By title() {
        return MobileBy.xpath("(//android.widget.TextView[@text= 'Masuk'])[1]");
    }

    private By emailField() {return MobileBy.xpath("//android.widget.EditText[@content-desc='LoginEmailInput']"); }

    private By passwordField() {return MobileBy.xpath("//android.widget.EditText[@content-desc='LoginPasswordInput']"); }

    private By submitButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc='LoginSubmitButton']");
    }

    private By resetPasswordButton() {
        return MobileBy.id("btnForgotPassword");
    }

    private By errorMessagePhoneNumber() {
        return MobileBy.id("tvPhoneNumberError");
    }

    private By errorMessagePassword() {
        return MobileBy.id("tvPasswordError");
    }

    public void isOnLoginScreen(){
        Assert.assertTrue(waitUntilVisible(title()).isDisplayed());
    }

    public void inputEmail(String email) {
        onType(emailField(), email);
    }

    public void inputPassword(String password) {
        onType(passwordField(), password);
    }

    public void tapSubmitButton(){
        onClick(submitButton());
    }

    public void tapResetPasswordButton() {
        onClick(resetPasswordButton());
    }

    public String isErrorMessagePhoneNumberEqualWith(String message) {
        return waitUntilVisible(errorMessagePhoneNumber()).getText();
    }

    public String isErrorMessagePasswordEqualWith(String message) {
        return waitUntilVisible(errorMessagePassword()).getText();
    }
}
