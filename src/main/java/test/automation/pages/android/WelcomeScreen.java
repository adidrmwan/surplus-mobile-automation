package test.automation.pages.android;

import io.appium.java_client.MobileBy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;
import test.automation.pageobject.BasePageObject;

@Component("test.automation.pages.android.WelcomeScreen")
public class WelcomeScreen extends BasePageObject {
    private By welcomeTxt() {
        return MobileBy.xpath("//android.widget.TextView[@text= 'Selamat datang di Surplus']");
    }

    private By loginButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"LoginButton\"]");
    }

    private By registerButton() { return MobileBy.id("RegisterButton"); }

    private By promoBanner() {
        return MobileBy.xpath("//android.widget.Image[@resource-id='img-invisible-fd8e2d0f-7388-4e14-800a-f14eb0fc33cd']");
    }

    private By closePromoButton() {
        return MobileBy.xpath("//android.view.View[@resource-id='aa3e5c07-e6aa-49b3-bfa3-dfaef64e84b2']");
    }

    public void isOnWelcomeScreen() {
        Assert.assertTrue(waitUntilVisible(welcomeTxt()).isDisplayed());
    }

    public void tapLoginButton(){
        onClick(loginButton());
    }

    public void tapRegisterButton(){
        onClick(registerButton());
    }

    public void  closePromoBanner() {
        boolean elem = isElementDisplayed(promoBanner(), 5);
        if (elem == true) {
            onClick(closePromoButton());
        }
    }
}
