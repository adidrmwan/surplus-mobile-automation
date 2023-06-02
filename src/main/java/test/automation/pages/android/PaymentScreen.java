package test.automation.pages.android;

import io.appium.java_client.MobileBy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;
import test.automation.pageobject.AndroidPageObject;

@Component("test.automation.pages.android.PaymentScreen")
public class PaymentScreen extends AndroidPageObject {
    private By title() {
        return MobileBy.xpath("//android.view.View[@text='Pembayaran']");
    }

    private By paymentMethod(String value) {
        return MobileBy.xpath("//android.widget.TextView[@text='"+value+"']/parent::android.view.ViewGroup[@content-desc=\"PaymentOption\"]");
    }

    private By ovoPhoneField() {
        return MobileBy.xpath("//android.widget.EditText[@content-desc=\"OVOPhoneInput\"]");
    }

    private By submitOrderButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"SubmitOrderButton\"]");
    }

    private By grandTotalPayment() {
        return MobileBy.xpath("//android.widget.TextView[@content-desc=\"GrandTotal\"]");
    }

    public void isOnPembarayanScreen() {
        Assert.assertTrue(waitUntilVisible(title()).isDisplayed());
    }

    public void selectPaymentMethod(String type, String number) {
        swipeUpIntoElement(paymentMethod(type));
        onClick(paymentMethod(type));
        if (type.equals("OVO")) onType(ovoPhoneField(), number);
    }

    public void clickSubmitOrderButton() {
        onClick(submitOrderButton());
    }

    public String getGrandTotalPayment() {
        String total = waitUntilVisible(grandTotalPayment()).getText();
        total = total.replaceAll("Rp ", "");
        return total;
    }

    public boolean isBayarButtonEnabled() {
        return waitUntilVisible(submitOrderButton()).isEnabled();
    }
}
